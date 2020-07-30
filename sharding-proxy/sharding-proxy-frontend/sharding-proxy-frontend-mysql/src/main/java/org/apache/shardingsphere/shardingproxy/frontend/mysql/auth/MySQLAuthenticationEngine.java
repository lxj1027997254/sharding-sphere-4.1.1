/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingproxy.frontend.mysql.auth;

import com.google.common.base.Strings;
import io.netty.channel.ChannelHandlerContext;
import org.apache.shardingsphere.database.protocol.mysql.constant.MySQLAuthenticationMethod;
import org.apache.shardingsphere.database.protocol.mysql.constant.MySQLCapabilityFlag;
import org.apache.shardingsphere.database.protocol.mysql.constant.MySQLServerErrorCode;
import org.apache.shardingsphere.database.protocol.mysql.packet.generic.MySQLErrPacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.generic.MySQLOKPacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.handshake.MySQLAuthSwitchRequestPacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.handshake.MySQLAuthSwitchResponsePacket;
import org.apache.shardingsphere.database.protocol.mysql.constant.MySQLConnectionPhase;
import org.apache.shardingsphere.database.protocol.mysql.packet.handshake.MySQLHandshakePacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.handshake.MySQLHandshakeResponse41Packet;
import org.apache.shardingsphere.database.protocol.mysql.payload.MySQLPacketPayload;
import org.apache.shardingsphere.database.protocol.payload.PacketPayload;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchemas;
import org.apache.shardingsphere.shardingproxy.frontend.ConnectionIdGenerator;
import org.apache.shardingsphere.shardingproxy.frontend.engine.AuthenticationEngine;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Optional;

/**
 * Authentication engine for MySQL.
 */
public final class MySQLAuthenticationEngine implements AuthenticationEngine {
    
    private final MySQLAuthenticationHandler authenticationHandler = new MySQLAuthenticationHandler();
    
    private MySQLConnectionPhase connectionPhase = MySQLConnectionPhase.INITIAL_HANDSHAKE;
    
    private int sequenceId;
    
    private String username;
    
    private byte[] authResponse;
    
    private String database;
    
    @Override
    public void handshake(final ChannelHandlerContext context, final BackendConnection backendConnection) {
        int connectionId = ConnectionIdGenerator.getInstance().nextId();
        backendConnection.setConnectionId(connectionId);
        connectionPhase = MySQLConnectionPhase.AUTH_PHASE_FAST_PATH;
        context.writeAndFlush(new MySQLHandshakePacket(connectionId, authenticationHandler.getAuthPluginData()));
    }
    
    @Override
    public boolean auth(final ChannelHandlerContext context, final PacketPayload payload, final BackendConnection backendConnection) {
        if (MySQLConnectionPhase.AUTH_PHASE_FAST_PATH == connectionPhase) {
            MySQLHandshakeResponse41Packet response41 = new MySQLHandshakeResponse41Packet((MySQLPacketPayload) payload);
            username = response41.getUsername();
            authResponse = response41.getAuthResponse();
            database = response41.getDatabase();
            sequenceId = response41.getSequenceId();
            if (!Strings.isNullOrEmpty(database) && !LogicSchemas.getInstance().schemaExists(database)) {
                context.writeAndFlush(new MySQLErrPacket(++sequenceId, MySQLServerErrorCode.ER_BAD_DB_ERROR, database));
                return false;
            }
            if (0 != (response41.getCapabilityFlags() & MySQLCapabilityFlag.CLIENT_PLUGIN_AUTH.getValue())
                && !MySQLAuthenticationMethod.SECURE_PASSWORD_AUTHENTICATION.getMethodName().equals(response41.getAuthPluginName())) {
                connectionPhase = MySQLConnectionPhase.AUTHENTICATION_METHOD_MISMATCH;
                context.writeAndFlush(new MySQLAuthSwitchRequestPacket(++sequenceId,
                    MySQLAuthenticationMethod.SECURE_PASSWORD_AUTHENTICATION.getMethodName(), authenticationHandler.getAuthPluginData()));
                return false;
            }
        } else if (MySQLConnectionPhase.AUTHENTICATION_METHOD_MISMATCH == connectionPhase) {
            MySQLAuthSwitchResponsePacket authSwitchResponsePacket = new MySQLAuthSwitchResponsePacket((MySQLPacketPayload) payload);
            sequenceId = authSwitchResponsePacket.getSequenceId();
            authResponse = authSwitchResponsePacket.getAuthPluginResponse();
        }
        Optional<MySQLServerErrorCode> errorCode = authenticationHandler.login(username, authResponse, database);
        if (errorCode.isPresent()) {
            context.writeAndFlush(getMySQLErrPacket(errorCode.get(), context));
        } else {
            backendConnection.setCurrentSchema(database);
            backendConnection.setUserName(username);
            context.writeAndFlush(new MySQLOKPacket(++sequenceId));
        }
        return true;
    }
    
    private MySQLErrPacket getMySQLErrPacket(final MySQLServerErrorCode errorCode, final ChannelHandlerContext context) {
        if (MySQLServerErrorCode.ER_DBACCESS_DENIED_ERROR == errorCode) {
            return new MySQLErrPacket(++sequenceId, MySQLServerErrorCode.ER_DBACCESS_DENIED_ERROR, username, getHostAddress(context), database);
        } else {
            return new MySQLErrPacket(++sequenceId, MySQLServerErrorCode.ER_ACCESS_DENIED_ERROR, username, getHostAddress(context),
                0 == authResponse.length ? "NO" : "YES");
        }
    }
    
    private String getHostAddress(final ChannelHandlerContext context) {
        SocketAddress socketAddress = context.channel().remoteAddress();
        return socketAddress instanceof InetSocketAddress ? ((InetSocketAddress) socketAddress).getAddress().getHostAddress() : socketAddress.toString();
    }
}

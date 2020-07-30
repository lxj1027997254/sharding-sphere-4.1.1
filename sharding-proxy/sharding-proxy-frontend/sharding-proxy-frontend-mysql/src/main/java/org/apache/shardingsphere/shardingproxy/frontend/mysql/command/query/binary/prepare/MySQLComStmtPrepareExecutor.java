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

package org.apache.shardingsphere.shardingproxy.frontend.mysql.command.query.binary.prepare;

import org.apache.shardingsphere.database.protocol.mysql.constant.MySQLColumnType;
import org.apache.shardingsphere.database.protocol.mysql.constant.MySQLServerErrorCode;
import org.apache.shardingsphere.database.protocol.mysql.packet.command.query.MySQLColumnDefinition41Packet;
import org.apache.shardingsphere.database.protocol.mysql.packet.command.query.binary.MySQLBinaryStatementRegistry;
import org.apache.shardingsphere.database.protocol.mysql.packet.command.query.binary.prepare.MySQLComStmtPrepareOKPacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.command.query.binary.prepare.MySQLComStmtPreparePacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.generic.MySQLEofPacket;
import org.apache.shardingsphere.database.protocol.mysql.packet.generic.MySQLErrPacket;
import org.apache.shardingsphere.database.protocol.packet.DatabasePacket;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchema;
import org.apache.shardingsphere.shardingproxy.frontend.api.CommandExecutor;
import org.apache.shardingsphere.sql.parser.sql.statement.SQLStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dml.SelectStatement;

import java.util.Collection;
import java.util.LinkedList;

/**
 * COM_STMT_PREPARE command executor for MySQL.
 */
public final class MySQLComStmtPrepareExecutor implements CommandExecutor {
    
    private static final MySQLBinaryStatementRegistry PREPARED_STATEMENT_REGISTRY = MySQLBinaryStatementRegistry.getInstance();
    
    private final MySQLComStmtPreparePacket packet;
    
    private final LogicSchema logicSchema;
    
    public MySQLComStmtPrepareExecutor(final MySQLComStmtPreparePacket packet, final BackendConnection backendConnection) {
        this.packet = packet;
        logicSchema = backendConnection.getLogicSchema();
    }
    
    private int getColumnsCount(final SQLStatement sqlStatement) {
        return sqlStatement instanceof SelectStatement ? ((SelectStatement) sqlStatement).getProjections().getProjections().size() : 0;
    }
    
    @Override
    public Collection<DatabasePacket> execute() {
        Collection<DatabasePacket> result = new LinkedList<>();
        int currentSequenceId = 0;
        SQLStatement sqlStatement = logicSchema.getSqlParserEngine().parse(packet.getSql(), true);
        if (!MySQLComStmtPrepareChecker.isStatementAllowed(sqlStatement)) {
            result.add(new MySQLErrPacket(++currentSequenceId, MySQLServerErrorCode.ER_UNSUPPORTED_PS));
            return result;
        }
        int parametersCount = sqlStatement.getParameterCount();
        int columnsCount = getColumnsCount(sqlStatement);
        result.add(new MySQLComStmtPrepareOKPacket(++currentSequenceId, PREPARED_STATEMENT_REGISTRY.register(packet.getSql(), parametersCount), columnsCount, parametersCount, 0));
        if (parametersCount > 0) {
            for (int i = 0; i < parametersCount; i++) {
                result.add(new MySQLColumnDefinition41Packet(++currentSequenceId, "", "", "", "?", "", 0, MySQLColumnType.MYSQL_TYPE_VAR_STRING, 0));
            }
            result.add(new MySQLEofPacket(++currentSequenceId));
        }
        if (columnsCount > 0) {
            for (int i = 0; i < columnsCount; i++) {
                result.add(new MySQLColumnDefinition41Packet(++currentSequenceId, "", "", "", "", "", 0, MySQLColumnType.MYSQL_TYPE_VAR_STRING, 0));
            }
            result.add(new MySQLEofPacket(++currentSequenceId));
        }
        return result;
    }
}

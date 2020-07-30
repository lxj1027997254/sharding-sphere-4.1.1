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

package org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.text;

import lombok.Getter;
import org.apache.shardingsphere.database.protocol.packet.DatabasePacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.PostgreSQLPacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.command.query.PostgreSQLColumnDescription;
import org.apache.shardingsphere.database.protocol.postgresql.packet.command.query.PostgreSQLRowDescriptionPacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.command.query.text.PostgreSQLComQueryPacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.command.query.text.PostgreSQLDataRowPacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.generic.PostgreSQLCommandCompletePacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.generic.PostgreSQLErrorResponsePacket;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryHeader;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.update.UpdateResponse;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandler;
import org.apache.shardingsphere.shardingproxy.backend.text.TextProtocolBackendHandlerFactory;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;
import org.apache.shardingsphere.shardingproxy.frontend.api.QueryCommandExecutor;
import org.apache.shardingsphere.shardingproxy.frontend.postgresql.PostgreSQLErrPacketFactory;
import org.apache.shardingsphere.underlying.common.database.type.DatabaseTypes;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Command query executor for PostgreSQL.
 */
public final class PostgreSQLComQueryExecutor implements QueryCommandExecutor {
    
    private final TextProtocolBackendHandler textProtocolBackendHandler;
    
    private volatile boolean isQuery;
    
    @Getter
    private volatile boolean isUpdateResponse;
    
    @Getter
    private volatile boolean isErrorResponse;
    
    public PostgreSQLComQueryExecutor(final PostgreSQLComQueryPacket comQueryPacket, final BackendConnection backendConnection) {
        textProtocolBackendHandler = TextProtocolBackendHandlerFactory.newInstance(DatabaseTypes.getActualDatabaseType("PostgreSQL"), comQueryPacket.getSql(), backendConnection);
    }
    
    @Override
    public Collection<DatabasePacket> execute() {
        if (ShardingProxyContext.getInstance().isCircuitBreak()) {
            return Collections.singletonList(new PostgreSQLErrorResponsePacket());
        }
        BackendResponse backendResponse = textProtocolBackendHandler.execute();
        if (backendResponse instanceof ErrorResponse) {
            isErrorResponse = true;
            return Collections.singletonList(createErrorPacket((ErrorResponse) backendResponse));
        }
        if (backendResponse instanceof UpdateResponse) {
            isUpdateResponse = true;
            return Collections.singletonList(createUpdatePacket((UpdateResponse) backendResponse));
        }
        Optional<PostgreSQLRowDescriptionPacket> result = createQueryPacket((QueryResponse) backendResponse);
        return result.<List<DatabasePacket>>map(Collections::singletonList).orElseGet(Collections::emptyList);
    }
    
    private PostgreSQLErrorResponsePacket createErrorPacket(final ErrorResponse errorResponse) {
        return PostgreSQLErrPacketFactory.newInstance(errorResponse.getCause());
    }
    
    private PostgreSQLCommandCompletePacket createUpdatePacket(final UpdateResponse updateResponse) {
        return new PostgreSQLCommandCompletePacket(updateResponse.getType(), updateResponse.getUpdateCount());
    }
    
    private Optional<PostgreSQLRowDescriptionPacket> createQueryPacket(final QueryResponse queryResponse) {
        List<PostgreSQLColumnDescription> columnDescriptions = getPostgreSQLColumnDescriptions(queryResponse);
        isQuery = !columnDescriptions.isEmpty();
        if (columnDescriptions.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(new PostgreSQLRowDescriptionPacket(columnDescriptions.size(), columnDescriptions));
    }
    
    private List<PostgreSQLColumnDescription> getPostgreSQLColumnDescriptions(final QueryResponse queryResponse) {
        List<PostgreSQLColumnDescription> result = new LinkedList<>();
        int columnIndex = 0;
        for (QueryHeader each : queryResponse.getQueryHeaders()) {
            result.add(new PostgreSQLColumnDescription(each.getColumnName(), ++columnIndex, each.getColumnType(), each.getColumnLength()));
        }
        return result;
    }
    
    @Override
    public boolean isQuery() {
        return isQuery;
    }
    
    @Override
    public boolean next() throws SQLException {
        return textProtocolBackendHandler.next();
    }
    
    @Override
    public PostgreSQLPacket getQueryData() throws SQLException {
        return new PostgreSQLDataRowPacket(textProtocolBackendHandler.getQueryData().getData());
    }
}

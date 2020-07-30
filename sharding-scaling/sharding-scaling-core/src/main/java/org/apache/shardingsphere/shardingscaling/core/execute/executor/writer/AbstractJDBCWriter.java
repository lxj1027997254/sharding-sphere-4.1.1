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

package org.apache.shardingsphere.shardingscaling.core.execute.executor.writer;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.shardingscaling.core.config.RdbmsConfiguration;
import org.apache.shardingsphere.shardingscaling.core.exception.SyncTaskExecuteException;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.AbstractSyncExecutor;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.channel.Channel;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.Column;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.DataRecord;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.FinishedRecord;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.Record;
import org.apache.shardingsphere.shardingscaling.core.datasource.DataSourceManager;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.RecordUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * Abstract JDBC writer implementation.
 */
@Slf4j
public abstract class AbstractJDBCWriter extends AbstractSyncExecutor implements Writer {
    
    private final RdbmsConfiguration rdbmsConfiguration;
    
    private final DataSourceManager dataSourceManager;
    
    private final AbstractSqlBuilder sqlBuilder;
    
    @Setter
    private Channel channel;
    
    public AbstractJDBCWriter(final RdbmsConfiguration rdbmsConfiguration, final DataSourceManager dataSourceManager) {
        this.rdbmsConfiguration = rdbmsConfiguration;
        this.dataSourceManager = dataSourceManager;
        sqlBuilder = createSqlBuilder();
    }
    
    /**
     * Create sql builder.
     *
     * @return sql builder
     */
    protected abstract AbstractSqlBuilder createSqlBuilder();
    
    @Override
    public final void run() {
        start();
        write();
    }
    
    @Override
    public final void write() {
        try {
            while (isRunning()) {
                List<Record> records = channel.fetchRecords(100, 3);
                if (null != records && records.size() > 0) {
                    flush(dataSourceManager.getDataSource(rdbmsConfiguration.getDataSourceConfiguration()), records);
                    if (FinishedRecord.class.equals(records.get(records.size() - 1).getClass())) {
                        channel.ack();
                        break;
                    }
                }
                channel.ack();
            }
        } catch (SQLException ex) {
            throw new SyncTaskExecuteException(ex);
        }
    }
    
    private void flush(final DataSource dataSource, final List<Record> buffer) throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            connection.setAutoCommit(false);
            for (Record record : buffer) {
                if (DataRecord.class.equals(record.getClass())) {
                    DataRecord dataRecord = (DataRecord) record;
                    switch (dataRecord.getType()) {
                        case "BOOTSTRAP-INSERT":
                        case "INSERT":
                            executeInsert(connection, dataRecord);
                            break;
                        case "UPDATE":
                            executeUpdate(connection, dataRecord);
                            break;
                        case "DELETE":
                            executeDelete(connection, dataRecord);
                            break;
                        default:
                            break;
                    }
                }
            }
            connection.commit();
        }
    }
    
    private void executeInsert(final Connection connection, final DataRecord record) throws SQLException {
        String insertSql = sqlBuilder.buildInsertSQL(record);
        PreparedStatement ps = connection.prepareStatement(insertSql);
        ps.setQueryTimeout(30);
        try {
            for (int i = 0; i < record.getColumnCount(); i++) {
                ps.setObject(i + 1, record.getColumn(i).getValue());
            }
            ps.execute();
        } catch (SQLIntegrityConstraintViolationException ignored) {
        }
    }
    
    private void executeUpdate(final Connection connection, final DataRecord record) throws SQLException {
        List<Column> values = new ArrayList<>();
        values.addAll(RecordUtil.extractUpdatedColumns(record));
        values.addAll(RecordUtil.extractPrimaryColumns(record));
        String updateSql = sqlBuilder.buildUpdateSQL(record);
        PreparedStatement ps = connection.prepareStatement(updateSql);
        for (int i = 0; i < values.size(); i++) {
            ps.setObject(i + 1, values.get(i).getValue());
        }
        ps.execute();
    }
    
    private void executeDelete(final Connection connection, final DataRecord record) throws SQLException {
        String deleteSql = sqlBuilder.buildDeleteSQL(record);
        List<Column> primaryKeys = RecordUtil.extractPrimaryColumns(record);
        PreparedStatement ps = connection.prepareStatement(deleteSql);
        for (int i = 0; i < primaryKeys.size(); i++) {
            ps.setObject(i + 1, primaryKeys.get(i).getValue());
        }
        ps.execute();
    }
}

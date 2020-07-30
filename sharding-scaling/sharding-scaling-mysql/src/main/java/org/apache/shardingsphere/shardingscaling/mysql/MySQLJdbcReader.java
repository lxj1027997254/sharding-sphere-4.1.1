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

package org.apache.shardingsphere.shardingscaling.mysql;

import org.apache.shardingsphere.shardingscaling.core.config.JDBCDataSourceConfiguration;
import org.apache.shardingsphere.shardingscaling.core.config.RdbmsConfiguration;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.reader.AbstractJDBCReader;
import org.apache.shardingsphere.shardingscaling.core.metadata.JdbcUri;
import org.apache.shardingsphere.shardingscaling.core.datasource.DataSourceManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;

/**
 * MySQL JDBC Reader.
 */
public final class MySQLJdbcReader extends AbstractJDBCReader {
    
    public MySQLJdbcReader(final RdbmsConfiguration rdbmsConfiguration, final DataSourceManager dataSourceManager) {
        super(rdbmsConfiguration, dataSourceManager);
        JDBCDataSourceConfiguration jdbcDataSourceConfiguration = (JDBCDataSourceConfiguration) getRdbmsConfiguration().getDataSourceConfiguration();
        jdbcDataSourceConfiguration.setJdbcUrl(fixMySQLUrl(jdbcDataSourceConfiguration.getJdbcUrl()));
    }
    
    private String formatMySQLParams(final Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(entry.getKey());
            if (null != entry.getValue()) {
                result.append("=").append(entry.getValue());
            }
            result.append("&");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
    
    private String fixMySQLUrl(final String url) {
        JdbcUri uri = new JdbcUri(url);
        return String.format("jdbc:%s://%s/%s?%s", uri.getScheme(), uri.getHost(), uri.getDatabase(), fixMySQLParams(uri.getParameters()));
    }
    
    private String fixMySQLParams(final Map<String, String> parameters) {
        if (!parameters.containsKey("yearIsDateType")) {
            parameters.put("yearIsDateType", "false");
        }
        return formatMySQLParams(parameters);
    }
    
    @Override
    public Object readValue(final ResultSet resultSet, final int index) throws SQLException {
        if (isDateTimeValue(resultSet.getMetaData().getColumnType(index))) {
            return resultSet.getString(index);
        } else {
            return resultSet.getObject(index);
        }
    }
    
    private boolean isDateTimeValue(final int columnType) {
        return Types.TIME == columnType || Types.DATE == columnType || Types.TIMESTAMP == columnType;
    }
    
    @Override
    protected PreparedStatement createPreparedStatement(final Connection conn, final String sql) throws SQLException {
        PreparedStatement result = conn.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        result.setFetchSize(Integer.MIN_VALUE);
        return result;
    }
}

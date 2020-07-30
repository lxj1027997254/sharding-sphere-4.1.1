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

package org.apache.shardingsphere.shardingscaling.core.execute.executor.reader;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.apache.shardingsphere.shardingscaling.core.config.RdbmsConfiguration;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.position.LogPosition;
import org.apache.shardingsphere.shardingscaling.core.spi.ScalingEntry;
import org.apache.shardingsphere.shardingscaling.core.spi.ScalingEntryLoader;
import org.apache.shardingsphere.shardingscaling.core.datasource.DataSourceManager;

/**
 * Reader factory.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ReaderFactory {
    
    /**
     * New instance of JDBC reader.
     *
     * @param rdbmsConfiguration rdbms configuration
     * @param dataSourceManager data source factory
     * @return JDBC reader
     */
    @SneakyThrows
    public static JDBCReader newInstanceJdbcReader(final RdbmsConfiguration rdbmsConfiguration, final DataSourceManager dataSourceManager) {
        return newInstanceJdbcReader(rdbmsConfiguration.getDataSourceConfiguration().getDatabaseType().getName(), rdbmsConfiguration, dataSourceManager);
    }
    
    /**
     * New instance of JDBC reader.
     *
     * @param databaseType database type
     * @param rdbmsConfiguration rdbms configuration
     * @param dataSourceManager data source factory
     * @return JDBC reader
     */
    @SneakyThrows
    public static JDBCReader newInstanceJdbcReader(final String databaseType, final RdbmsConfiguration rdbmsConfiguration, final DataSourceManager dataSourceManager) {
        ScalingEntry scalingEntry = ScalingEntryLoader.getScalingEntryByDatabaseType(databaseType);
        return scalingEntry.getJdbcReaderClass().getConstructor(RdbmsConfiguration.class, DataSourceManager.class).newInstance(rdbmsConfiguration, dataSourceManager);
    }
    
    /**
     * New instance of log reader.
     *
     * @param rdbmsConfiguration rdbms configuration
     * @param position log position
     * @return log reader
     */
    @SneakyThrows
    public static LogReader newInstanceLogReader(final RdbmsConfiguration rdbmsConfiguration, final LogPosition position) {
        return newInstanceLogReader(rdbmsConfiguration.getDataSourceConfiguration().getDatabaseType().getName(), rdbmsConfiguration, position);
    }
    
    /**
     * New instance of log reader.
     *
     * @param databaseType database type
     * @param rdbmsConfiguration rdbms configuration
     * @param position log position
     * @return log reader
     */
    @SneakyThrows
    public static LogReader newInstanceLogReader(final String databaseType, final RdbmsConfiguration rdbmsConfiguration, final LogPosition position) {
        ScalingEntry scalingEntry = ScalingEntryLoader.getScalingEntryByDatabaseType(databaseType);
        return scalingEntry.getLogReaderClass().getConstructor(RdbmsConfiguration.class, LogPosition.class).newInstance(rdbmsConfiguration, position);
    }
}

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

package org.apache.shardingsphere.shardingjdbc.jdbc.core.context;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.spi.database.type.DatabaseType;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaData;
import org.apache.shardingsphere.underlying.common.config.DatabaseAccessConfiguration;
import org.apache.shardingsphere.underlying.common.metadata.ShardingSphereMetaData;
import org.apache.shardingsphere.underlying.common.metadata.datasource.DataSourceMetas;
import org.apache.shardingsphere.underlying.common.rule.BaseRule;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Runtime context for single data source.
 *
 * @param <T> type of rule
 */
@Getter
@Slf4j(topic = "ShardingSphere-metadata")
public abstract class SingleDataSourceRuntimeContext<T extends BaseRule> extends AbstractRuntimeContext<T> {
    
    private final ShardingSphereMetaData metaData;
    
    protected SingleDataSourceRuntimeContext(final DataSource dataSource, final T rule, final Properties props, final DatabaseType databaseType) throws SQLException {
        super(rule, props, databaseType);
        metaData = createMetaData(dataSource, databaseType);
    }
    
    private ShardingSphereMetaData createMetaData(final DataSource dataSource, final DatabaseType databaseType) throws SQLException {
        long start = System.currentTimeMillis();
        DataSourceMetas dataSourceMetas = new DataSourceMetas(databaseType, getDatabaseAccessConfigurationMap(dataSource));
        SchemaMetaData schemaMetaData = loadSchemaMetaData(dataSource);
        ShardingSphereMetaData result = new ShardingSphereMetaData(dataSourceMetas, schemaMetaData);
        log.info("Meta data load finished, cost {} milliseconds.", System.currentTimeMillis() - start);
        return result;
    }
    
    private Map<String, DatabaseAccessConfiguration> getDatabaseAccessConfigurationMap(final DataSource dataSource) throws SQLException {
        Map<String, DatabaseAccessConfiguration> result = new LinkedHashMap<>(1, 1);
        try (Connection connection = dataSource.getConnection()) {
            DatabaseMetaData metaData = connection.getMetaData();
            result.put("ds", new DatabaseAccessConfiguration(metaData.getURL(), metaData.getUserName(), null));
        }
        return result;
    }
    
    protected abstract SchemaMetaData loadSchemaMetaData(DataSource dataSource) throws SQLException;
}

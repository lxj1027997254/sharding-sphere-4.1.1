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
import org.apache.shardingsphere.core.metadata.ShardingMetaDataLoader;
import org.apache.shardingsphere.core.metadata.ShardingTableMetaDataDecorator;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.encrypt.metadata.EncryptTableMetaDataDecorator;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.datasource.metadata.CachedDatabaseMetaData;
import org.apache.shardingsphere.spi.database.type.DatabaseType;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaData;
import org.apache.shardingsphere.transaction.ShardingTransactionManagerEngine;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationPropertyKey;
import org.apache.shardingsphere.underlying.common.metadata.decorator.SchemaMetaDataDecorator;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

/**
 * Runtime context for sharding.
 */
@Getter
public final class ShardingRuntimeContext extends MultipleDataSourcesRuntimeContext<ShardingRule> {
    
    private final CachedDatabaseMetaData cachedDatabaseMetaData;
    
    private final ShardingTransactionManagerEngine shardingTransactionManagerEngine;
    
    public ShardingRuntimeContext(final Map<String, DataSource> dataSourceMap, final ShardingRule shardingRule, final Properties props, final DatabaseType databaseType) throws SQLException {
        super(dataSourceMap, shardingRule, props, databaseType);
        cachedDatabaseMetaData = createCachedDatabaseMetaData(dataSourceMap);
        shardingTransactionManagerEngine = new ShardingTransactionManagerEngine();
        shardingTransactionManagerEngine.init(databaseType, dataSourceMap);
    }
    
    private CachedDatabaseMetaData createCachedDatabaseMetaData(final Map<String, DataSource> dataSourceMap) throws SQLException {
        try (Connection connection = dataSourceMap.values().iterator().next().getConnection()) {
            return new CachedDatabaseMetaData(connection.getMetaData());
        }
    }
    
    @Override
    protected SchemaMetaData loadSchemaMetaData(final Map<String, DataSource> dataSourceMap) throws SQLException {
        int maxConnectionsSizePerQuery = getProperties().<Integer>getValue(ConfigurationPropertyKey.MAX_CONNECTIONS_SIZE_PER_QUERY);
        boolean isCheckingMetaData = getProperties().<Boolean>getValue(ConfigurationPropertyKey.CHECK_TABLE_METADATA_ENABLED);
        SchemaMetaData result = new ShardingMetaDataLoader(dataSourceMap, getRule(), maxConnectionsSizePerQuery, isCheckingMetaData).load(getDatabaseType());
        result = SchemaMetaDataDecorator.decorate(result, getRule(), new ShardingTableMetaDataDecorator());
        if (!getRule().getEncryptRule().getEncryptTableNames().isEmpty()) {
            result = SchemaMetaDataDecorator.decorate(result, getRule().getEncryptRule(), new EncryptTableMetaDataDecorator());
        }
        return result;
    }
    
    @Override
    public void close() throws Exception {
        shardingTransactionManagerEngine.close();
        super.close();
    }
}

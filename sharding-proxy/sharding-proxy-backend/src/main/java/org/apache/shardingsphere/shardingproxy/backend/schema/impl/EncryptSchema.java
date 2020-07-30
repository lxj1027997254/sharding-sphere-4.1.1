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

package org.apache.shardingsphere.shardingproxy.backend.schema.impl;

import com.google.common.eventbus.Subscribe;
import lombok.Getter;
import lombok.SneakyThrows;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.core.log.ConfigurationLogger;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.encrypt.api.EncryptRuleConfiguration;
import org.apache.shardingsphere.encrypt.metadata.EncryptTableMetaDataDecorator;
import org.apache.shardingsphere.encrypt.rule.EncryptRule;
import org.apache.shardingsphere.orchestration.core.common.event.EncryptRuleChangedEvent;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchema;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchemas;
import org.apache.shardingsphere.shardingproxy.config.yaml.YamlDataSourceParameter;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaData;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaDataLoader;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationPropertyKey;
import org.apache.shardingsphere.underlying.common.metadata.ShardingSphereMetaData;
import org.apache.shardingsphere.underlying.common.metadata.datasource.DataSourceMetas;
import org.apache.shardingsphere.underlying.common.metadata.decorator.SchemaMetaDataDecorator;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Map;

/**
 * Encrypt schema.
 */
@Getter
public final class EncryptSchema extends LogicSchema {
    
    private final ShardingSphereMetaData metaData;
    
    private final ShardingRule shardingRule;
    
    private EncryptRule encryptRule;
    
    public EncryptSchema(final String name, final Map<String, YamlDataSourceParameter> dataSources, final EncryptRuleConfiguration encryptRuleConfiguration) throws SQLException {
        super(name, dataSources);
        encryptRule = new EncryptRule(encryptRuleConfiguration);
        shardingRule = new ShardingRule(new ShardingRuleConfiguration(), getDataSources().keySet());
        metaData = createMetaData();
    }
    
    private ShardingSphereMetaData createMetaData() throws SQLException {
        DataSourceMetas dataSourceMetas = new DataSourceMetas(LogicSchemas.getInstance().getDatabaseType(), getDatabaseAccessConfigurationMap());
        SchemaMetaData schemaMetaData = createSchemaMetaData();
        return new ShardingSphereMetaData(dataSourceMetas, schemaMetaData);
    }
    
    private SchemaMetaData createSchemaMetaData() throws SQLException {
        DataSource dataSource = getBackendDataSource().getDataSources().values().iterator().next();
        int maxConnectionsSizePerQuery = ShardingProxyContext.getInstance().getProperties().<Integer>getValue(ConfigurationPropertyKey.MAX_CONNECTIONS_SIZE_PER_QUERY);
        return SchemaMetaDataDecorator.decorate(SchemaMetaDataLoader.load(dataSource, maxConnectionsSizePerQuery,
            LogicSchemas.getInstance().getDatabaseType().getName()), encryptRule, new EncryptTableMetaDataDecorator());
    }
    
    /**
     * Renew encrypt rule.
     *
     * @param encryptRuleChangedEvent encrypt configuration changed event
     */
    @Subscribe
    @SneakyThrows
    public synchronized void renew(final EncryptRuleChangedEvent encryptRuleChangedEvent) {
        ConfigurationLogger.log(encryptRuleChangedEvent.getEncryptRuleConfiguration());
        encryptRule = new EncryptRule(encryptRuleChangedEvent.getEncryptRuleConfiguration());
    }
}

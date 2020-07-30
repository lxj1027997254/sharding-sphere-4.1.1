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

package org.apache.shardingsphere.shardingscaling.core.config.utils;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.core.yaml.config.sharding.YamlShardingRuleConfiguration;
import org.apache.shardingsphere.core.yaml.constructor.YamlRootShardingConfigurationConstructor;
import org.apache.shardingsphere.core.yaml.swapper.ShardingRuleConfigurationYamlSwapper;
import org.apache.shardingsphere.orchestration.core.configuration.DataSourceConfigurationYamlSwapper;
import org.apache.shardingsphere.orchestration.core.configuration.YamlDataSourceConfiguration;
import org.apache.shardingsphere.underlying.common.config.DataSourceConfiguration;
import org.apache.shardingsphere.underlying.common.yaml.engine.YamlEngine;

import java.util.Map;

/**
 * YAML converter for configuration.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ConfigurationYamlConverter {

    /**
     * Load data source configurations.
     *
     * @param data data
     * @return data source configurations
     */
    public static Map<String, DataSourceConfiguration> loadDataSourceConfigurations(final String data) {
        Map<String, YamlDataSourceConfiguration> result = (Map) YamlEngine.unmarshal(data);
        Preconditions.checkState(null != result && !result.isEmpty(), "No available data sources to load for orchestration.");
        return Maps.transformValues(result, new DataSourceConfigurationYamlSwapper()::swap);
    }

    /**
     * Load sharding rule configuration.
     *
     * @param data data
     * @return sharding rule configuration
     */
    public static ShardingRuleConfiguration loadShardingRuleConfiguration(final String data) {
        return new ShardingRuleConfigurationYamlSwapper().swap(YamlEngine.unmarshal(data, YamlShardingRuleConfiguration.class, new YamlRootShardingConfigurationConstructor()));
    }
}

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

package org.apache.shardingsphere.shardingproxy.util;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.shardingsphere.shardingproxy.config.yaml.YamlDataSourceParameter;
import org.apache.shardingsphere.underlying.common.config.DataSourceConfiguration;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public final class DataSourceConverterTest {
    
    @Test
    public void assertGetDataSourceParameterMap() {
        Map<String, DataSourceConfiguration> dataSourceConfigurationMap = new HashMap<>(2, 1);
        DataSourceConfiguration dataSourceConfiguration0 = new DataSourceConfiguration(HikariDataSource.class.getName());
        dataSourceConfiguration0.getProperties().put("url", "jdbc:mysql://localhost:3306/demo_ds_0");
        dataSourceConfigurationMap.put("ds_0", dataSourceConfiguration0);
        DataSourceConfiguration dataSourceConfiguration1 = new DataSourceConfiguration(HikariDataSource.class.getName());
        dataSourceConfiguration1.getProperties().put("jdbcUrl", "jdbc:mysql://localhost:3306/demo_ds_1");
        dataSourceConfigurationMap.put("ds_1", dataSourceConfiguration1);
        Map<String, YamlDataSourceParameter> actual = DataSourceConverter.getDataSourceParameterMap(dataSourceConfigurationMap);
        assertThat(actual.size(), is(2));
        assertThat(actual.get("ds_0").getUrl(), is("jdbc:mysql://localhost:3306/demo_ds_0"));
        assertThat(actual.get("ds_1").getUrl(), is("jdbc:mysql://localhost:3306/demo_ds_1"));
    }
    
    @Test
    public void assertGetDataSourceConfigurationMap() {
        Map<String, YamlDataSourceParameter> dataSourceParameterMap = new HashMap<>(2, 1);
        dataSourceParameterMap.put("ds_0", crateDataSourceParameter());
        dataSourceParameterMap.put("ds_1", crateDataSourceParameter());
        Map<String, DataSourceConfiguration> actual = DataSourceConverter.getDataSourceConfigurationMap(dataSourceParameterMap);
        assertThat(actual.size(), is(2));
        assertParameter(actual.get("ds_0"));
        assertParameter(actual.get("ds_1"));
    }
    
    private YamlDataSourceParameter crateDataSourceParameter() {
        YamlDataSourceParameter result = new YamlDataSourceParameter();
        result.setUrl("jdbc:mysql://localhost:3306/demo_ds");
        result.setUsername("root");
        result.setPassword("root");
        return result;
    }
    
    private void assertParameter(final DataSourceConfiguration actual) {
        Map<String, Object> properties = actual.getProperties();
        assertThat(properties.get("maxPoolSize"), is(50));
        assertThat(properties.get("minPoolSize"), is(1));
        assertThat(properties.get("connectionTimeout"), is(30 * 1000L));
        assertThat(properties.get("idleTimeout"), is(60 * 1000L));
        assertThat(properties.get("maxLifetime"), is(0L));
        assertThat(properties.get("maintenanceIntervalMilliseconds"), is(30 * 1000L));
        assertThat(properties.get("jdbcUrl"), is("jdbc:mysql://localhost:3306/demo_ds"));
        assertThat(properties.get("username"), is("root"));
        assertThat(properties.get("password"), is("root"));
    }
}

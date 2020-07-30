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

package org.apache.shardingsphere.sharding.route.engine.type.standard;

import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.sharding.route.engine.ShardingRouteDecorator;
import org.apache.shardingsphere.sharding.route.fixture.AbstractRoutingEngineTest;
import org.apache.shardingsphere.sql.parser.SQLParserEngine;
import org.apache.shardingsphere.sql.parser.SQLParserEngineFactory;
import org.apache.shardingsphere.sql.parser.binder.metadata.column.ColumnMetaData;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaData;
import org.apache.shardingsphere.sql.parser.binder.metadata.table.TableMetaData;
import org.apache.shardingsphere.underlying.common.config.DatabaseAccessConfiguration;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.common.database.type.DatabaseTypes;
import org.apache.shardingsphere.underlying.common.metadata.ShardingSphereMetaData;
import org.apache.shardingsphere.underlying.common.metadata.datasource.DataSourceMetas;
import org.apache.shardingsphere.underlying.route.DataNodeRouter;
import org.apache.shardingsphere.underlying.route.context.RouteContext;

import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public abstract class AbstractSQLRouteTest extends AbstractRoutingEngineTest {
    
    protected final RouteContext assertRoute(final String sql, final List<Object> parameters) {
        ShardingRule shardingRule = createAllShardingRule();
        ShardingSphereMetaData metaData = new ShardingSphereMetaData(buildDataSourceMetas(), buildSchemaMetaData());
        ConfigurationProperties properties = new ConfigurationProperties(new Properties());
        SQLParserEngine sqlParserEngine = SQLParserEngineFactory.getSQLParserEngine("MySQL");
        RouteContext routeContext = new DataNodeRouter(metaData, properties, sqlParserEngine).route(sql, parameters, false);
        ShardingRouteDecorator shardingRouteDecorator = new ShardingRouteDecorator();
        RouteContext result = shardingRouteDecorator.decorate(routeContext, metaData, shardingRule, properties);
        assertThat(result.getRouteResult().getRouteUnits().size(), is(1));
        return result;
    }
    
    private DataSourceMetas buildDataSourceMetas() {
        Map<String, DatabaseAccessConfiguration> dataSourceInfoMap = new HashMap<>();
        DatabaseAccessConfiguration mainDatabaseAccessConfiguration = new DatabaseAccessConfiguration("jdbc:mysql://127.0.0.1:3306/actual_db", "test", null);
        DatabaseAccessConfiguration databaseAccessConfiguration0 = new DatabaseAccessConfiguration("jdbc:mysql://127.0.0.1:3306/actual_db", "test", null);
        DatabaseAccessConfiguration databaseAccessConfiguration1 = new DatabaseAccessConfiguration("jdbc:mysql://127.0.0.1:3306/actual_db", "test", null);
        dataSourceInfoMap.put("main", mainDatabaseAccessConfiguration);
        dataSourceInfoMap.put("ds_0", databaseAccessConfiguration0);
        dataSourceInfoMap.put("ds_1", databaseAccessConfiguration1);
        return new DataSourceMetas(DatabaseTypes.getActualDatabaseType("MySQL"), dataSourceInfoMap);
    }
    
    private SchemaMetaData buildSchemaMetaData() {
        Map<String, TableMetaData> tableMetaDataMap = new HashMap<>(3, 1);
        tableMetaDataMap.put("t_order", new TableMetaData(Arrays.asList(new ColumnMetaData("order_id", Types.INTEGER, "int", true, false, false),
                new ColumnMetaData("user_id", Types.INTEGER, "int", false, false, false),
                new ColumnMetaData("status", Types.INTEGER, "int", false, false, false)), Collections.emptySet()));
        tableMetaDataMap.put("t_order_item", new TableMetaData(Arrays.asList(new ColumnMetaData("item_id", Types.INTEGER, "int", true, false, false),
                new ColumnMetaData("order_id", Types.INTEGER, "int", false, false, false),
                new ColumnMetaData("user_id", Types.INTEGER, "int", false, false, false),
                new ColumnMetaData("status", Types.VARCHAR, "varchar", false, false, false),
                new ColumnMetaData("c_date", Types.TIMESTAMP, "timestamp", false, false, false)), Collections.emptySet()));
        tableMetaDataMap.put("t_other", new TableMetaData(Collections.singletonList(new ColumnMetaData("order_id", Types.INTEGER, "int", true, false, false)), Collections.emptySet()));
        tableMetaDataMap.put("t_category", new TableMetaData(Collections.singletonList(new ColumnMetaData("order_id", Types.INTEGER, "int", true, false, false)), Collections.emptySet()));
        return new SchemaMetaData(tableMetaDataMap);
    }
}

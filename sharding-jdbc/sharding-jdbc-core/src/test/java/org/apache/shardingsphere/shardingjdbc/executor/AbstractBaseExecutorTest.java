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

package org.apache.shardingsphere.shardingjdbc.executor;

import lombok.AccessLevel;
import lombok.Getter;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.encrypt.rule.EncryptRule;
import org.apache.shardingsphere.encrypt.strategy.EncryptTable;
import org.apache.shardingsphere.encrypt.strategy.spi.Encryptor;
import org.apache.shardingsphere.sharding.execute.sql.execute.threadlocal.ExecutorExceptionHandler;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.connection.ShardingConnection;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.context.ShardingRuntimeContext;
import org.apache.shardingsphere.sql.parser.binder.segment.table.TablesContext;
import org.apache.shardingsphere.sql.parser.binder.statement.SQLStatementContext;
import org.apache.shardingsphere.transaction.ShardingTransactionManagerEngine;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationPropertyKey;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.common.database.type.DatabaseTypes;
import org.apache.shardingsphere.underlying.executor.engine.ExecutorEngine;
import org.junit.After;
import org.junit.Before;
import org.mockito.MockitoAnnotations;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Getter(AccessLevel.PROTECTED)
public abstract class AbstractBaseExecutorTest {
    
    private ExecutorEngine executorEngine;
    
    private ShardingConnection connection;
    
    @Before
    public void setUp() throws SQLException {
        MockitoAnnotations.initMocks(this);
        ExecutorExceptionHandler.setExceptionThrown(false);
        executorEngine = new ExecutorEngine(Runtime.getRuntime().availableProcessors());
        setConnection();
    }
    
    private void setConnection() throws SQLException {
        ShardingRuntimeContext runtimeContext = mock(ShardingRuntimeContext.class);
        when(runtimeContext.getExecutorEngine()).thenReturn(executorEngine);
        when(runtimeContext.getProperties()).thenReturn(getProperties());
        when(runtimeContext.getDatabaseType()).thenReturn(DatabaseTypes.getActualDatabaseType("H2"));
        ShardingRule shardingRule = getShardingRule();
        when(runtimeContext.getRule()).thenReturn(shardingRule);
        when(runtimeContext.getShardingTransactionManagerEngine()).thenReturn(new ShardingTransactionManagerEngine());
        DataSource dataSource = mock(DataSource.class);
        when(dataSource.getConnection()).thenReturn(mock(Connection.class));
        Map<String, DataSource> dataSourceSourceMap = new LinkedHashMap<>();
        dataSourceSourceMap.put("ds_0", dataSource);
        dataSourceSourceMap.put("ds_1", dataSource);
        connection = new ShardingConnection(dataSourceSourceMap, runtimeContext, TransactionType.LOCAL);
    }
    
    private ShardingRule getShardingRule() {
        ShardingRule shardingRule = mock(ShardingRule.class);
        when(shardingRule.getLogicTableNames(anyString())).thenReturn(Collections.emptyList());
        Encryptor encryptor = mock(Encryptor.class);
        when(encryptor.decrypt(anyString())).thenReturn("decryptValue");
        EncryptRule encryptRule = mock(EncryptRule.class);
        EncryptTable encryptTable = mock(EncryptTable.class);
        when(encryptRule.findEncryptor(anyString(), anyString())).thenReturn(Optional.of(encryptor));
        when(encryptRule.getLogicColumnOfCipher(anyString(), anyString())).thenReturn("column");
        when(encryptRule.findEncryptTable("table_x")).thenReturn(Optional.of(encryptTable));
        when(encryptTable.getCipherColumns()).thenReturn(Collections.singleton("column"));
        when(shardingRule.getEncryptRule()).thenReturn(encryptRule);
        when(shardingRule.findTableRuleByActualTable("table_x")).thenReturn(Optional.empty());
        return shardingRule;
    }

    protected final SQLStatementContext getSQLStatementContext() {
        SQLStatementContext sqlStatementContext = mock(SQLStatementContext.class);
        TablesContext tablesContext = mock(TablesContext.class);
        when(tablesContext.getTableNames()).thenReturn(Collections.singleton("table_x"));
        when(sqlStatementContext.getTablesContext()).thenReturn(tablesContext);
        return sqlStatementContext;
    }
    
    private ConfigurationProperties getProperties() {
        Properties props = new Properties();
        props.setProperty(ConfigurationPropertyKey.MAX_CONNECTIONS_SIZE_PER_QUERY.getKey(), ConfigurationPropertyKey.MAX_CONNECTIONS_SIZE_PER_QUERY.getDefaultValue());
        return new ConfigurationProperties(props);
    }
    
    @After
    public void tearDown() {
        executorEngine.close();
    }
}

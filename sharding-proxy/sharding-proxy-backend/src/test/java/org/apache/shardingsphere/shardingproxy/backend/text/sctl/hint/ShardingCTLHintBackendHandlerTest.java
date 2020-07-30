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

package org.apache.shardingsphere.shardingproxy.backend.text.sctl.hint;

import lombok.SneakyThrows;
import org.apache.shardingsphere.api.hint.HintManager;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.core.rule.TableRule;
import org.apache.shardingsphere.shardingproxy.backend.communication.jdbc.connection.BackendConnection;
import org.apache.shardingsphere.shardingproxy.backend.response.BackendResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryData;
import org.apache.shardingsphere.shardingproxy.backend.response.query.QueryResponse;
import org.apache.shardingsphere.shardingproxy.backend.response.update.UpdateResponse;
import org.apache.shardingsphere.shardingproxy.backend.schema.LogicSchema;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.InvalidShardingCTLFormatException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.exception.UnsupportedShardingCTLTypeException;
import org.apache.shardingsphere.shardingproxy.backend.text.sctl.hint.internal.HintManagerHolder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Types;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class ShardingCTLHintBackendHandlerTest {
    
    @Mock
    private BackendConnection backendConnection;
    
    @Before
    public void setUp() {
        when(backendConnection.isSupportHint()).thenReturn(true);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void assertNotSupportHint() {
        when(backendConnection.isSupportHint()).thenReturn(false);
        new ShardingCTLHintBackendHandler("", backendConnection).execute();
    }
    
    @Test
    public void assertInvalidShardingCTLFormat() {
        clearThreadLocal();
        String sql = "sctl:hint1 xx=yy";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(((ErrorResponse) shardingCTLHintBackendHandler.execute()).getCause(), instanceOf(InvalidShardingCTLFormatException.class));
    }
    
    private void clearThreadLocal() {
        HintManagerHolder.get().close();
        HintManagerHolder.remove();
    }
    
    @Test
    public void assertSetMasterOnly() {
        clearThreadLocal();
        String sql = "sctl:hint set master_only=true ";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(shardingCTLHintBackendHandler.execute(), instanceOf(UpdateResponse.class));
        assertTrue(HintManager.isMasterRouteOnly());
    }
    
    @Test
    public void assertSetDatabaseShardingValueTable() {
        clearThreadLocal();
        String sql = "sctl:hint set databaseShardingValue=100";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(shardingCTLHintBackendHandler.execute(), instanceOf(UpdateResponse.class));
        assertThat(HintManager.getDatabaseShardingValues().iterator().next().toString(), is("100"));
    }
    
    @Test
    public void assertAddDatabaseShardingValue() {
        clearThreadLocal();
        String sql = "sctl:hint addDatabaseShardingValue user=100 ";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(shardingCTLHintBackendHandler.execute(), instanceOf(UpdateResponse.class));
        assertThat(HintManager.getDatabaseShardingValues("user").iterator().next().toString(), is("100"));
    }
    
    @Test
    public void assertAddTableShardingValue() {
        clearThreadLocal();
        String sql = "sctl:hint addTableShardingValue  user=100 ";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(shardingCTLHintBackendHandler.execute(), instanceOf(UpdateResponse.class));
        assertThat(HintManager.getTableShardingValues("user").iterator().next().toString(), is("100"));
    }
    
    @Test
    public void assertClear() {
        clearThreadLocal();
        String sql = "sctl:hint clear ";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(shardingCTLHintBackendHandler.execute(), instanceOf(UpdateResponse.class));
        assertThat(HintManager.getInstance(), instanceOf(HintManager.class));
        HintManager.clear();
    }
    
    @Test
    @SneakyThrows
    public void assertShowStatus() {
        clearThreadLocal();
        String sql = "sctl:hint show status";
        ShardingCTLHintBackendHandler defaultShardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        BackendResponse backendResponse = defaultShardingCTLHintBackendHandler.execute();
        assertThat(backendResponse, instanceOf(QueryResponse.class));
        assertThat(((QueryResponse) backendResponse).getQueryHeaders().get(0).getColumnLabel(), is("master_only"));
        assertThat(((QueryResponse) backendResponse).getQueryHeaders().get(1).getColumnLabel(), is("sharding_type"));
        assertTrue(defaultShardingCTLHintBackendHandler.next());
        QueryData defaultQueryData = defaultShardingCTLHintBackendHandler.getQueryData();
        assertThat(defaultQueryData.getColumnTypes().get(0), is(Types.CHAR));
        assertThat(defaultQueryData.getColumnTypes().get(1), is(Types.CHAR));
        assertThat(defaultQueryData.getData().get(0).toString(), is("false"));
        assertThat(defaultQueryData.getData().get(1).toString(), is("databases_tables"));
        assertFalse(defaultShardingCTLHintBackendHandler.next());
        String setMasterOnlySQL = "sctl:hint set master_only=true";
        String setDatabaseOnlySQL = "sctl:hint set DatabaseShardingValue=100";
        new ShardingCTLHintBackendHandler(setMasterOnlySQL, backendConnection).execute();
        new ShardingCTLHintBackendHandler(setDatabaseOnlySQL, backendConnection).execute();
        ShardingCTLHintBackendHandler updateShardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        updateShardingCTLHintBackendHandler.execute();
        assertTrue(updateShardingCTLHintBackendHandler.next());
        QueryData updateQueryData = updateShardingCTLHintBackendHandler.getQueryData();
        assertThat(updateQueryData.getData().get(0).toString(), is("true"));
        assertThat(updateQueryData.getData().get(1).toString(), is("databases_only"));
        assertFalse(updateShardingCTLHintBackendHandler.next());
    }
    
    @Test
    @SneakyThrows
    public void assertShowTableStatus() {
        clearThreadLocal();
        TableRule tableRule = mock(TableRule.class);
        ShardingRule shardingRule = mock(ShardingRule.class);
        LogicSchema logicSchema = mock(LogicSchema.class);
        when(tableRule.getLogicTable()).thenReturn("user");
        when(shardingRule.getTableRules()).thenReturn(Collections.singletonList(tableRule));
        when(logicSchema.getShardingRule()).thenReturn(shardingRule);
        when(backendConnection.getLogicSchema()).thenReturn(logicSchema);
        String sql = "sctl:hint show table status";
        ShardingCTLHintBackendHandler defaultShardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        BackendResponse backendResponse = defaultShardingCTLHintBackendHandler.execute();
        assertThat(backendResponse, instanceOf(QueryResponse.class));
        assertThat(((QueryResponse) backendResponse).getQueryHeaders().get(0).getColumnLabel(), is("table_name"));
        assertThat(((QueryResponse) backendResponse).getQueryHeaders().get(1).getColumnLabel(), is("database_sharding_values"));
        assertThat(((QueryResponse) backendResponse).getQueryHeaders().get(2).getColumnLabel(), is("table_sharding_values"));
        assertTrue(defaultShardingCTLHintBackendHandler.next());
        QueryData defaultQueryData = defaultShardingCTLHintBackendHandler.getQueryData();
        assertThat(defaultQueryData.getData().get(0).toString(), is("user"));
        assertThat(defaultQueryData.getData().get(1).toString(), is(""));
        assertThat(defaultQueryData.getData().get(2).toString(), is(""));
        assertFalse(defaultShardingCTLHintBackendHandler.next());
        String addDatabaseShardingValueSQL = "sctl:hint addDatabaseshardingvalue user=100";
        String addTableShardingValueSQL1 = "sctl:hint addTableshardingvalue user=200";
        String addTableShardingValueSQL2 = "sctl:hint addTableshardingvalue user=300";
        new ShardingCTLHintBackendHandler(addDatabaseShardingValueSQL, backendConnection).execute();
        new ShardingCTLHintBackendHandler(addTableShardingValueSQL1, backendConnection).execute();
        new ShardingCTLHintBackendHandler(addTableShardingValueSQL2, backendConnection).execute();
        ShardingCTLHintBackendHandler updateShardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        updateShardingCTLHintBackendHandler.execute();
        assertTrue(updateShardingCTLHintBackendHandler.next());
        QueryData updateQueryData = updateShardingCTLHintBackendHandler.getQueryData();
        assertThat(updateQueryData.getData().get(0).toString(), is("user"));
        assertThat(updateQueryData.getData().get(1).toString(), is("100"));
        assertThat(updateQueryData.getData().get(2).toString(), is("200,300"));
        assertFalse(updateShardingCTLHintBackendHandler.next());
    }
    
    @Test
    public void assertUnsupportedShardingCTLType() {
        clearThreadLocal();
        String sql = "sctl:hint xx=yy";
        ShardingCTLHintBackendHandler shardingCTLHintBackendHandler = new ShardingCTLHintBackendHandler(sql, backendConnection);
        assertThat(((ErrorResponse) shardingCTLHintBackendHandler.execute()).getCause(), instanceOf(UnsupportedShardingCTLTypeException.class));
    }
}

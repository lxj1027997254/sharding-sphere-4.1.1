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

package org.apache.shardingsphere.sharding.merge;

import org.apache.shardingsphere.sharding.merge.dal.ShardingDALResultMerger;
import org.apache.shardingsphere.sharding.merge.dql.ShardingDQLResultMerger;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaData;
import org.apache.shardingsphere.sql.parser.binder.segment.select.groupby.GroupByContext;
import org.apache.shardingsphere.sql.parser.binder.segment.select.orderby.OrderByContext;
import org.apache.shardingsphere.sql.parser.binder.segment.select.pagination.PaginationContext;
import org.apache.shardingsphere.sql.parser.binder.segment.select.projection.ProjectionsContext;
import org.apache.shardingsphere.sql.parser.binder.statement.CommonSQLStatementContext;
import org.apache.shardingsphere.sql.parser.binder.statement.SQLStatementContext;
import org.apache.shardingsphere.sql.parser.binder.statement.dml.InsertStatementContext;
import org.apache.shardingsphere.sql.parser.binder.statement.dml.SelectStatementContext;
import org.apache.shardingsphere.sql.parser.sql.segment.dml.column.ColumnSegment;
import org.apache.shardingsphere.sql.parser.sql.segment.dml.column.InsertColumnsSegment;
import org.apache.shardingsphere.sql.parser.sql.segment.generic.table.SimpleTableSegment;
import org.apache.shardingsphere.sql.parser.sql.statement.dal.dialect.postgresql.ShowStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dml.InsertStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dml.SelectStatement;
import org.apache.shardingsphere.sql.parser.sql.value.identifier.IdentifierValue;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.common.database.type.DatabaseTypes;
import org.apache.shardingsphere.underlying.merge.engine.merger.impl.TransparentResultMerger;
import org.junit.Test;

import java.util.Collections;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

public final class ShardingResultMergerEngineTest {
    
    @Test
    public void assertNewInstanceWithSelectStatement() {
        ConfigurationProperties properties = new ConfigurationProperties(new Properties());
        SQLStatementContext sqlStatementContext = new SelectStatementContext(new SelectStatement(),
                new GroupByContext(Collections.emptyList(), 0), new OrderByContext(Collections.emptyList(), false),
                new ProjectionsContext(0, 0, false, Collections.emptyList()), new PaginationContext(null, null, Collections.emptyList()));
        assertThat(new ShardingResultMergerEngine().newInstance(DatabaseTypes.getActualDatabaseType("MySQL"), null, properties, sqlStatementContext), instanceOf(ShardingDQLResultMerger.class));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void assertNewInstanceWithDALStatement() {
        ConfigurationProperties properties = new ConfigurationProperties(new Properties());
        SQLStatementContext sqlStatementContext = new CommonSQLStatementContext(new ShowStatement());
        assertThat(new ShardingResultMergerEngine().newInstance(DatabaseTypes.getActualDatabaseType("MySQL"), null, properties, sqlStatementContext), instanceOf(ShardingDALResultMerger.class));
    }
    
    @Test
    public void assertNewInstanceWithOtherStatement() {
        InsertStatement insertStatement = new InsertStatement();
        InsertColumnsSegment insertColumnsSegment = new InsertColumnsSegment(0, 0, Collections.singletonList(new ColumnSegment(0, 0, new IdentifierValue("col"))));
        insertStatement.setTable(new SimpleTableSegment(0, 0, new IdentifierValue("tbl")));
        insertStatement.setInsertColumns(insertColumnsSegment);
        SQLStatementContext sqlStatementContext = new InsertStatementContext(mock(SchemaMetaData.class), Collections.emptyList(), insertStatement);
        ConfigurationProperties properties = new ConfigurationProperties(new Properties());
        assertThat(new ShardingResultMergerEngine().newInstance(DatabaseTypes.getActualDatabaseType("MySQL"), null, properties, sqlStatementContext), instanceOf(TransparentResultMerger.class));
    }
}

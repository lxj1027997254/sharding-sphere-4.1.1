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

package org.apache.shardingsphere.shardingscaling.core.execute.executor.writer;

import lombok.SneakyThrows;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.position.NopLogPosition;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.Column;
import org.apache.shardingsphere.shardingscaling.core.execute.executor.record.DataRecord;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AbstractSqlBuilderTest {
    
    private AbstractSqlBuilder sqlBuilder;
    
    @Before
    @SneakyThrows
    public void setUp() {
        sqlBuilder = new AbstractSqlBuilder() {
            
            @Override
            protected String getLeftIdentifierQuoteString() {
                return "`";
            }
    
            @Override
            protected String getRightIdentifierQuoteString() {
                return "`";
            }
        };
    }
    
    @Test
    public void assertBuildInsertSql() {
        String actual = sqlBuilder.buildInsertSQL(mockDataRecord("t1"));
        assertThat(actual, is("INSERT INTO `t1`(`id`,`c1`,`c2`,`c3`) VALUES(?,?,?,?)"));
    }
    
    @Test
    public void assertBuildUpdateSql() {
        String actual = sqlBuilder.buildUpdateSQL(mockDataRecord("t2"));
        assertThat(actual, is("UPDATE `t2` SET `c1` = ?,`c2` = ?,`c3` = ? WHERE `id` = ?"));
    }
    
    @Test
    public void assertBuildDeleteSql() {
        String actual = sqlBuilder.buildDeleteSQL(mockDataRecord("t3"));
        assertThat(actual, is("DELETE FROM `t3` WHERE `id` = ?"));
    }
    
    private DataRecord mockDataRecord(final String tableName) {
        DataRecord result = new DataRecord(new NopLogPosition(), 4);
        result.setTableName(tableName);
        result.addColumn(new Column("id", "", false, true));
        result.addColumn(new Column("c1", "", true, false));
        result.addColumn(new Column("c2", "", true, false));
        result.addColumn(new Column("c3", "", true, false));
        return result;
    }
}

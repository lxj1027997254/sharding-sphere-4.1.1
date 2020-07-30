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

package org.apache.shardingsphere.shardingscaling.postgresql;

import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.postgresql.replication.LogSequenceNumber;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public final class PostgreSQLLogPositionManagerTest {
    
    private static final String POSTGRESQL_96_LSN = "0/14EFDB8";
    
    private static final String POSTGRESQL_10_LSN = "0/1634520";
    
    @Mock
    private DataSource dataSource;
    
    @Mock
    private Connection connection;
    
    @Mock
    private DatabaseMetaData databaseMetaData;
    
    @Before
    public void setUp() throws Exception {
        when(dataSource.getConnection()).thenReturn(connection);
        when(connection.getMetaData()).thenReturn(databaseMetaData);
        PreparedStatement postgreSQL96LsnPs = mockPostgreSQL96Lsn();
        when(connection.prepareStatement("SELECT * FROM pg_create_logical_replication_slot('sharding_scaling', 'test_decoding')"))
                .thenReturn(mock(PreparedStatement.class));
        when(connection.prepareStatement("SELECT PG_CURRENT_XLOG_LOCATION()")).thenReturn(postgreSQL96LsnPs);
        PreparedStatement postgreSQL10LsnPs = mockPostgreSQL10Lsn();
        when(connection.prepareStatement("SELECT PG_CURRENT_WAL_LSN()")).thenReturn(postgreSQL10LsnPs);
    }
    
    @Test
    @SneakyThrows
    public void assertGetCurrentPositionOnPostgreSQL96() {
        PostgreSQLLogPositionManager postgreSQLLogManager = new PostgreSQLLogPositionManager(dataSource);
        when(databaseMetaData.getDatabaseMajorVersion()).thenReturn(9);
        when(databaseMetaData.getDatabaseMinorVersion()).thenReturn(6);
        WalPosition actual = postgreSQLLogManager.getCurrentPosition();
        assertThat(actual.getLogSequenceNumber(), is(LogSequenceNumber.valueOf(POSTGRESQL_96_LSN)));
    }
    
    @Test
    @SneakyThrows
    public void assertGetCurrentPositionOnPostgreSQL10() {
        PostgreSQLLogPositionManager postgreSQLLogManager = new PostgreSQLLogPositionManager(dataSource);
        when(databaseMetaData.getDatabaseMajorVersion()).thenReturn(10);
        WalPosition actual = postgreSQLLogManager.getCurrentPosition();
        assertThat(actual.getLogSequenceNumber(), is(LogSequenceNumber.valueOf(POSTGRESQL_10_LSN)));
    }
    
    @Test(expected = RuntimeException.class)
    @SneakyThrows
    public void assertGetCurrentPositionThrowException() {
        PostgreSQLLogPositionManager postgreSQLLogManager = new PostgreSQLLogPositionManager(dataSource);
        when(databaseMetaData.getDatabaseMajorVersion()).thenReturn(9);
        when(databaseMetaData.getDatabaseMinorVersion()).thenReturn(4);
        WalPosition actual = postgreSQLLogManager.getCurrentPosition();
    }
    
    @Test
    public void assertUpdateCurrentPosition() {
        PostgreSQLLogPositionManager postgreSQLLogManager = new PostgreSQLLogPositionManager(dataSource);
        WalPosition expected = new WalPosition(LogSequenceNumber.valueOf(POSTGRESQL_96_LSN));
        postgreSQLLogManager.updateCurrentPosition(expected);
        assertThat(postgreSQLLogManager.getCurrentPosition(), is(expected));
    }
    
    @SneakyThrows
    private PreparedStatement mockPostgreSQL96Lsn() {
        PreparedStatement result = mock(PreparedStatement.class);
        ResultSet resultSet = mock(ResultSet.class);
        when(result.executeQuery()).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true, false);
        when(resultSet.getString(1)).thenReturn(POSTGRESQL_96_LSN);
        return result;
    }
    
    @SneakyThrows
    private PreparedStatement mockPostgreSQL10Lsn() {
        PreparedStatement result = mock(PreparedStatement.class);
        ResultSet resultSet = mock(ResultSet.class);
        when(result.executeQuery()).thenReturn(resultSet);
        when(resultSet.next()).thenReturn(true, false);
        when(resultSet.getString(1)).thenReturn(POSTGRESQL_10_LSN);
        return result;
    }
}

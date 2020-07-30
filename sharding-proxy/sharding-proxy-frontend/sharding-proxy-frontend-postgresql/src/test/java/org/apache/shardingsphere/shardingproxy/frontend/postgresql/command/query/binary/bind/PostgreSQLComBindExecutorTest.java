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

package org.apache.shardingsphere.shardingproxy.frontend.postgresql.command.query.binary.bind;

import lombok.SneakyThrows;
import org.apache.shardingsphere.database.protocol.postgresql.packet.command.query.binary.bind.PostgreSQLComBindPacket;
import org.apache.shardingsphere.database.protocol.postgresql.packet.generic.PostgreSQLErrorResponsePacket;
import org.apache.shardingsphere.shardingproxy.backend.communication.DatabaseCommunicationEngine;
import org.apache.shardingsphere.shardingproxy.backend.response.error.ErrorResponse;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.junit.MockitoJUnitRunner;
import org.postgresql.util.PSQLException;
import org.postgresql.util.ServerErrorMessage;

import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PostgreSQLComBindExecutorTest {
    
    @Mock
    private DatabaseCommunicationEngine databaseCommunicationEngine;
    
    @Test
    @SneakyThrows
    public void assertExecuteHasError() {
        PostgreSQLComBindExecutor postgreSQLComBindExecutor = new PostgreSQLComBindExecutor(mock(PostgreSQLComBindPacket.class), null);
        FieldSetter.setField(postgreSQLComBindExecutor, PostgreSQLComBindExecutor.class.getDeclaredField("databaseCommunicationEngine"), databaseCommunicationEngine);
        ErrorResponse errorResponse = new ErrorResponse(new PSQLException(mock(ServerErrorMessage.class)));
        when(databaseCommunicationEngine.execute()).thenReturn(errorResponse);
        Assert.assertThat(((LinkedList) postgreSQLComBindExecutor.execute()).get(1), Matchers.instanceOf(PostgreSQLErrorResponsePacket.class));
        Assert.assertThat(postgreSQLComBindExecutor.isErrorResponse(), Matchers.is(true));
    }
}

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

package org.apache.shardingsphere.sql.parser.integrate.asserts;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.sql.parser.integrate.jaxb.SQLParserTestCasesRegistry;
import org.apache.shardingsphere.sql.parser.integrate.jaxb.SQLParserTestCasesRegistryFactory;
import org.apache.shardingsphere.test.sql.SQLCaseType;
import org.apache.shardingsphere.test.sql.loader.SQLCasesLoader;
import org.apache.shardingsphere.test.sql.loader.SQLCasesRegistry;

import java.util.Collections;

/**
 * SQL case assert context.
 */
@RequiredArgsConstructor
public final class SQLCaseAssertContext {
    
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    
    private static final SQLCasesLoader SQL_CASES_LOADER = SQLCasesRegistry.getInstance().getSqlCasesLoader();
    
    private static final SQLParserTestCasesRegistry SQL_PARSER_TEST_CASES_REGISTRY = SQLParserTestCasesRegistryFactory.getInstance().getRegistry();
    
    private final String sqlCaseId;
    
    @Getter
    private final SQLCaseType sqlCaseType;
    
    /**
     * Get message text.
     * 
     * @param failureMessage failure message
     * @return message text
     */
    public String getText(final String failureMessage) {
        StringBuilder result = new StringBuilder(LINE_SEPARATOR);
        appendSQLCaseId(result);
        appendSQL(result);
        appendFailureMessage(failureMessage, result);
        return result.toString();
    }
    
    private void appendSQLCaseId(final StringBuilder builder) {
        builder.append("SQL Case ID : ");
        builder.append(sqlCaseId);
        builder.append(LINE_SEPARATOR);
    }
    
    private void appendSQL(final StringBuilder builder) {
        builder.append("SQL         : ");
        if (SQLCaseType.Placeholder == sqlCaseType) {
            builder.append(SQL_CASES_LOADER.getSQL(sqlCaseId, sqlCaseType, Collections.emptyList()));
            builder.append(LINE_SEPARATOR);
            builder.append("SQL Params  : ");
            builder.append(SQL_PARSER_TEST_CASES_REGISTRY.get(sqlCaseId).getParameters());
            builder.append(LINE_SEPARATOR);
        } else {
            builder.append(SQL_CASES_LOADER.getSQL(sqlCaseId, sqlCaseType, SQL_PARSER_TEST_CASES_REGISTRY.get(sqlCaseId).getParameters()));
        }
    }
    
    private void appendFailureMessage(final String failureMessage, final StringBuilder builder) {
        builder.append(LINE_SEPARATOR);
        builder.append(failureMessage);
        builder.append(LINE_SEPARATOR);
    }
}

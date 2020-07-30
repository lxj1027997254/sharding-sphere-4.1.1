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

package org.apache.shardingsphere.underlying.merge.engine.decorator;

import org.apache.shardingsphere.spi.database.type.DatabaseType;
import org.apache.shardingsphere.sql.parser.binder.metadata.schema.SchemaMetaData;
import org.apache.shardingsphere.sql.parser.binder.statement.SQLStatementContext;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.common.rule.BaseRule;
import org.apache.shardingsphere.underlying.merge.engine.ResultProcessEngine;

/**
 * Result decorator engine.
 *
 * @param <T> type of rule
 */
public interface ResultDecoratorEngine<T extends BaseRule> extends ResultProcessEngine<T> {
    
    /**
     * Create new instance of result decorator.
     * 
     * @param databaseType database type
     * @param schemaMetaData schema meta data
     * @param rule rule
     * @param properties ShardingSphere properties
     * @param sqlStatementContext SQL statement context
     * @return new instance of result decorator
     */
    ResultDecorator newInstance(DatabaseType databaseType, SchemaMetaData schemaMetaData, T rule, ConfigurationProperties properties, SQLStatementContext sqlStatementContext);
}

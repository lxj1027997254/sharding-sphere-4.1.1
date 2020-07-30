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

import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.sharding.merge.dal.ShardingDALResultMerger;
import org.apache.shardingsphere.sharding.merge.dql.ShardingDQLResultMerger;
import org.apache.shardingsphere.spi.database.type.DatabaseType;
import org.apache.shardingsphere.sql.parser.binder.statement.SQLStatementContext;
import org.apache.shardingsphere.sql.parser.binder.statement.dml.SelectStatementContext;
import org.apache.shardingsphere.sql.parser.sql.statement.dal.DALStatement;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.merge.engine.merger.ResultMerger;
import org.apache.shardingsphere.underlying.merge.engine.merger.ResultMergerEngine;
import org.apache.shardingsphere.underlying.merge.engine.merger.impl.TransparentResultMerger;

/**
 * Result merger engine for sharding.
 */
public final class ShardingResultMergerEngine implements ResultMergerEngine<ShardingRule> {
    
    @Override
    public ResultMerger newInstance(final DatabaseType databaseType, final ShardingRule shardingRule, final ConfigurationProperties properties, final SQLStatementContext sqlStatementContext) {
        if (sqlStatementContext instanceof SelectStatementContext) {
            return new ShardingDQLResultMerger(databaseType);
        } 
        if (sqlStatementContext.getSqlStatement() instanceof DALStatement) {
            return new ShardingDALResultMerger(shardingRule);
        }
        return new TransparentResultMerger();
    }
    
    @Override
    public int getOrder() {
        return 0;
    }
    
    @Override
    public Class<ShardingRule> getType() {
        return ShardingRule.class;
    }
}

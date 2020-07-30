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

package org.apache.shardingsphere.shadow.rewrite.context;

import org.apache.shardingsphere.core.rule.ShadowRule;
import org.apache.shardingsphere.shadow.rewrite.parameter.ShadowParameterRewriterBuilder;
import org.apache.shardingsphere.shadow.rewrite.token.ShadowTokenGenerateBuilder;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.rewrite.context.SQLRewriteContext;
import org.apache.shardingsphere.underlying.rewrite.context.SQLRewriteContextDecorator;
import org.apache.shardingsphere.underlying.rewrite.parameter.rewriter.ParameterRewriter;

/**
 * SQL rewrite context decorator for shadow.
 */
public final class ShadowSQLRewriteContextDecorator implements SQLRewriteContextDecorator<ShadowRule> {
    
    @SuppressWarnings("unchecked")
    @Override
    public void decorate(final ShadowRule shadowRule, final ConfigurationProperties properties, final SQLRewriteContext sqlRewriteContext) {
        for (ParameterRewriter each : new ShadowParameterRewriterBuilder(shadowRule).getParameterRewriters(sqlRewriteContext.getSchemaMetaData())) {
            if (!sqlRewriteContext.getParameters().isEmpty() && each.isNeedRewrite(sqlRewriteContext.getSqlStatementContext())) {
                each.rewrite(sqlRewriteContext.getParameterBuilder(), sqlRewriteContext.getSqlStatementContext(), sqlRewriteContext.getParameters());
            }
        }
        sqlRewriteContext.addSQLTokenGenerators(new ShadowTokenGenerateBuilder(shadowRule).getSQLTokenGenerators());
    }
    
    @Override
    public int getOrder() {
        return 30;
    }
    
    @Override
    public Class<ShadowRule> getType() {
        return ShadowRule.class;
    }
}

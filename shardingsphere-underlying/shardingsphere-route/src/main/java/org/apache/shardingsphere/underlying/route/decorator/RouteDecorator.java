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

package org.apache.shardingsphere.underlying.route.decorator;

import org.apache.shardingsphere.spi.order.OrderAware;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.apache.shardingsphere.underlying.common.metadata.ShardingSphereMetaData;
import org.apache.shardingsphere.underlying.common.rule.BaseRule;
import org.apache.shardingsphere.underlying.route.context.RouteContext;

/**
 * Route decorator.
 * 
 * @param <T> type of rule
 */
public interface RouteDecorator<T extends BaseRule> extends OrderAware<Class<T>> {
    
    /**
     * Decorate route context.
     * 
     * @param routeContext route context
     * @param metaData meta data of ShardingSphere
     * @param rule rule
     * @param properties configuration properties
     * @return decorated route context
     */
    RouteContext decorate(RouteContext routeContext, ShardingSphereMetaData metaData, T rule, ConfigurationProperties properties);
}

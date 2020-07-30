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

package org.apache.shardingsphere.shardingproxy.frontend.executor;

import com.google.common.util.concurrent.ListeningExecutorService;
import lombok.Getter;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationPropertyKey;
import org.apache.shardingsphere.underlying.executor.engine.impl.ShardingSphereExecutorService;
import org.apache.shardingsphere.shardingproxy.context.ShardingProxyContext;

/**
 * Command execute engine.
 */
public final class UserExecutorGroup implements AutoCloseable {
    
    private static final ShardingProxyContext SHARDING_PROXY_CONTEXT = ShardingProxyContext.getInstance();
    
    private static final String NAME_FORMAT = "Command-%d";
    
    private static final UserExecutorGroup INSTANCE = new UserExecutorGroup();
    
    private final ShardingSphereExecutorService shardingSphereExecutorService;
    
    @Getter
    private final ListeningExecutorService executorService;
    
    private UserExecutorGroup() {
        shardingSphereExecutorService = new ShardingSphereExecutorService(SHARDING_PROXY_CONTEXT.getProperties().<Integer>getValue(ConfigurationPropertyKey.ACCEPTOR_SIZE), NAME_FORMAT);
        executorService = shardingSphereExecutorService.getExecutorService();
    }
    
    /**
     * Get instance of user executor group.
     *
     * @return user executor group
     */
    public static UserExecutorGroup getInstance() {
        return INSTANCE;
    }
    
    @Override
    public void close() {
        shardingSphereExecutorService.close();
    }
}

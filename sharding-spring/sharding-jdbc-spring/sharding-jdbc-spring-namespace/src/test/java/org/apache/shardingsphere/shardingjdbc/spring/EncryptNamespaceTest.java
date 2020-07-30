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

package org.apache.shardingsphere.shardingjdbc.spring;

import org.apache.shardingsphere.encrypt.rule.EncryptRule;
import org.apache.shardingsphere.encrypt.strategy.impl.AESEncryptor;
import org.apache.shardingsphere.shardingjdbc.jdbc.core.datasource.EncryptDataSource;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationPropertyKey;
import org.apache.shardingsphere.underlying.common.config.properties.ConfigurationProperties;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@ContextConfiguration(locations = "classpath:META-INF/rdb/encryptNamespace.xml")
public class EncryptNamespaceTest extends AbstractJUnit4SpringContextTests {
    
    @Test
    public void assertEncryptDataSource() {
        EncryptRule encryptRule = getEncryptRuleRule();
        assertTrue(encryptRule.findEncryptor("t_order", "user_id").isPresent());
        assertThat(encryptRule.getCipherColumn("t_order", "user_id"), is("user_encrypt"));
        assertTrue(encryptRule.findEncryptor("t_order", "user_id").get() instanceof AESEncryptor);
        assertThat(encryptRule.findPlainColumn("t_order", "order_id"), is(Optional.of("order_decrypt")));
        assertTrue(getProperties().<Boolean>getValue(ConfigurationPropertyKey.SQL_SHOW));
        assertTrue(getProperties().<Boolean>getValue(ConfigurationPropertyKey.QUERY_WITH_CIPHER_COLUMN));
    }
    
    private EncryptRule getEncryptRuleRule() {
        EncryptDataSource encryptDataSource = applicationContext.getBean("encryptDataSource", EncryptDataSource.class);
        return encryptDataSource.getRuntimeContext().getRule();
    }
    
    private ConfigurationProperties getProperties() {
        EncryptDataSource encryptDataSource = applicationContext.getBean("encryptDataSource", EncryptDataSource.class);
        return encryptDataSource.getRuntimeContext().getProperties();
    }
}

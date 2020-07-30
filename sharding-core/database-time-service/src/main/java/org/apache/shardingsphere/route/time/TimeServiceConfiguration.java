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

package org.apache.shardingsphere.route.time;

import lombok.Getter;
import org.apache.shardingsphere.route.time.exception.TimeServiceInitException;

import javax.sql.DataSource;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Time service configuration.
 * 
 * <p>
 * Need to create a time-service.properties under the classpath.
 * </p>
 */
@Getter
public final class TimeServiceConfiguration {
    
    private static final TimeServiceConfiguration CONFIG = new TimeServiceConfiguration();
    
    private String driverClassName;
    
    private DataSource dataSource;
    
    private TimeServiceConfiguration() {
        init();
    }
    
    private void init() {
        try (InputStream inputStream = TimeServiceConfiguration.class.getResourceAsStream("/time-service.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String dataSourceType = (String) properties.remove("dataSourceType");
            driverClassName = (String) properties.get("driverClassName");
            Class dataSourceClass = Class.forName(dataSourceType);
            dataSource = (DataSource) dataSourceClass.newInstance();
            for (String each : properties.stringPropertyNames()) {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(each, dataSourceClass);
                Method writeMethod = propertyDescriptor.getWriteMethod();
                writeMethod.invoke(dataSource, properties.getProperty(each));
            }
        } catch (final ClassNotFoundException | InstantiationException | IllegalAccessException | IntrospectionException | InvocationTargetException | IOException ex) {
            throw new TimeServiceInitException("please check your time-service.properties", ex);
        }
    }

    /**
     * Get configuration instance.
     * 
     * @return time service configuration
     */
    public static TimeServiceConfiguration getInstance() {
        return CONFIG;
    }
}

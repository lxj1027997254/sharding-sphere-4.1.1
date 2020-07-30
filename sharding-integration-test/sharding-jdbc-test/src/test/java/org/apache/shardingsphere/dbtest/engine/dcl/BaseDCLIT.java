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

package org.apache.shardingsphere.dbtest.engine.dcl;

import org.apache.shardingsphere.dbtest.cases.assertion.dcl.DCLIntegrateTestCaseAssertion;
import org.apache.shardingsphere.dbtest.engine.SingleIT;
import org.apache.shardingsphere.dbtest.env.DatabaseTypeEnvironment;
import org.apache.shardingsphere.dbtest.env.EnvironmentPath;
import org.apache.shardingsphere.dbtest.env.authority.AuthorityEnvironmentManager;
import org.apache.shardingsphere.dbtest.env.dataset.DataSetEnvironmentManager;
import org.apache.shardingsphere.spi.database.metadata.DataSourceMetaData;
import org.apache.shardingsphere.spi.database.metadata.MemorizedDataSourceMetaData;
import org.apache.shardingsphere.test.sql.SQLCaseType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import javax.sql.DataSource;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public abstract class BaseDCLIT extends SingleIT {
    
    private final AuthorityEnvironmentManager authorityEnvironmentManager;
    
    public BaseDCLIT(final String sqlCaseId, final String path, final DCLIntegrateTestCaseAssertion assertion, final String shardingRuleType,
                     final DatabaseTypeEnvironment databaseTypeEnvironment, final SQLCaseType caseType) throws IOException, JAXBException, SQLException, ParseException {
        super(sqlCaseId, path, assertion, shardingRuleType, databaseTypeEnvironment, caseType);
        authorityEnvironmentManager = new AuthorityEnvironmentManager(
                EnvironmentPath.getAuthorityResourcesPath(shardingRuleType), null == getDataSourceMap() ? null : createInstanceDataSourceMap(), getDatabaseTypeEnvironment().getDatabaseType());
    }
    
    private Map<String, DataSource> createInstanceDataSourceMap() throws SQLException {
        return "masterslave".equals(getRuleType()) || "shadow".equals(getRuleType()) ? getDataSourceMap() : getShardingInstanceDataSourceMap();
    }
    
    private Map<String, DataSource> getShardingInstanceDataSourceMap() throws SQLException {
        Map<String, DataSource> result = new LinkedHashMap<>();
        Map<String, DataSourceMetaData> dataSourceMetaDataMap = getDataSourceMetaDataMap();
        for (Entry<String, DataSource> entry : getDataSourceMap().entrySet()) {
            if (!isExisted(entry.getKey(), result.keySet(), dataSourceMetaDataMap)) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
    
    private Map<String, DataSourceMetaData> getDataSourceMetaDataMap() throws SQLException {
        Map<String, DataSourceMetaData> result = new LinkedHashMap<>();
        for (Entry<String, DataSource> entry : getDataSourceMap().entrySet()) {
            try (Connection connection = entry.getValue().getConnection()) {
                DatabaseMetaData metaData = connection.getMetaData();
                result.put(entry.getKey(), getDatabaseTypeEnvironment().getDatabaseType().getDataSourceMetaData(metaData.getURL(), metaData.getUserName()));
            }
        }
        return result;
    }
    
    private boolean isExisted(final String dataSourceName, final Collection<String> existedDataSourceNames, final Map<String, DataSourceMetaData> dataSourceMetaDataMap) {
        DataSourceMetaData sample = dataSourceMetaDataMap.get(dataSourceName);
        for (String each : existedDataSourceNames) {
            if (isInSameDatabaseInstance(sample, dataSourceMetaDataMap.get(each))) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isInSameDatabaseInstance(final DataSourceMetaData sample, final DataSourceMetaData target) {
        return sample instanceof MemorizedDataSourceMetaData
                ? (Objects.equals(target.getSchema(), sample.getSchema())) : target.getHostName().equals(sample.getHostName()) && target.getPort() == sample.getPort();
    }
    
    @BeforeClass
    public static void initDatabasesAndTables() {
        createDatabasesAndTables();
    }

    @AfterClass
    public static void destroyDatabasesAndTables() {
        dropDatabases();
    }

    @Before
    public void insertData() throws SQLException, ParseException, IOException, JAXBException {
        if (getDatabaseTypeEnvironment().isEnabled()) {
            new DataSetEnvironmentManager(EnvironmentPath.getDataInitializeResourceFile(getRuleType()), getDataSourceMap()).initialize();
            authorityEnvironmentManager.initialize();
        }
    }
    
    @After
    public void cleanData() throws SQLException {
        if (getDatabaseTypeEnvironment().isEnabled()) {
            authorityEnvironmentManager.clean();
        }
    }
}

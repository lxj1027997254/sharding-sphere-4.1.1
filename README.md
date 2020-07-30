# [ShardingSphere - Distributed Database Middleware Ecosphere](https://shardingsphere.apache.org/)

**Official website: https://shardingsphere.apache.org/**

[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![Gitter](https://badges.gitter.im/shardingsphere/shardingsphere.svg)](https://gitter.im/shardingsphere/Lobby)
[![GitHub release](https://img.shields.io/github/release/apache/shardingsphere.svg)](https://github.com/apache/shardingsphere/releases)
[![Stargazers over time](https://starchart.cc/apache/shardingsphere.svg)](https://starchart.cc/apache/shardingsphere)

[![Total Lines](https://tokei.rs/b1/github/apache/shardingsphere?category=lines)](https://github.com/apache/shardingsphere)
[![Build Status](https://builds.apache.org/job/shardingsphere-ci-dev/badge/icon)](https://builds.apache.org/job/shardingsphere-ci-dev/)
[![Coverage Status](https://coveralls.io/repos/github/apache/shardingsphere/badge.svg?branch=master)](https://coveralls.io/github/apache/shardingsphere?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/278600ed40ad48e988ab485b439abbcd)](https://www.codacy.com/app/terrymanu/sharding-sphere?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=sharding-sphere/sharding-sphere&amp;utm_campaign=Badge_Grade)
[![snyk](https://snyk.io/test/github/apache/shardingsphere/badge.svg?targetFile=pom.xml)](https://snyk.io/test/github/apache/shardingsphere?targetFile=pom.xml)
[![OpenTracing-1.0 Badge](https://img.shields.io/badge/OpenTracing--1.0-enabled-blue.svg)](http://opentracing.io)
[![Skywalking Tracing](https://img.shields.io/badge/Skywalking%20Tracing-enable-brightgreen.svg)](https://github.com/apache/skywalking)

## Document

[![EN doc](https://img.shields.io/badge/document-English-blue.svg)](https://shardingsphere.apache.org/document/current/en/overview/)
[![CN doc](https://img.shields.io/badge/文档-中文版-blue.svg)](https://shardingsphere.apache.org/document/current/cn/overview/)

## Overview

ShardingSphere is an open-source ecosystem consisted of a set of distributed database middleware solutions, including 2 independent products, Sharding-JDBC & Sharding-Proxy & Sharding-Sidecar (todo). 
They all provide functions of data sharding, distributed transaction and database orchestration, applicable in a variety of situations such as Java isomorphism, heterogeneous language and cloud native. 

Aiming at reasonably making full use of the computation and storage capacity of the database in a distributed system, ShardingSphere defines itself as a middleware, rather than a totally new type of database. 
As the cornerstone of many enterprises, relational database still takes a huge market share. 
Therefore, at the current stage, we prefer to focus on its increment instead of a total overturn.

__Apache releases are beginning from version 4.0.0__

![ShardingSphere Scope](https://shardingsphere.apache.org//document/current/img/shardingsphere-scope_en.png)

### Sharding-JDBC

[![Maven Status](https://maven-badges.herokuapp.com/maven-central/org.apache.shardingsphere/sharding-jdbc/badge.svg)](https://mvnrepository.com/artifact/org.apache.shardingsphere/sharding-jdbc)

Sharding-JDBC defines itself as a lightweight Java framework that provides extra service at Java JDBC layer. 
With the client end connecting directly to the database, it provides service in the form of jar and requires no extra deployment and dependence. 
It can be considered as an enhanced JDBC driver, which is fully compatible with JDBC and all kinds of ORM frameworks.

* Applicable in any ORM framework based on JDBC, such as JPA, Hibernate, Mybatis, Spring JDBC Template or direct use of JDBC.
* Support any third-party database connection pool, such as DBCP, C3P0, BoneCP, Druid, HikariCP.
* Support any kind of JDBC standard database: MySQL, Oracle, SQLServer, PostgreSQL and any SQL92 followed databases.

![Sharding-JDBC Architecture](https://shardingsphere.apache.org//document/current/img/sharding-jdbc-brief.png)

### Sharding-Proxy

[![Download](https://img.shields.io/badge/release-download-orange.svg)](https://www.apache.org/dyn/closer.cgi?path=incubator/shardingsphere/4.1.0/apache-shardingsphere-incubating-4.1.0-sharding-proxy-bin.tar.gz)
[![Docker Pulls](https://img.shields.io/docker/pulls/shardingsphere/sharding-proxy.svg)](https://store.docker.com/community/images/shardingsphere/sharding-proxy)

Sharding-Proxy defines itself as a transparent database proxy, providing a database server that encapsulates database binary protocol to support heterogeneous languages. 
Friendlier to DBA, the MySQL/PostgreSQL version provided now can use any kind of client access (such as MySQL Command Client, MySQL Workbench, Navicat etc.) that is compatible of MySQL/PostgreSQL protocol to operate data.

* Totally transparent to applications, it can be used directly as MySQL and PostgreSQL.
* Applicable to any kind of compatible client end that is compatible with MySQL and PostgreSQL protocol.

![Sharding-Proxy Architecture](https://shardingsphere.apache.org//document/current/img/sharding-proxy-brief_v2.png)

### Sharding-Sidecar(TODO)

Sharding-Sidecar (TODO) defines itself as a cloud native database agent of the Kubernetes environment, in charge of all the access to the database in the form of sidecar. 
It provides a mesh layer interacting with the database, we call this as `Database Mesh`.

Database Mesh emphasizes on how to connect distributed database access application with the database. 
Focusing on interaction, it effectively organizes the interaction between messy applications and the database. 
The application and database that use Database Mesh to visit database will form a large grid system, where they just need to be put into the right position accordingly. 
They are all governed by the mesh layer.

![Sharding-Sidecar Architecture](https://shardingsphere.apache.org//document/current/img/sharding-sidecar-brief_v2.png)

|                         | *Sharding-JDBC* | *Sharding-Proxy*     | *Sharding-Sidecar* |
| ----------------------- | --------------- | -------------------- | ------------------ |
| Database                | Any             | MySQL/PostgreSQL     | MySQL/PostgreSQL   |
| Connections Count Cost  | High            | Low                  | High               |
| Supported Languages     | Java Only       | Any                  | Any                |
| Performance             | Low loss        | Relatively High loss | Low loss           |
| Decentralization        | Yes             | No                   | No                 |
| Static Entry            | No              | Yes                  | No                 |

### Hybrid Architecture

Sharding-JDBC adopts decentralized architecture, applicable to high-performance light-weight OLTP application developed with Java; 
Sharding-Proxy provides static entry and all languages support, applicable for OLAP application and the sharding databases management and operation situation.

ShardingSphere is an ecosphere consists of multiple endpoints together.
Through a mixed use of Sharding-JDBC and Sharding-Proxy and unified sharding strategy by the same registry center, ShardingSphere can build an application system applicable to all kinds of scenarios. 
Architects can adjust the system architecture to the most applicable one to current business more freely.

![ShardingSphere Hybrid Architecture](https://shardingsphere.apache.org//document/current/img/shardingsphere-hybrid.png)

## Features

### Data Sharding

* Database sharding & Table sharding
* Read-write splitting
* Sharding strategy customization
* Centre-less Distributed primary key

### Distributed Transaction

* Unified Transaction API
* XA transaction
* BASE transaction

### Database Orchestration

* Dynamic Configuration
* Orchestration & Governance
* Data Encryption
* Tracing & Observability
* Elastic scaling out (Planning)

## Project Status

![Status](https://shardingsphere.apache.org/document/current/img/shardingsphere-status_en.png)

## How to Build

### Build ShardingSphere

```bash
./mvnw clean install -Prelease
```

Artifact:

```
sharding-distribution/sharding-jdbc-distribution/target/apache-shardingsphere-${latest.release.version}-sharding-jdbc-bin.tar.gz: Binary package of Sharding-JDBC
sharding-distribution/sharding-proxy-distribution/target/apache-shardingsphere-${latest.release.version}-sharding-proxy-bin.tar.gz: Binary package of Sharding-Proxy
sharding-distribution/shardingsphere-src-distribution/target/apache-shardingsphere-${latest.release.version}-src.zip: Source code package of ShardingSphere
```

### Build ShardingSphere-UI

```bash
cd shardingsphere-ui
./mvnw clean install -Prelease
```

Artifact:

```
shardingsphere-ui/shardingsphere-ui-distribution/shardingsphere-ui-bin-distribution/target/apache-shardingsphere-${latest.release.version}-shardingsphere-ui-bin.tar.gz: Binary package of ShardingSphere-UI
```

## Landscapes

<p align="center">
<br/><br/>
<img src="https://landscape.cncf.io/images/left-logo.svg" width="150"/>&nbsp;&nbsp;<img src="https://landscape.cncf.io/images/right-logo.svg" width="200"/>
<br/><br/>
ShardingSphere enriches the <a href="https://landscape.cncf.io/landscape=observability-and-analysis&license=apache-license-2-0">CNCF CLOUD NATIVE Landscape.</a>
</p>

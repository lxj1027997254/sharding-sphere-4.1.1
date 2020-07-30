+++
pre = "<b>4.3. </b>"
title = "Sharding-Sidecar"
weight = 3
chapter = true
+++

## 简介

Sharding-Sidecar是ShardingSphere的第三个产品，目前仍然在`规划中`。
定位为Kubernetes或Mesos的云原生数据库代理，以DaemonSet的形式代理所有对数据库的访问。

通过无中心、零侵入的方案提供与数据库交互的的啮合层，即Database Mesh，又可称数据网格。
Database Mesh的关注重点在于如何将分布式的数据访问应用与数据库有机串联起来，它更加关注的是交互，是将杂乱无章的应用与数据库之间的交互有效的梳理。使用Database Mesh，访问数据库的应用和数据库终将形成一个巨大的网格体系，应用和数据库只需在网格体系中对号入座即可，它们都是被啮合层所治理的对象。

![Sharding-Sidecar Architecture](https://shardingsphere.apache.org/document/current/img/sharding-sidecar-brief_v2.png)

## 对比

|          | *Sharding-JDBC* | *Sharding-Proxy* | *Sharding-Sidecar* |
| -------- | --------------- | ---------------- | ------------------ |
| 数据库    | 任意            | MySQL            | `MySQL`             |
| 连接消耗数 | 高             | 低               | `高`                 |
| 异构语言   | 仅Java         | 任意              | `任意`              |
| 性能      | 损耗低          | 损耗略高          | `损耗低`             |
| 无中心化  | 是              | 否               | `是`                 |
| 静态入口  | 无              | 有               | `无`                 |

Sharding-Sidecar的优势在于对Kubernetes和Mesos的云原生支持。

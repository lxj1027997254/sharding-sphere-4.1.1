+++
pre = "<b>3.4.1.1 </b>"
title = "2PC Transaction-XA"
weight = 1
+++

2PC transaction submit uses the [DTP Model](http://pubs.opengroup.org/onlinepubs/009680699/toc.pdf) defined by X/OPEN, in which extracted `AP`, `TM` and `RM` can guarantee a high transaction consistency. `TM` and `RM` exchange transaction information according to XA. Compared with traditional local transactions, XA transactions have a prepare phase, where the database can not only passively receive commands, but also notify the submitter whether the transaction can be accepted. So `TM` can collect all the prepare results of transactions in branches before submitting all of them together, which has guaranteed the high consistency.

![2PC XA model](https://shardingsphere.apache.org/document/current/img/transaction/2pc-tansaction-modle_cn.png)

Java implements the XA model through defining a JTA interface, in which `ResourceManager` requires an XA driver provided by database manufacturers and `TransactionManager` is provided by transaction manager manufacturers. Traditional transaction managers need to be bound with application server, which poises a high use cost. But built-in transaction managers have already been able to provide services through jar packages. Integrated with ShardingSphere, it can guarantee the high consistency in cross-database transactions after sharding.

Usually, to use XA transaction, users must use its connection pool provided by transaction manager manufacturers. However, when ShardingSphere integrates XA transactions, it has separated the management of XA transaction and its connection pool, so XA will not invade the business.
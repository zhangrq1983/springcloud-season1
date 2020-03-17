CREATE TABLE `dept` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `db_source` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO springcloud_test_season1_db01.dept(dept_name, db_source)
VALUES('开发部', database());
INSERT INTO springcloud_test_season1_db01.dept(dept_name, db_source)
VALUES('人事部', database());
INSERT INTO springcloud_test_season1_db01.dept(dept_name, db_source)
VALUES('财务部', database());
INSERT INTO springcloud_test_season1_db01.dept(dept_name, db_source)
VALUES('市场部', database());
INSERT INTO springcloud_test_season1_db01.dept(dept_name, db_source)
VALUES('运维部', database());
INSERT INTO springcloud_test_season1_db01.dept(dept_name, db_source)
VALUES('你好2020', database());

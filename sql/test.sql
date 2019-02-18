CREATE TABLE `biz_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `state` int(11) DEFAULT NULL COMMENT '状态',
  `flag` int(11) DEFAULT NULL COMMENT '标志位',
  `plancode` varchar(255) DEFAULT NULL COMMENT '计划编号',
  `ordercode` varchar(255) DEFAULT NULL COMMENT '工单编号',
  `operater` varchar(255) DEFAULT NULL COMMENT '操作人员',
  `version` int(11) DEFAULT NULL COMMENT '保留字段(暂时没用）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='工单表';
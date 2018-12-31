

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for loyality_rule
-- ----------------------------
DROP TABLE IF EXISTS `loyality_rule`;
CREATE TABLE `loyality_rule` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '自增长ID',
  `effective_begin_time` datetime NOT NULL  COMMENT '生效开始时间',
  `effective_end_time` datetime NOT NULL  COMMENT '生效结束时间',
  `percentage` varchar(200) NOT NULL DEFAULT '' COMMENT '百分比',
  `priority` tinyint(4) NOT NULL DEFAULT '0' COMMENT '规则优先级',
  `is_active` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否有效',
  `create_by` varchar(60) NOT NULL DEFAULT 'admin' COMMENT '创建者',
  `create_time` datetime NOT NULL DEFAULT '0001-01-01 01:01:01' COMMENT '创建时间',
  `update_by` varchar(60) DEFAULT NULL COMMENT '修改者',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=72 DEFAULT CHARSET=utf8 COMMENT='积分规则表';

INSERT INTO `drools`.`loyality_rule` (`id`, `effective_begin_time`, `effective_end_time`, `percentage`, `priority`, `is_active`, `create_by`, `create_time`, `update_by`, `update_time`) VALUES ('1', '2018-10-04 16:17:42', '2018-12-30 16:17:42', '0.04', '0', '1', 'admin', '0001-01-01 01:01:01', 'landin', '2018-09-04 16:17:42');

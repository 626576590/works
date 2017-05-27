CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) DEFAULT NULL COMMENT '名称 ',
  `account` varchar(50) DEFAULT NULL COMMENT '账户',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `telephone` varchar(20) DEFAULT NULL COMMENT '电话 ',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注 ',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `createUserId` varchar(20) DEFAULT NULL COMMENT '创建用户ID',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `updateUserId` varchar(20) DEFAULT NULL COMMENT '修改用户ID',
  `status` varchar(5) DEFAULT '0' COMMENT '状态 ',
  PRIMARY KEY (`id`),
  KEY `patient_index1` (`name`,`status`,`telephone`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE `role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(50) DEFAULT NULL COMMENT '描述',
  `isadmin` varchar(2) DEFAULT NULL COMMENT '是否为管理员',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注 ',
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `createUserId` varchar(20) DEFAULT NULL COMMENT '创建用户ID',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `updateUserId` varchar(20) DEFAULT NULL COMMENT '修改用户ID',
  `status` varchar(5) DEFAULT '0' COMMENT '状态 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='角色表';

CREATE TABLE `rights` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rightsCode` varchar(20) DEFAULT NULL COMMENT '权限编号',
  `description` varchar(50) DEFAULT NULL COMMENT '权限描述',
  `url` varchar(50) DEFAULT NULL COMMENT '访问url',
  `type` int(11) DEFAULT '0' COMMENT '类别(0：基础;1:业务)',
  `sort` int(11) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  `createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `createUserId` varchar(20) DEFAULT NULL COMMENT '创建用户ID',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `updateUserId` varchar(20) DEFAULT NULL COMMENT '修改用户ID',
  `status` varchar(5) DEFAULT '0' COMMENT '状态 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='权限表';

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `userId` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `roleId` int(11) DEFAULT NULL COMMENT '角色ID',
  `status` int(5) DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户角色表';

CREATE TABLE `role_rights` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `roleId` int(11) DEFAULT NULL COMMENT '角色ID',
  `rightsCode` varchar(20) DEFAULT NULL COMMENT '权限编号',
  `status` int(5) DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='角色权限表';


CREATE TABLE persistent_logins (
    username VARCHAR(64) NOT NULL,
    series VARCHAR(64) NOT NULL,
    token VARCHAR(64) NOT NULL,
    last_used TIMESTAMP NOT NULL,
    PRIMARY KEY (series)
);




-- 用户中心 start-------------------------------------------------------------------------------------------------------
-- #创建用户数据库
DROP DATABASE IF EXISTS `muy_user`;
CREATE DATABASE `muy_user` DEFAULT CHARACTER SET `utf8` COLLATE `utf8_general_ci`;
USE `muy_user`;
-- #创建用户表
DROP TABLE IF EXISTS `my_user`;
CREATE TABLE `my_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(32) DEFAULT '' COMMENT '用户名',
  `nick_name` varchar(32) DEFAULT '' COMMENT '昵称',
  `mobile` varchar(11) DEFAULT '' COMMENT '手机号',
  `birthday` varchar(10) DEFAULT '' COMMENT '生日(1999-07-16)',
  `signature` varchar(90) DEFAULT '' COMMENT '个性签名',
  `sex` char(1) DEFAULT '' COMMENT '性别(F-女,M-男)',
  `avatar` varchar(64) DEFAULT '' COMMENT '头像',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8 COMMENT='用户表';
-- #创建用户权限表
DROP TABLE IF EXISTS `my_user_role`;
CREATE TABLE `my_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint(20) DEFAULT '0' COMMENT '用户ID',
  `user_name` varchar(32) DEFAULT '' COMMENT '用户名',
  `role` varchar(32) NOT NULL DEFAULT '' COMMENT '用户权限',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限表';
-- 用户中心 end  -------------------------------------------------------------------------------------------------------

-- 商品中心 start-------------------------------------------------------------------------------------------------------
-- #创建商品数据库
DROP DATABASE IF EXISTS `muy_goods`;
CREATE DATABASE `muy_goods` DEFAULT CHARACTER SET `utf8` COLLATE `utf8_general_ci`;
USE `muy_goods`;
-- #创建类目表
DROP TABLE IF EXISTS `my_category`;
CREATE TABLE `my_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类目编号',
  `name` varchar(64) DEFAULT '' COMMENT '类目名称',
  `level` tinyint(1) DEFAULT '0' COMMENT '类目级别',
  `parent_id` int(11) DEFAULT '0' COMMENT '父级类目',
  `is_parent_flg` tinyint(1) DEFAULT '0' COMMENT '是否父级(0-否,1-是)',
  `weight` int(11) DEFAULT '0' COMMENT '权重',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态(0-下架,1-上架)',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000000 DEFAULT CHARSET=utf8 COMMENT='类目表';
-- #创建品牌表
DROP TABLE IF EXISTS `my_brand`;
CREATE TABLE `my_brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
  `category_id` int(11) DEFAULT '0' COMMENT '类目编号',
  `china_name` varchar(32) DEFAULT '' COMMENT '品牌中文名',
  `english_name` varchar(32) DEFAULT '' COMMENT '品牌中文名',
  `desc` varchar(264) DEFAULT '' COMMENT '描述',
  `logo` varchar(64) DEFAULT '' COMMENT '品牌Logo',
  `address` varchar(128) DEFAULT '' COMMENT '品牌官方地址',
  `story` varchar(255) DEFAULT '' COMMENT '品牌故事',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100000 DEFAULT CHARSET=utf8 COMMENT='品牌表';
-- #创建商品表
DROP TABLE IF EXISTS `my_goods`;
CREATE TABLE `my_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `name` varchar(128) DEFAULT '' COMMENT '商品名称',
  `brand_id` int(11) DEFAULT '0' COMMENT '品牌编号',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000000 DEFAULT CHARSET=utf8 COMMENT='商品表';
-- #创建商品图片表
DROP TABLE IF EXISTS `my_goods_img`;
CREATE TABLE `my_goods_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `img_url` varchar(350) DEFAULT '' COMMENT '图片地址',
  `goods_id` int(11) DEFAULT '0' COMMENT '商品编号',
  `location` varchar(12) DEFAULT '' COMMENT '图片位置',
  `is_main_img_flg` tinyint(1) DEFAULT '0' COMMENT '是否主图',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品图片表';
-- #创建商品属性表
DROP TABLE IF EXISTS `my_goods_attr`;
CREATE TABLE `my_goods_attr` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `goods_id` int(11) DEFAULT '0' COMMENT '商品编号',
  `attr_name_id` int(11) DEFAULT '0' COMMENT '属性名编号',
  `attr_value_id` int(11) DEFAULT '0' COMMENT '属性值编号',
  `is_sku_flg` tinyint(1) DEFAULT '0' COMMENT '是否SKU',
  `sku_id` int(11) DEFAULT '0' COMMENT 'SKU编号',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性表';
-- #创建属性名表
DROP TABLE IF EXISTS `my_attr_name`;
CREATE TABLE `my_attr_name` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '属性名编号',
  `name` varchar(32) DEFAULT '' COMMENT '属性名名称',
  `category_id` int(11) DEFAULT '0' COMMENT '类目编号',
  `is_allow_alias_flg` tinyint(1) DEFAULT '0' COMMENT '是否允许别名属性',
  `is_color_flg` tinyint(1) DEFAULT '0' COMMENT '是否颜色属性',
  `is_enum_flg` tinyint(1) DEFAULT '0' COMMENT '是否枚举属性',
  `is_input_flg` tinyint(1) DEFAULT '0' COMMENT '是否输入属性',
  `is_master_flg` tinyint(1) DEFAULT '0' COMMENT '是否关键属性',
  `is_sell_flg` tinyint(1) DEFAULT '0' COMMENT '是否销售属性',
  `is_search_flg` tinyint(1) DEFAULT '0' COMMENT '是否搜索字段',
  `is_require_flg` tinyint(1) DEFAULT '0' COMMENT '是否必须',
  `is_multi_choice_flg` tinyint(1) DEFAULT '0' COMMENT '是否多选',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态(0-不可用,1-可用)',
  `weight` int(11) DEFAULT '0' COMMENT '权重',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='属性名表';
-- #创建属性值表
DROP TABLE IF EXISTS `my_attr_value`;
CREATE TABLE `my_attr_value` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '属性值编号',
  `name` varchar(32) DEFAULT '' COMMENT '属性值名称',
  `attr_name_id` int(11) DEFAULT '0' COMMENT '属性名编号',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态(0-不可用,1-可用)',
  `weight` int(11) DEFAULT '0' COMMENT '权重',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='属性值表';
-- #创建SKU表
DROP TABLE IF EXISTS `my_goods_sku`;
CREATE TABLE `my_goods_sku` (
  `id` int(11) NOT NULL DEFAULT '0' COMMENT 'SKU编号',
  `name` varchar(64) DEFAULT '' COMMENT 'SKU名称',
  `goods_id` int(11) DEFAULT '0' COMMENT '商品编号',
  `stock` int(11) DEFAULT '0' COMMENT '商品数量',
  `price` bigint(20) DEFAULT NULL COMMENT '商品价格',
  `properties` varchar(255) DEFAULT '' COMMENT '属性字符串(多个属性以冒号(:)隔开)',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='SKU表';
-- 商品中心 end  -------------------------------------------------------------------------------------------------------

-- 订单中心 start-------------------------------------------------------------------------------------------------------
-- #创建订单数据库
DROP DATABASE IF EXISTS `muy_order`;
CREATE DATABASE `muy_order` DEFAULT CHARACTER SET `utf8` COLLATE `utf8_general_ci`;
USE `muy_order`;
-- #创建订单表
DROP TABLE IF EXISTS `by_order`;
CREATE TABLE `by_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
  `out_trade_no` varchar(64) DEFAULT '' COMMENT '订单流水号',
  `user_id` bigint(20) DEFAULT '0' COMMENT '用户ID',
  `biz_type` tinyint(1) DEFAULT '0' COMMENT '业务类型',
  `status` tinyint(1) DEFAULT '0' COMMENT '订单状态',
  `amount` bigint(20) DEFAULT '0' COMMENT '订单总金额',
  `payed_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '支付时间',
  `expired_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '过期时间',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_out_trade_no` (`out_trade_no`) USING BTREE,
  KEY `idx_status` (`status`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=100000000000 DEFAULT CHARSET=utf8 COMMENT='订单表';
-- #创建订单详情表
DROP TABLE IF EXISTS `by_order_dtl`;
CREATE TABLE `by_order_dtl` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` varchar(64) DEFAULT '' COMMENT '订单编号',
  `status` tinyint(1) DEFAULT '0' COMMENT '订单状态',
  `amount` bigint(20) DEFAULT '0' COMMENT '订单总金额',
  `discount_amount` bigint(20) DEFAULT '0' COMMENT '优惠金额',
  `buy_number` int(11) DEFAULT '0' COMMENT '购买数量',
  `create_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  `update_time` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单详情表';
-- 订单中心 end  -------------------------------------------------------------------------------------------------------
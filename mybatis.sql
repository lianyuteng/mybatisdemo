/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2014-09-25 14:07:52
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `address`
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `t_id` int(10) NOT NULL default '0',
  `t_type` varchar(200) default NULL,
  PRIMARY KEY  (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO address VALUES ('1111', '1');
INSERT INTO address VALUES ('2222', '1');
INSERT INTO address VALUES ('3333', '1');

-- ----------------------------
-- Table structure for `mobile`
-- ----------------------------
DROP TABLE IF EXISTS `mobile`;
CREATE TABLE `mobile` (
  `id` int(10) NOT NULL default '0',
  `tel` int(20) default NULL,
  `person_id` int(10) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of mobile
-- ----------------------------

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(10) NOT NULL default '0',
  `name` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(300) default NULL,
  `password` varchar(300) default NULL,
  `type` varchar(20) default NULL,
  `id` int(11) NOT NULL default '0',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('aaaaaa', 'aaaaaaaaaaaa', 'www', '1111');
INSERT INTO user VALUES ('zhangzhixing', '1111', '1', '2222');
INSERT INTO user VALUES ('zhangzhixing', '123123', '1', '3333');

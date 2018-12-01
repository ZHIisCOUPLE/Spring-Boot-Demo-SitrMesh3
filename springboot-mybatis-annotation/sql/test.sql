/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-25 11:39:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `ctime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('944092291861315585', '33', '3333', '2017-12-22 14:28:37');
INSERT INTO `sys_user` VALUES ('944093785062899713', '444', '4', '2017-12-22 14:34:33');
INSERT INTO `sys_user` VALUES ('944094183618248705', '111', '111', '2017-12-22 14:36:08');
INSERT INTO `sys_user` VALUES ('944094436866129921', '222', '222', '2017-12-22 14:37:09');
INSERT INTO `sys_user` VALUES ('944094528725581825', '646', '3434', '2017-12-22 14:37:31');
INSERT INTO `sys_user` VALUES ('944094648951111681', '234', '12', '2017-12-22 14:37:59');

-- ----------------------------
-- Table structure for sys_user_addr
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_addr`;
CREATE TABLE `sys_user_addr` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_addr
-- ----------------------------
INSERT INTO `sys_user_addr` VALUES ('1', '1', '944092291861315585');
INSERT INTO `sys_user_addr` VALUES ('2', '2', '944092291861315585');
INSERT INTO `sys_user_addr` VALUES ('3', '3', '944092291861315585');

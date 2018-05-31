/*
Navicat MySQL Data Transfer

Source Server         : zheng
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : ssmdemo

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-05-31 18:04:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_user
-- ----------------------------
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_user
-- ----------------------------
INSERT INTO `tbl_user` VALUES ('1', 'zhengke', '123456');
INSERT INTO `tbl_user` VALUES ('3', '郑科1', '123456');
INSERT INTO `tbl_user` VALUES ('4', '郑科2', '0000');
INSERT INTO `tbl_user` VALUES ('5', '郑科3', '0000');
INSERT INTO `tbl_user` VALUES ('6', '郑科4', '0000');

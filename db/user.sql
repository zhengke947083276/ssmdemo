/*
Navicat MySQL Data Transfer

Source Server         : zhengke
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-06-23 01:17:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_address
-- ----------------------------
DROP TABLE IF EXISTS `tbl_address`;
CREATE TABLE `tbl_address` (
  `address_id` int(10) NOT NULL AUTO_INCREMENT,
  `address_name` char(20) NOT NULL,
  `shopper_Id` int(10) NOT NULL,
  PRIMARY KEY (`address_id`),
  KEY `shopper_Id` (`shopper_Id`),
  CONSTRAINT `tbl_address_ibfk_1` FOREIGN KEY (`shopper_Id`) REFERENCES `tbl_shopper` (`shopper_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_address
-- ----------------------------
INSERT INTO `tbl_address` VALUES ('1', '陕西省宝鸡市渭滨区', '3');
INSERT INTO `tbl_address` VALUES ('2', '陕西省西安市户县', '3');
INSERT INTO `tbl_address` VALUES ('3', '陕西省安康市紫阳县', '3');

-- ----------------------------
-- Table structure for tbl_goods
-- ----------------------------
DROP TABLE IF EXISTS `tbl_goods`;
CREATE TABLE `tbl_goods` (
  `goods_id` int(20) NOT NULL AUTO_INCREMENT,
  `goods_name` char(20) NOT NULL,
  `goods_number` int(20) NOT NULL,
  `goods_price` double(10,2) NOT NULL,
  `goodstype_id` int(10) NOT NULL,
  PRIMARY KEY (`goods_id`),
  KEY `goodstype_id` (`goodstype_id`),
  CONSTRAINT `tbl_goods_ibfk_1` FOREIGN KEY (`goodstype_id`) REFERENCES `tbl_goodstype` (`goodstype_id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_goods
-- ----------------------------
INSERT INTO `tbl_goods` VALUES ('1', '舒肤佳沐浴露', '200', '30.00', '1');
INSERT INTO `tbl_goods` VALUES ('2', '力士沐浴露', '200', '25.00', '1');
INSERT INTO `tbl_goods` VALUES ('3', '潘婷洗发水', '200', '32.00', '2');
INSERT INTO `tbl_goods` VALUES ('4', '飘柔洗发水', '200', '28.00', '2');
INSERT INTO `tbl_goods` VALUES ('5', '曼秀雷敦洗面奶', '200', '45.00', '3');
INSERT INTO `tbl_goods` VALUES ('6', '欧莱雅洗面奶', '200', '42.00', '3');
INSERT INTO `tbl_goods` VALUES ('7', '舒肤佳洗手液', '200', '12.00', '4');
INSERT INTO `tbl_goods` VALUES ('8', '力士洗手液', '200', '10.00', '4');
INSERT INTO `tbl_goods` VALUES ('9', '曼秀莱顿爽肤水', '200', '23.00', '5');
INSERT INTO `tbl_goods` VALUES ('10', '欧莱雅爽肤水', '200', '25.00', '5');
INSERT INTO `tbl_goods` VALUES ('11', '香奈儿眼霜', '200', '688.00', '6');
INSERT INTO `tbl_goods` VALUES ('12', '欧莱雅眼霜', '200', '230.00', '6');
INSERT INTO `tbl_goods` VALUES ('13', '兰蔻小黑瓶眼霜', '200', '500.00', '6');
INSERT INTO `tbl_goods` VALUES ('14', '香奈儿护手霜', '200', '265.00', '7');
INSERT INTO `tbl_goods` VALUES ('15', '欧莱雅护手霜', '200', '165.00', '7');
INSERT INTO `tbl_goods` VALUES ('16', '兰蔻护手霜', '200', '105.00', '7');
INSERT INTO `tbl_goods` VALUES ('17', '香奈儿防晒霜', '200', '520.00', '8');
INSERT INTO `tbl_goods` VALUES ('18', '曼秀雷敦防晒霜', '200', '230.00', '8');
INSERT INTO `tbl_goods` VALUES ('19', '大宝防晒霜', '200', '20.00', '8');
INSERT INTO `tbl_goods` VALUES ('20', '曼秀雷敦面膜', '200', '268.00', '9');
INSERT INTO `tbl_goods` VALUES ('21', '欧莱雅面膜', '200', '165.00', '9');
INSERT INTO `tbl_goods` VALUES ('22', '一叶子面膜', '200', '685.00', '9');
INSERT INTO `tbl_goods` VALUES ('23', '雅诗兰黛遮瑕', '200', '356.00', '10');
INSERT INTO `tbl_goods` VALUES ('24', '自然堂遮瑕', '200', '266.00', '10');
INSERT INTO `tbl_goods` VALUES ('25', '雅诗兰黛粉底', '200', '265.00', '11');
INSERT INTO `tbl_goods` VALUES ('26', '自然堂粉底', '200', '455.00', '11');
INSERT INTO `tbl_goods` VALUES ('27', '兰蔻睫毛膏', '200', '455.00', '12');
INSERT INTO `tbl_goods` VALUES ('28', '香奈儿睫毛膏', '200', '566.00', '12');
INSERT INTO `tbl_goods` VALUES ('29', '兰蔻眉笔', '200', '420.00', '13');
INSERT INTO `tbl_goods` VALUES ('30', '香奈儿眉笔', '200', '500.00', '13');
INSERT INTO `tbl_goods` VALUES ('31', '雅诗兰黛BB霜', '200', '235.00', '14');
INSERT INTO `tbl_goods` VALUES ('32', '自然堂BB霜', '200', '156.00', '14');
INSERT INTO `tbl_goods` VALUES ('33', '雅诗兰黛口红', '200', '156.00', '15');
INSERT INTO `tbl_goods` VALUES ('34', '香奈儿口红', '200', '1000.00', '15');
INSERT INTO `tbl_goods` VALUES ('35', '欧莱雅口红', '200', '500.00', '15');
INSERT INTO `tbl_goods` VALUES ('36', '大宝口红', '200', '12.00', '15');
INSERT INTO `tbl_goods` VALUES ('37', '雅诗兰黛卸妆水', '200', '45.00', '16');
INSERT INTO `tbl_goods` VALUES ('38', '欧莱雅卸妆水', '200', '44.00', '16');

-- ----------------------------
-- Table structure for tbl_goodstype
-- ----------------------------
DROP TABLE IF EXISTS `tbl_goodstype`;
CREATE TABLE `tbl_goodstype` (
  `goodstype_id` int(10) NOT NULL AUTO_INCREMENT,
  `goodstype_name` char(20) NOT NULL,
  PRIMARY KEY (`goodstype_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_goodstype
-- ----------------------------
INSERT INTO `tbl_goodstype` VALUES ('1', '洗浴-沐浴露');
INSERT INTO `tbl_goodstype` VALUES ('2', '洗浴-洗发水');
INSERT INTO `tbl_goodstype` VALUES ('3', '洗浴-洗面奶');
INSERT INTO `tbl_goodstype` VALUES ('4', '洗浴-洗手液');
INSERT INTO `tbl_goodstype` VALUES ('5', '护肤-爽肤水');
INSERT INTO `tbl_goodstype` VALUES ('6', '护肤-眼霜');
INSERT INTO `tbl_goodstype` VALUES ('7', '护肤-护手霜');
INSERT INTO `tbl_goodstype` VALUES ('8', '护肤-防晒霜');
INSERT INTO `tbl_goodstype` VALUES ('9', '护肤-面膜');
INSERT INTO `tbl_goodstype` VALUES ('10', '彩妆-遮瑕');
INSERT INTO `tbl_goodstype` VALUES ('11', '彩妆-粉底');
INSERT INTO `tbl_goodstype` VALUES ('12', '彩妆-睫毛');
INSERT INTO `tbl_goodstype` VALUES ('13', '彩妆-眉笔');
INSERT INTO `tbl_goodstype` VALUES ('14', '彩妆-BB霜');
INSERT INTO `tbl_goodstype` VALUES ('15', '彩妆-唇膏/口红');
INSERT INTO `tbl_goodstype` VALUES ('16', '彩妆-卸妆水');

-- ----------------------------
-- Table structure for tbl_order
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order` (
  `order_id` int(20) NOT NULL AUTO_INCREMENT,
  `shopper_Id` int(10) NOT NULL,
  `goods_id` int(20) NOT NULL,
  `order_state` int(10) NOT NULL,
  `goods_number` int(10) NOT NULL,
  `order_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `shopper_Id` (`shopper_Id`),
  KEY `goods_id` (`goods_id`),
  CONSTRAINT `tbl_order_ibfk_1` FOREIGN KEY (`shopper_Id`) REFERENCES `tbl_shopper` (`shopper_Id`),
  CONSTRAINT `tbl_order_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `tbl_goods` (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_order
-- ----------------------------
INSERT INTO `tbl_order` VALUES ('17', '1', '1', '1', '5', '2018-06-22 23:14:05');
INSERT INTO `tbl_order` VALUES ('19', '3', '2', '1', '1', '2018-06-22 23:31:48');
INSERT INTO `tbl_order` VALUES ('20', '3', '3', '1', '2', '2018-06-22 23:31:49');
INSERT INTO `tbl_order` VALUES ('22', '3', '5', '1', '21', '2018-06-22 23:52:14');
INSERT INTO `tbl_order` VALUES ('23', '3', '18', '1', '1', '2018-06-23 00:11:05');

-- ----------------------------
-- Table structure for tbl_shopper
-- ----------------------------
DROP TABLE IF EXISTS `tbl_shopper`;
CREATE TABLE `tbl_shopper` (
  `shopper_Id` int(10) NOT NULL AUTO_INCREMENT,
  `shopper_telnum` char(20) NOT NULL,
  `shopper_password` char(20) DEFAULT NULL,
  `shopper_sex` bit(1) DEFAULT NULL,
  `shopper_age` int(5) DEFAULT NULL,
  `shopper_job` char(50) DEFAULT NULL,
  PRIMARY KEY (`shopper_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_shopper
-- ----------------------------
INSERT INTO `tbl_shopper` VALUES ('1', '13629173745', '0000', '', '20', '学生');
INSERT INTO `tbl_shopper` VALUES ('2', '17868875849', '0000', null, null, null);
INSERT INTO `tbl_shopper` VALUES ('3', '17868875862', '0000', '\0', '22', 'IT');

-- ----------------------------
-- Table structure for tbl_shops
-- ----------------------------
DROP TABLE IF EXISTS `tbl_shops`;
CREATE TABLE `tbl_shops` (
  `shops_id` int(20) NOT NULL AUTO_INCREMENT,
  `shops_telnum` char(20) NOT NULL,
  `shops_password` char(20) NOT NULL,
  PRIMARY KEY (`shops_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_shops
-- ----------------------------

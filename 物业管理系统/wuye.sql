/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : wuye

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-05-28 15:45:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `building`
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building` (
  `FloorNumber` varchar(20) NOT NULL,
  `UnitNumber` varchar(20) NOT NULL,
  `RoomNumber` varchar(20) NOT NULL,
  `Hoster` varchar(20) NOT NULL,
  `HosterID` varchar(20) NOT NULL,
  `HosterPhone` varchar(20) NOT NULL,
  `RepairManagement` varchar(20) NOT NULL,
  PRIMARY KEY (`RoomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of building
-- ----------------------------
INSERT INTO `building` VALUES ('1', '1', '1101', '杨先生', '1311106', '1236985647', '需要修理');
INSERT INTO `building` VALUES ('1', '1', '1102', '无', '无', '无', '无需修理');
INSERT INTO `building` VALUES ('1', '1', '1201', '无', '无', '无', '无需修理');
INSERT INTO `building` VALUES ('1', '1', '1202', '无', '无', '无', '无需修理');
INSERT INTO `building` VALUES ('1', '1', '1301', '无 ', '无', '无', '无需修理');
INSERT INTO `building` VALUES ('1', '1', '1302', '无', '无', '无', '无需修理');
INSERT INTO `building` VALUES ('1', '2', '2101', '无', '无', '无', '无需修理');
INSERT INTO `building` VALUES ('1', '2', '2102', '无', '无', '无', '无需修理');

-- ----------------------------
-- Table structure for `building2`
-- ----------------------------
DROP TABLE IF EXISTS `building2`;
CREATE TABLE `building2` (
  `FloorNumber` varchar(20) NOT NULL,
  `UniteNumber` varchar(20) NOT NULL,
  `RoomNumber` varchar(20) NOT NULL,
  `Hoster` varchar(20) NOT NULL,
  `HosterID` varchar(20) NOT NULL,
  `HosterPhone` varchar(20) NOT NULL,
  `RepairManagement` varchar(20) NOT NULL,
  PRIMARY KEY (`RoomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of building2
-- ----------------------------
INSERT INTO `building2` VALUES ('2', '1', '1101', '明明', '1311107', '123695874', '需要修理');
INSERT INTO `building2` VALUES ('2', '1', '1102', '无', '无', '无', '无');
INSERT INTO `building2` VALUES ('2', '2', '2101', '无', '无', '无', '无');
INSERT INTO `building2` VALUES ('2', '2', '2102', '无', '无', '无', '无');

-- ----------------------------
-- Table structure for `hoster`
-- ----------------------------
DROP TABLE IF EXISTS `hoster`;
CREATE TABLE `hoster` (
  `HosterName` varchar(20) NOT NULL,
  `HosterID` varchar(20) NOT NULL,
  `HoserPhone` varchar(20) NOT NULL,
  `PropertyCosts` varchar(20) NOT NULL,
  `Deposit` varchar(20) NOT NULL,
  PRIMARY KEY (`HosterID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hoster
-- ----------------------------
INSERT INTO `hoster` VALUES ('王五', '1311101', '123456789', '已交', '0');
INSERT INTO `hoster` VALUES ('李明', '1311102', '987654321', '已交', '5');
INSERT INTO `hoster` VALUES ('李明', '1311103', '147896532', '未交', '10');
INSERT INTO `hoster` VALUES ('王力', '1311104', '159876432', '已交', '0');
INSERT INTO `hoster` VALUES ('王红', '1311105', '159874236', '未交', '12');
INSERT INTO `hoster` VALUES ('杨先生', '1311106', '1236985647', '已交', '20');
INSERT INTO `hoster` VALUES ('明明', '1311107', '123695874', '未交', '10');

-- ----------------------------
-- Table structure for `login`
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('123', '321');
INSERT INTO `login` VALUES ('王五', '123');

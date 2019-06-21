/*
Navicat MySQL Data Transfer

Source Server         : SQL
Source Server Version : 50096
Source Host           : 127.0.0.1:3306
Source Database       : song

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2019-06-21 17:23:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ad
-- ----------------------------
DROP TABLE IF EXISTS `ad`;
CREATE TABLE `ad` (
  `adname` varchar(20) NOT NULL,
  `adpw` varchar(20) NOT NULL,
  PRIMARY KEY  (`adname`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of ad
-- ----------------------------
INSERT INTO `ad` VALUES ('xiaoming', '123456');

-- ----------------------------
-- Table structure for avatar
-- ----------------------------
DROP TABLE IF EXISTS `avatar`;
CREATE TABLE `avatar` (
  `user` varchar(255) default NULL,
  `url` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of avatar
-- ----------------------------
INSERT INTO `avatar` VALUES ('1231', 'C:\\Users\\Ethan\\Desktop\\jpeg\\8.jpg');
INSERT INTO `avatar` VALUES ('11111', 'C:\\Users\\Ethan\\Desktop\\jpeg\\17.jpg');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `sid` varchar(20) NOT NULL,
  `comment` text NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('7', '123111', '1231');
INSERT INTO `comment` VALUES ('1', '123111', '1231');

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `Author` varchar(20) default NULL,
  `time` varchar(20) NOT NULL,
  `pid` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of song
-- ----------------------------
INSERT INTO `song` VALUES ('1', '鸡你太美', '坤坤', '3.2', '4');
INSERT INTO `song` VALUES ('2', '鸡你不美', '琨琨', '3.2', '1');
INSERT INTO `song` VALUES ('3', '鸡你到底美不美', '昆昆', '3.2', '3');
INSERT INTO `song` VALUES ('4', '鸡你有点美', '困困', '3.2', '2');
INSERT INTO `song` VALUES ('5', '鸡你不是很美', '捆捆', '3.2', '5');
INSERT INTO `song` VALUES ('6', '鸡你是个什么玩意', '琨琨', '3.2', '7');
INSERT INTO `song` VALUES ('7', '鸡打篮球', '堃堃', '3.2', '6');
INSERT INTO `song` VALUES ('8', '球你太美', '菜菜', '3.2', '8');
INSERT INTO `song` VALUES ('9', '球你不美', '踩踩', '3.2', '0');
INSERT INTO `song` VALUES ('10', '球你到底美不美', '采采', '3.2', '9');
INSERT INTO `song` VALUES ('11', '球你有点美', '猜猜', '3.2', null);
INSERT INTO `song` VALUES ('12', '球你不是很美', '拆拆', '3.2', null);

-- ----------------------------
-- Table structure for star
-- ----------------------------
DROP TABLE IF EXISTS `star`;
CREATE TABLE `star` (
  `username` varchar(255) default NULL,
  `songname` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of star
-- ----------------------------
INSERT INTO `star` VALUES ('1231', '3');
INSERT INTO `star` VALUES ('1231', '1');

-- ----------------------------
-- Table structure for temporary
-- ----------------------------
DROP TABLE IF EXISTS `temporary`;
CREATE TABLE `temporary` (
  `id` int(11) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of temporary
-- ----------------------------
INSERT INTO `temporary` VALUES ('2');

-- ----------------------------
-- Table structure for temporary1
-- ----------------------------
DROP TABLE IF EXISTS `temporary1`;
CREATE TABLE `temporary1` (
  `name` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of temporary1
-- ----------------------------
INSERT INTO `temporary1` VALUES ('1231');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `star` text,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('11111', '1111', null);
INSERT INTO `user` VALUES ('1231', '123123', null);

/*
 Navicat Premium Data Transfer

 Source Server         : cloud_project
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : cloud_test

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 08/11/2019 20:35:40
*/
-- create user 'cloud'@'%' identified by 'cloud';
-- create database cloud_test1 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- create database cloud_test2 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- create database cloud_test3 DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- grant create,alter,drop,select,insert,update,delete,REFERENCES on cloud_test1.* to cloud@'%';
-- grant create,alter,drop,select,insert,update,delete,REFERENCES on cloud_test2.* to cloud@'%';
-- grant create,alter,drop,select,insert,update,delete,REFERENCES on cloud_test3.* to cloud@'%';
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `db_source` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dept_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', DATABASE());
INSERT INTO `dept` VALUES ('2', 'womende', DATABASE());
INSERT INTO `dept` VALUES ('4', '销售部', DATABASE());
INSERT INTO `dept` VALUES ('5', '网络部', DATABASE());

SET FOREIGN_KEY_CHECKS = 1;

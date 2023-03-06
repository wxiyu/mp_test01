/*
 Navicat Premium Data Transfer

 Source Server         : localhostPro
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : javaee

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 06/03/2023 10:43:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1631095335115350017 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'Jone', 18, 'test1@baomidou.com');
INSERT INTO `sys_user` VALUES (2, 'Jack', 20, 'test2@baomidou.com');
INSERT INTO `sys_user` VALUES (3, 'Tom', 28, 'test3@baomidou.com');
INSERT INTO `sys_user` VALUES (4, 'Sandy', 21, 'test4@baomidou.com');
INSERT INTO `sys_user` VALUES (5, 'Billie', 24, 'test5@baomidou.com');
INSERT INTO `sys_user` VALUES (6, 'xiao a giao', 20, '789456@qq.com');
INSERT INTO `sys_user` VALUES (1630853822371057666, 'xiao x x', 20, '1234566@qq.com');
INSERT INTO `sys_user` VALUES (1631095047595835394, NULL, NULL, NULL);
INSERT INTO `sys_user` VALUES (1631095335115350017, 'liuliuliu', 66, 'lululu.@com');

SET FOREIGN_KEY_CHECKS = 1;

/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50623
Source Host           : localhost:3306
Source Database       : ibuy

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2015-04-01 14:55:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(60) NOT NULL,
  `postcode` varchar(6) NOT NULL,
  `pohone_num` varchar(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT '1',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_address_user_id_idx` (`user_id`),
  CONSTRAINT `FK_address_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `total_price` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cart_user_id_idx` (`user_id`),
  CONSTRAINT `FK_cart_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cart_goods
-- ----------------------------
DROP TABLE IF EXISTS `cart_goods`;
CREATE TABLE `cart_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cart_id` int(11) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `amount` int(11) NOT NULL DEFAULT '1',
  `status` smallint(6) NOT NULL DEFAULT '1',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_cart_goods_cart_id_idx` (`cart_id`),
  KEY `FK_cart_goods_goods_id_idx` (`goods_id`),
  CONSTRAINT `FK_cart_goods_cart_id` FOREIGN KEY (`cart_id`) REFERENCES `cart` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_cart_goods_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) NOT NULL,
  `upid` int(11) NOT NULL DEFAULT '0',
  `status` smallint(6) NOT NULL DEFAULT '1',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` int(11) NOT NULL,
  `storage` int(11) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `img_address` varchar(45) DEFAULT NULL,
  `category_id` int(11) NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT '1',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_category_id` (`category_id`),
  CONSTRAINT `FK_category_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `address_id` int(11) NOT NULL,
  `total_price` float NOT NULL,
  `order_status` int(11) NOT NULL DEFAULT '0',
  `status` smallint(6) NOT NULL DEFAULT '1',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_order_user_id_idx` (`user_id`),
  KEY `FK_order_address_id_idx` (`address_id`),
  CONSTRAINT `FK_order_address_id` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_order_user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `goods_id` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `goods_size` varchar(5) NOT NULL,
  `goods_color` varchar(5) NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT '1',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_order_goods_order_id_idx` (`order_id`),
  KEY `FK_order_goods_goods_id_idx` (`goods_id`),
  CONSTRAINT `FK_order_goods_goods_id` FOREIGN KEY (`goods_id`) REFERENCES `goods` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_order_goods_order_id` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone_num` varchar(11) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT '0',
  `created_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

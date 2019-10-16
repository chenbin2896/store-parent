/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50718
Source Host           : cdb-kvwt5r3g.bj.tencentcdb.com:10193
Source Database       : auction_store

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2019-10-06 17:12:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(11) DEFAULT NULL COMMENT '管理员账号',
  `admin_pass` varchar(11) DEFAULT NULL COMMENT '管理员密码',
  `admin_phone` varchar(11) DEFAULT NULL COMMENT '管理员手机',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES ('1', 'mnb876', '108642qw', '18436652700');
INSERT INTO `t_admin` VALUES ('2', 'mnb098', '109864uy', '18435601212');
INSERT INTO `t_admin` VALUES ('3', 'mnb907', '120988yu', '18390981208');
INSERT INTO `t_admin` VALUES ('4', 'lkj87650', '324878op', '15834908722');
INSERT INTO `t_admin` VALUES ('5', 'lkj89007', '908778ii', '13572899076');
INSERT INTO `t_admin` VALUES ('6', 'jik98076', '234890io', '18760778907');
INSERT INTO `t_admin` VALUES ('7', 'kli87900', '890377rr', '19023876809');
INSERT INTO `t_admin` VALUES ('8', 'juh8734', '234900jie', '18609276226');
INSERT INTO `t_admin` VALUES ('9', 'hjiu3876', '987640ki', '18876089625');
INSERT INTO `t_admin` VALUES ('10', 'kil89034', '90872uiw', '18760987628');
INSERT INTO `t_admin` VALUES ('11', 'jhjh5678', '098766po', '18765909084');

-- ----------------------------
-- Table structure for t_auction
-- ----------------------------
DROP TABLE IF EXISTS `t_auction`;
CREATE TABLE `t_auction` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `deposit` double DEFAULT NULL COMMENT '保证金（押金）',
  `u_bid` int(11) DEFAULT NULL COMMENT '买家id',
  `u_sid` int(11) DEFAULT NULL COMMENT '卖家id',
  `agid` int(11) DEFAULT NULL COMMENT '竞拍商品',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_auction
-- ----------------------------
INSERT INTO `t_auction` VALUES ('1', '300', '1', '1', '1');
INSERT INTO `t_auction` VALUES ('2', '200', '2', '2', '2');
INSERT INTO `t_auction` VALUES ('3', '50', '3', '3', '3');
INSERT INTO `t_auction` VALUES ('4', '70', '4', '4', '4');
INSERT INTO `t_auction` VALUES ('5', '100', '5', '5', '5');
INSERT INTO `t_auction` VALUES ('6', '200', '6', '6', '6');
INSERT INTO `t_auction` VALUES ('7', '20', '7', '7', '7');
INSERT INTO `t_auction` VALUES ('8', '50', '8', '8', '8');
INSERT INTO `t_auction` VALUES ('9', '220', '9', '9', '9');
INSERT INTO `t_auction` VALUES ('10', '10', '10', '10', '10');
INSERT INTO `t_auction` VALUES ('11', '80', '11', '11', '11');

-- ----------------------------
-- Table structure for t_auctiongoods
-- ----------------------------
DROP TABLE IF EXISTS `t_auctiongoods`;
CREATE TABLE `t_auctiongoods` (
  `agid` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) DEFAULT NULL COMMENT '商品id',
  `first_price` double DEFAULT NULL COMMENT '起拍价',
  `add_price` double DEFAULT NULL COMMENT '加价幅度',
  `start_time` datetime DEFAULT NULL COMMENT '起拍时间',
  `ending_time` datetime DEFAULT NULL COMMENT '结束时间',
  `focus_num` int(11) DEFAULT NULL COMMENT '围观次数',
  `current_price` double DEFAULT NULL COMMENT '当前价格',
  `actual_participate_count` int(11) DEFAULT NULL COMMENT '实际参拍人数',
  `ending_price` double DEFAULT NULL COMMENT '结束价（无论是流拍还是成交都有结束价）',
  PRIMARY KEY (`agid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_auctiongoods
-- ----------------------------
INSERT INTO `t_auctiongoods` VALUES ('1', '2896344', '3800', '300', '2019-10-01 10:12:33', '2019-10-01 17:14:48', '4', '3900', '30', '3950');
INSERT INTO `t_auctiongoods` VALUES ('2', '98267321', '2000', '100', '2019-10-02 12:12:42', '2019-10-02 18:15:07', '5', '2050', '20', '2080');
INSERT INTO `t_auctiongoods` VALUES ('3', '8931233', '700', '100', '2019-09-27 15:13:01', '2019-09-27 17:15:14', '7', '750', '32', '800');
INSERT INTO `t_auctiongoods` VALUES ('4', '6792318', '300', '100', '2019-09-26 15:13:10', '2019-09-26 17:16:04', '8', '350', '23', '410');
INSERT INTO `t_auctiongoods` VALUES ('5', '9837321', '600', '50', '2019-09-28 17:13:23', '2019-09-28 19:16:25', '9', '610', '34', '650');
INSERT INTO `t_auctiongoods` VALUES ('6', '83734421', '1000', '100', '2019-10-03 15:13:33', '2019-10-03 17:16:44', '10', '1050', '35', '1100');
INSERT INTO `t_auctiongoods` VALUES ('7', '6378222', '100', '50', '2019-10-03 14:13:49', '2019-10-03 16:16:58', '3', '125', '40', '160');
INSERT INTO `t_auctiongoods` VALUES ('8', '2087458', '100', '50', '2019-10-04 13:13:57', '2019-10-04 15:17:12', '8', '125', '30', '150');
INSERT INTO `t_auctiongoods` VALUES ('9', '9086532', '400', '100', '2019-10-04 17:14:04', '2019-10-04 19:17:59', '7', '450', '20', '500');
INSERT INTO `t_auctiongoods` VALUES ('10', '9765433', '50', '20', '2019-10-03 16:14:10', '2019-10-03 18:18:20', '5', '55', '6', '70');
INSERT INTO `t_auctiongoods` VALUES ('11', '9876543', '100', '30', '2019-10-02 17:14:37', '2019-10-02 19:18:41', '7', '110', '4', '130');

-- ----------------------------
-- Table structure for t_category
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL COMMENT '类别名',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_category
-- ----------------------------
INSERT INTO `t_category` VALUES ('1', '家庭电器');
INSERT INTO `t_category` VALUES ('2', '电子产品');
INSERT INTO `t_category` VALUES ('3', '化妆用品');
INSERT INTO `t_category` VALUES ('4', '服装用品');
INSERT INTO `t_category` VALUES ('5', '食物');
INSERT INTO `t_category` VALUES ('6', '学习用品');
INSERT INTO `t_category` VALUES ('7', '装饰用品');

-- ----------------------------
-- Table structure for t_favorites
-- ----------------------------
DROP TABLE IF EXISTS `t_favorites`;
CREATE TABLE `t_favorites` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  `gid` int(11) DEFAULT NULL COMMENT '商品id',
  `createtime` datetime NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_favorites
-- ----------------------------
INSERT INTO `t_favorites` VALUES ('1', '1', '1', '2019-09-29 18:12:19');
INSERT INTO `t_favorites` VALUES ('2', '2', '2', '2019-09-30 17:12:40');
INSERT INTO `t_favorites` VALUES ('3', '3', '3', '2019-10-25 17:13:53');
INSERT INTO `t_favorites` VALUES ('4', '4', '4', '2019-09-24 17:14:11');
INSERT INTO `t_favorites` VALUES ('5', '5', '5', '2019-09-26 17:14:31');
INSERT INTO `t_favorites` VALUES ('6', '6', '6', '2019-10-01 17:14:49');
INSERT INTO `t_favorites` VALUES ('7', '7', '7', '2019-10-01 17:15:02');
INSERT INTO `t_favorites` VALUES ('8', '8', '8', '2019-10-02 17:15:16');
INSERT INTO `t_favorites` VALUES ('9', '9', '9', '2019-10-02 17:15:27');
INSERT INTO `t_favorites` VALUES ('10', '10', '10', '2019-10-01 17:15:41');
INSERT INTO `t_favorites` VALUES ('11', '11', '11', '2019-09-30 17:15:47');

-- ----------------------------
-- Table structure for t_finance
-- ----------------------------
DROP TABLE IF EXISTS `t_finance`;
CREATE TABLE `t_finance` (
  `finnanceId` int(11) NOT NULL AUTO_INCREMENT,
  `order_generate_id` int(11) DEFAULT NULL COMMENT '订单号',
  `gid` int(11) DEFAULT NULL COMMENT '商品id，外键到商品表（取商品描述）',
  `deal_time` datetime DEFAULT NULL COMMENT '交易时间（来自订单表）',
  `deal_price` double DEFAULT NULL COMMENT '成交金额（来自订单表）',
  `commission` double DEFAULT NULL COMMENT '订单表的佣金金额（即使退货，也不退佣金，所以订单状态与收入无关）',
  `total_revenue` double DEFAULT NULL COMMENT '总计收入',
  `u_bid` int(11) DEFAULT NULL COMMENT '买家id，外键到用户id（来自订单表）',
  `s_sid` int(11) DEFAULT NULL COMMENT '卖家id，外键到用户id（来自订单表）',
  `payment_channel` varchar(255) DEFAULT NULL COMMENT '支付渠道（支付宝、微信、银行卡）（来自订单表）',
  PRIMARY KEY (`finnanceId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance
-- ----------------------------
INSERT INTO `t_finance` VALUES ('1', '1', '1', '2019-09-30 18:08:06', '3900', '300', '500', '1', '1', '微信1209873');
INSERT INTO `t_finance` VALUES ('2', '2', '2', '2019-10-01 18:08:22', '2050', '100', '300', '2', '2', '支付宝90923');
INSERT INTO `t_finance` VALUES ('3', '3', '3', '2019-09-26 18:08:38', '750', '20', '30', '3', '3', '网银18654444333563');
INSERT INTO `t_finance` VALUES ('4', '4', '4', '2019-09-25 18:08:51', '350', '30', '40', '4', '4', '微信12094573');
INSERT INTO `t_finance` VALUES ('5', '5', '5', '2019-09-27 18:09:02', '610', '20', '20', '5', '5', '网银18654438333563');
INSERT INTO `t_finance` VALUES ('6', '6', '6', '2019-10-02 18:09:19', '1050', '200', '100', '6', '6', '微信1209073');
INSERT INTO `t_finance` VALUES ('7', '7', '7', '2019-10-02 18:09:29', '125', '50', '60', '7', '7', '支付宝90223');
INSERT INTO `t_finance` VALUES ('8', '8', '8', '2019-10-03 18:09:41', '1050', '20', '30', '8', '8', '微信1349873');
INSERT INTO `t_finance` VALUES ('9', '9', '9', '2019-10-03 18:10:10', '450', '30', '20', '9', '9', '网银18655544333563');
INSERT INTO `t_finance` VALUES ('10', '10', '10', '2019-10-02 18:10:20', '55', '10', '10', '10', '10', '微信1287873');
INSERT INTO `t_finance` VALUES ('11', '11', '11', '2019-10-01 18:10:24', '110', '20', '30', '11', '11', '支付宝97623');

-- ----------------------------
-- Table structure for t_getAddress
-- ----------------------------
DROP TABLE IF EXISTS `t_getAddress`;
CREATE TABLE `t_getAddress` (
  `getid` int(11) NOT NULL AUTO_INCREMENT,
  `province` varchar(30) DEFAULT NULL COMMENT '省',
  `city` varchar(30) DEFAULT NULL COMMENT '市 ',
  `county` varchar(30) DEFAULT NULL COMMENT '县/区',
  `detail` varchar(30) DEFAULT NULL COMMENT '详细地址',
  `get_person` varchar(30) DEFAULT NULL COMMENT '收货人',
  `get_tel` varchar(30) DEFAULT NULL COMMENT '收货人电话',
  `uid` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`getid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_getAddress
-- ----------------------------
INSERT INTO `t_getAddress` VALUES ('1', '浙江省', '湖州市', '织里镇', '湖州市织里镇', '嫁风', '18436652700', '1');
INSERT INTO `t_getAddress` VALUES ('2', '浙江省', '杭州', '余杭区', '杭州余杭区', '梦瑶', '18435601212', '2');
INSERT INTO `t_getAddress` VALUES ('3', '浙江省', '桐乡市', '濮院镇', '桐乡市濮院镇', '月棠', '18390981208', '3');
INSERT INTO `t_getAddress` VALUES ('4', '上海', '奉贤区', '青村', '奉贤区青村', '傲晴', '15834908722', '4');
INSERT INTO `t_getAddress` VALUES ('5', '上海', '金山区', '新农镇', '金山区新农镇', '玉双', '13572899076', '5');
INSERT INTO `t_getAddress` VALUES ('6', '上海', '松江区', '永丰街', '松江区永丰街', '霓初', '18760778907', '6');
INSERT INTO `t_getAddress` VALUES ('7', '吉林', '长春', '朝阳区', '长春朝阳区', '天春', '19023876809', '7');
INSERT INTO `t_getAddress` VALUES ('8', '吉林', '公主岭', '秦家屯镇', '公主岭秦家屯镇', '故梦', '18609276226', '8');
INSERT INTO `t_getAddress` VALUES ('9', '河南', '安阳', '白壁镇', '安阳白壁镇', '芷蕾', '18876089625', '9');
INSERT INTO `t_getAddress` VALUES ('10', '河南', '鹤壁', '山城区', '鹤壁山城区', '若昭', '18760987628', '10');
INSERT INTO `t_getAddress` VALUES ('11', '重庆', '江北', '金源路', '江北金源路', '小鱼', '18765909084', '11');
INSERT INTO `t_getAddress` VALUES ('12', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for t_goods
-- ----------------------------
DROP TABLE IF EXISTS `t_goods`;
CREATE TABLE `t_goods` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `gname` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `uid` int(11) DEFAULT NULL COMMENT '该拍品属于哪个用户',
  `upload_time` datetime DEFAULT NULL COMMENT '该商品的上传时间（商品的最后一次编辑时间）',
  `good_status` varchar(255) DEFAULT NULL COMMENT '竞拍状态（待拍卖，拍卖中，已成交，流拍……)',
  `cid` int(11) DEFAULT NULL COMMENT '类别',
  `remark` varchar(255) DEFAULT NULL COMMENT '描述',
  `addressid` varchar(255) DEFAULT NULL COMMENT '发布地址',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_goods
-- ----------------------------
INSERT INTO `t_goods` VALUES ('1', '手机', '1', '2019-10-01 19:49:33', '拍卖中', '2', '银色', '浙江省湖州市织里镇');
INSERT INTO `t_goods` VALUES ('2', '单肩包中号黑色', '2', '2019-09-30 08:01:57', '已成交', '7', '黑色', '浙江省杭州余杭区');
INSERT INTO `t_goods` VALUES ('3', '针织马甲背心', '3', '2019-09-29 09:04:57', '已成交', '4', '米白色', '浙江省嘉兴市桐乡市濮院镇');
INSERT INTO `t_goods` VALUES ('4', '珍珠面膜蜂蜜急救', '4', '2019-10-01 09:10:48', '已成交', '3', '无', '上海奉贤区青村');
INSERT INTO `t_goods` VALUES ('5', 'one中性香水', '5', '2019-09-30 11:31:02', '已成交', '3', '无', '上海金山区新农镇');
INSERT INTO `t_goods` VALUES ('6', '运动鞋AR4237-300', '6', '2019-09-06 09:31:14', '拍卖中', '4', '灰色', '上海松江区永丰街');
INSERT INTO `t_goods` VALUES ('7', '玫瑰花蕾膏润唇膏', '7', '2019-10-11 09:31:21', '已成交', '3', '粉红色', '吉林长春朝阳区');
INSERT INTO `t_goods` VALUES ('8', '手持挂烫机', '8', '2019-10-24 09:31:26', '拍卖中', '1', '黑色', '吉林公主岭秦家屯镇');
INSERT INTO `t_goods` VALUES ('9', '女士14k金尖钢笔', '9', '2019-11-01 08:31:30', '已成交', '6', '白色', '河南安阳白壁镇');
INSERT INTO `t_goods` VALUES ('10', '枸杞', '10', '2019-10-17 13:31:43', '已成交', '5', '无', '河南鹤壁山城区');
INSERT INTO `t_goods` VALUES ('11', '电饭煲', '11', '2019-10-10 14:31:53', '已成交', '1', '无', '重庆江北金源路');

-- ----------------------------
-- Table structure for t_goodsimgs
-- ----------------------------
DROP TABLE IF EXISTS `t_goodsimgs`;
CREATE TABLE `t_goodsimgs` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) DEFAULT NULL COMMENT '商品id',
  `img_path` varchar(11) DEFAULT NULL COMMENT '路径',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_goodsimgs
-- ----------------------------
INSERT INTO `t_goodsimgs` VALUES ('1', '1', 'age/111.jpg');
INSERT INTO `t_goodsimgs` VALUES ('2', '2', '/ge/131.jpg');
INSERT INTO `t_goodsimgs` VALUES ('3', '3', '/ge/141.jpg');
INSERT INTO `t_goodsimgs` VALUES ('4', '4', '/ge/141.jpg');
INSERT INTO `t_goodsimgs` VALUES ('5', '5', '/ge/151.jpg');
INSERT INTO `t_goodsimgs` VALUES ('6', '6', '/ge/161.jpg');
INSERT INTO `t_goodsimgs` VALUES ('7', '7', '/ge/171.jpg');
INSERT INTO `t_goodsimgs` VALUES ('8', '8', '/ge/181.jpg');
INSERT INTO `t_goodsimgs` VALUES ('9', '9', '/ge/191.jpg');
INSERT INTO `t_goodsimgs` VALUES ('10', '10', '/ge/101.jpg');
INSERT INTO `t_goodsimgs` VALUES ('11', '11', '/ge/211.jpg');

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `order_generate_id` varchar(20) DEFAULT NULL COMMENT '订单号：uuid等方式生成唯一订单号，在前端显示',
  `u_bid` int(11) DEFAULT NULL COMMENT '买家id',
  `u_sid` int(11) DEFAULT NULL COMMENT '卖家id',
  `getid` int(11) DEFAULT NULL COMMENT '收货地址id',
  `deal_price` double DEFAULT NULL COMMENT '成交金额',
  `commision` double DEFAULT NULL COMMENT '佣金（根据成交金额计算）',
  `order_total_price` double DEFAULT NULL COMMENT '订单总金额，等于商品价格+佣金（财政收入来源1）',
  `deal_time` datetime DEFAULT NULL COMMENT '交易时间（付款时间）',
  `gid` int(11) DEFAULT NULL COMMENT '商品id',
  `buy_count` int(11) DEFAULT NULL COMMENT '购买数量（设置默认值为1）',
  `order_status` varchar(255) DEFAULT NULL COMMENT '订单状态：未付款、已付款、待发货、已发货、完成、退货（涉及退款）、卖家关闭（前提：流拍）、……',
  `payment_channel` varchar(255) DEFAULT NULL COMMENT '支付方式（微信、支付宝、网银）及支付交易号',
  `order_trade` varchar(255) DEFAULT NULL COMMENT '流水号：已付款之后才会生成唯一流水号',
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order
-- ----------------------------
INSERT INTO `t_order` VALUES ('1', '2333873', '1', '1', '1', '3900', '50', '4400', '2019-09-30 20:13:38', '1', '1', '完成', '微信1209873', '19883773633233');
INSERT INTO `t_order` VALUES ('2', '1233873', '2', '2', '2', '2050', '30', '2080', '2019-10-01 20:13:51', '2', '2', '已发货', '支付宝90923', '10383773633233');
INSERT INTO `t_order` VALUES ('3', '4533873', '3', '3', '3', '750', '20', '770', '2019-09-26 20:14:01', '3', '3', '待发货', '网银18654444333563', '10283773633233');
INSERT INTO `t_order` VALUES ('4', '9033873', '4', '4', '4', '350', '20', '370', '2019-09-25 20:14:18', '4', '2', '已付款', '微信12094573', '10183773633233');
INSERT INTO `t_order` VALUES ('5', '7833873', '5', '5', '5', '610', '20', '630', '2019-09-27 20:14:31', '5', '4', '已发货', '网银18654438333563', '12983773633233');
INSERT INTO `t_order` VALUES ('6', '9833873', '6', '6', '6', '1050', '10', '1060', '2019-10-02 20:14:39', '6', '5', '待发货', '微信1209073', '12883773633233');
INSERT INTO `t_order` VALUES ('7', '1333873', '7', '7', '7', '125', '20', '145', '2019-10-02 20:14:43', '7', '2', '完成', '支付宝90223', '12783773633233');
INSERT INTO `t_order` VALUES ('8', '1433873', '8', '8', '8', '125', '10', '135', '2019-10-03 20:14:52', '8', '4', '已付款', '微信1349873', '12683773633233');
INSERT INTO `t_order` VALUES ('9', '1533873', '9', '9', '9', '450', '10', '460', '2019-10-03 20:14:56', '9', '3', '已发货', '网银18655544333563', '12583773633233');
INSERT INTO `t_order` VALUES ('10', '1833873', '10', '10', '10', '55', '10', '65', '2019-10-02 20:15:11', '10', '5', '待发货', '微信1287873', '12483773633233');
INSERT INTO `t_order` VALUES ('11', '2033873', '11', '11', '11', '110', '20', '130', '2019-10-01 20:15:14', '11', '6', '完成', '支付宝97623', '12383773633233');

-- ----------------------------
-- Table structure for t_record
-- ----------------------------
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE `t_record` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) DEFAULT NULL COMMENT '拍品，外键到商品',
  `u_bid` int(11) DEFAULT NULL COMMENT '出价人,外键到用户id',
  `u_sid` int(11) DEFAULT NULL COMMENT '卖家id',
  `record_time` datetime DEFAULT NULL COMMENT '出价时间',
  `record_price` double DEFAULT NULL COMMENT '出价价格',
  `record_num` int(11) DEFAULT NULL COMMENT '出价次数',
  `transaction_status` varchar(255) DEFAULT NULL COMMENT '成交状态',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_record
-- ----------------------------
INSERT INTO `t_record` VALUES ('1', '1', '1', '1', '2019-09-30 16:19:26', '3800', '3', '成交');
INSERT INTO `t_record` VALUES ('2', '2', '2', '2', '2019-10-01 16:20:11', '2000', '4', '成交');
INSERT INTO `t_record` VALUES ('3', '3', '3', '3', '2019-09-26 16:20:30', '700', '2', '成交');
INSERT INTO `t_record` VALUES ('4', '4', '4', '4', '2019-09-25 16:20:48', '300', '2', '成交');
INSERT INTO `t_record` VALUES ('5', '5', '5', '5', '2019-09-27 16:21:43', '600', '3', '成交');
INSERT INTO `t_record` VALUES ('6', '6', '6', '6', '2019-10-02 16:22:03', '1000', '2', '成交');
INSERT INTO `t_record` VALUES ('7', '7', '7', '7', '2019-10-02 16:22:15', '100', '1', '成交');
INSERT INTO `t_record` VALUES ('8', '8', '8', '8', '2019-10-03 16:22:44', '100', '3', '成交');
INSERT INTO `t_record` VALUES ('9', '9', '9', '9', '2019-10-03 16:22:54', '400', '2', '成交');
INSERT INTO `t_record` VALUES ('10', '10', '10', '10', '2019-10-02 16:23:09', '50', '1', '成交');
INSERT INTO `t_record` VALUES ('11', '11', '11', '11', '2019-10-01 16:23:16', '100', '2', '成交');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT NULL COMMENT '用户注册登录时使用的用户名，需唯一',
  `upass` varchar(255) DEFAULT NULL COMMENT '登录密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `tel` varchar(255) DEFAULT NULL COMMENT '手机号',
  `user_status` varchar(255) DEFAULT NULL COMMENT '用户状态（正常、禁言、禁止出价……）',
  `account_status` varchar(255) DEFAULT NULL COMMENT '注销，待激活…………',
  `account_password` varchar(255) DEFAULT NULL COMMENT '支付密码，管理多张银行卡（待激活到正常的条件？）',
  `id_card` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `utime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uname` (`uname`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '阿里大一', '123456', 'xhufs@163.com', '18834321287', '正常', '未激活', '3328463', '1422384990038293', '2019-10-01 11:59:10');
INSERT INTO `t_user` VALUES ('2', '阿里大二', '463452', 'sdggerg@126.com', '18834355811', '正常', '已激活', '3452342345', '735624352345236', '2019-10-01 12:57:20');
INSERT INTO `t_user` VALUES ('3', '阿里大三', '098765', 'alidayi@098.com', '18438903425', '正常', '已激活', '87903211', '2987889999', '2019-09-26 13:05:38');
INSERT INTO `t_user` VALUES ('4', '阿里大四', '908721', 'alidasi@163.com', '18438903125', '正常', '未激活', '21904454', '23445563111', '2019-09-20 08:07:35');
INSERT INTO `t_user` VALUES ('5', '阿里大五', '687912', 'alidawu@163.com', '18438903421', '正常', '已激活', '89993733', '3455555522', '2019-09-11 16:08:22');
INSERT INTO `t_user` VALUES ('6', '阿里小一', '456789', 'alixiaoyi@163.com', '18438904425', '正常', '已激活', '29823442', '4455532234', '2019-10-16 13:09:00');
INSERT INTO `t_user` VALUES ('7', '阿里小二', '976554', 'alixiaoer@163.com', '18438903445', '正常', '未激活', '98740221', '2234444599', '2019-09-02 13:09:32');
INSERT INTO `t_user` VALUES ('8', '阿里小三', '467899', 'alixiaosan@163.com', '18438803425', '正常', '已激活', '87422215', '3345555987', '2019-10-05 17:10:00');
INSERT INTO `t_user` VALUES ('9', '阿里小四', '345677', 'alixiaosi@163.com', '18438923425', '正常', '已激活', '23412098', '3509877767', '2019-10-01 09:10:36');
INSERT INTO `t_user` VALUES ('10', '阿里小五', '098334', 'alixiaowu@163.com', '18438902420', '正常', '未激活', '98123412', '6543345509', '2019-09-30 16:11:39');
INSERT INTO `t_user` VALUES ('11', '阿里小六', '987633', 'alixiaoliu@163.com', '18437503425', '正常', '已激活', '23342334', '2345321134', '2019-09-27 10:12:11');

-- ----------------------------
-- Table structure for t_user_sell
-- ----------------------------
DROP TABLE IF EXISTS `t_user_sell`;
CREATE TABLE `t_user_sell` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) DEFAULT NULL COMMENT '用户注册登录时使用的用户名，需唯一',
  `upass` varchar(255) DEFAULT NULL COMMENT '登录密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `tel` varchar(255) DEFAULT NULL COMMENT '手机号',
  `user_status` varchar(255) DEFAULT NULL COMMENT '用户状态（正常、禁言、禁止出价……）',
  `account_status` varchar(255) DEFAULT NULL COMMENT '注销，待激活…………',
  `account_password` varchar(255) DEFAULT NULL COMMENT '支付密码，管理多张银行卡（待激活到正常的条件？）',
  `id_card` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `utime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uname` (`uname`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_sell
-- ----------------------------
INSERT INTO `t_user_sell` VALUES ('1', '阿巴小二', '123456', 'xhufs@163.com', '18834321287', '正常', '未激活', '3328463', '1422384990038293', '2019-10-01 11:59:10');
INSERT INTO `t_user_sell` VALUES ('2', '阿巴大三', '466552', 'abadasan@126.com', '18734321287', '正常', '已激活', '22440833', '1422384909038293', '2019-09-28 10:57:36');
INSERT INTO `t_user_sell` VALUES ('3', '阿巴大二', '463452', 'abadaer@126.com', '18634355811', '正常', '已激活', '3452342345', '1735624352345236', '2019-10-01 12:57:20');
INSERT INTO `t_user_sell` VALUES ('4', '阿巴大一', '498752', 'abadayi@126.com', '18534321287', '正常', '已激活', '23490342', '1429087990038293', '2019-09-02 09:57:49');
INSERT INTO `t_user_sell` VALUES ('5', '阿巴大四', '463764', 'abadasi@126.com', '18434321287', '正常', '未激活', '33894422', '1422384654338293', '2019-10-01 16:59:18');
INSERT INTO `t_user_sell` VALUES ('6', '阿巴大五', '463789', 'abadawu@126.com', '18334321287', '正常', '已激活', '20334088', '1422384990038986', '2019-09-25 18:59:30');
INSERT INTO `t_user_sell` VALUES ('7', '阿巴大六', '463987', 'abadaliu@126.com', '18904321287', '正常', '已激活', '34893443', '1422890990038293', '2019-09-29 17:59:42');
INSERT INTO `t_user_sell` VALUES ('8', '阿巴小一', '463098', 'abaxiaoyi@126.com', '18764321287', '正常', '未激活', '90885533', '1408765444038293', '2019-09-28 17:59:53');
INSERT INTO `t_user_sell` VALUES ('9', '阿巴小三', '987452', 'abaxiaosan@126.com', '18094321287', '正常', '已激活', '3452365345', '1076554490038293', '2019-09-26 16:00:00');
INSERT INTO `t_user_sell` VALUES ('10', '阿巴小四', '165452', 'abaxiaosi@126.com', '18124321287', '正常', '已激活', '3452387345', '1778990352345236', '2019-10-02 14:00:20');
INSERT INTO `t_user_sell` VALUES ('11', '阿巴小五', '763452', 'abaxiaowu@126.com', '15834321287', '正常', '未激活', '3452346745', '1735624875435236', '2019-10-02 14:00:20');


INSERT INTO "public"."fd_content_client_user_2WIQRCZAPA"("uid", "type", "guid", "user_name", "real_name", "id_card", "icon", "mobile", "gender", "email", "birth", "location", "pwd", "secret_key", "check_status", "is_enterprise_vip", "open_id", "lite_open_id", "work_id", "union_id", "register_time", "finish_time", "dept_id", "post_id", "access_3rd_uid", "emp_no", "login_time", "view_count", "up_count", "comment_count", "dislike_count", "at_count", "follow_count", "login_total", "collect_count", "user_type", "app_open_id", "education", "political_status", "promote_direction", "is_leader", "ext") VALUES ('2', 2, NULL, '管理员', '管理员', NULL, 'http://res.botbrain.ai/zhiyu/img/admin.jpg', '1500000000', 'F', NULL, NULL, NULL, NULL, 'H9EX7eyaPqLZvWHjagJeJ4BpgapY', 3, 'f', 'open_id', 'lite_open_id', 'work_id', 'union_id', 1548170627043, 1548170627043, NULL, NULL, NULL, NULL, NULL, 0, 0, 0, 0, 47, 0, 0, 0, 1, NULL, NULL, NULL, NULL, 2, NULL);
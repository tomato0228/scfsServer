/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : sfcs

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 11/05/2019 13:12:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `chat_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '聊天信息ID',
  `chat_date` datetime NOT NULL COMMENT '聊天信息时间',
  `chat_content` varchar(20000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '聊天信息内容',
  `chat_type` int(11) NOT NULL COMMENT '消息类型',
  `send_id` int(11) NOT NULL COMMENT '发送者ID',
  `receive_id` int(11) NOT NULL COMMENT '接收者ID',
  `chat_mesg` int(11) DEFAULT '0' COMMENT '是否接受消息',
  PRIMARY KEY (`chat_id`),
  KEY `send_id` (`send_id`),
  KEY `receive_id` (`receive_id`),
  CONSTRAINT `chat_ibfk_1` FOREIGN KEY (`send_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `chat_ibfk_2` FOREIGN KEY (`receive_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='聊天信息保存记录表';

-- ----------------------------
-- Records of chat
-- ----------------------------
BEGIN;
INSERT INTO `chat` VALUES (1, '2019-04-21 00:37:23', '王老师，您好！', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (2, '2019-04-22 00:38:20', '王同学你好', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (3, '2019-04-23 15:27:10', 'hi', 0, 99000001, 3010001, 1);
INSERT INTO `chat` VALUES (4, '2019-04-24 00:12:52', '你好，你好，你好，你好，你好，你好，你好，你好，你好', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (5, '2019-04-24 08:14:48', '老师早上好，老师早上好老师早上好老师早上好老师早上好', 0, 99000001, 3010001, 1);
INSERT INTO `chat` VALUES (6, '2019-04-24 08:18:31', '早上好', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (7, '2019-04-24 17:47:04', '老师在吗？紧急', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (8, '2019-04-25 15:02:56', '无语了。。。。', 0, 99000001, 3010001, 1);
INSERT INTO `chat` VALUES (16, '2019-04-24 08:36:43', '你好', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (18, '2019-04-24 08:37:10', 'mimi2', 2, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (23, '2019-04-24 14:48:59', '嗯，干得不错', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (24, '2019-04-24 14:54:53', 'mimi7', 2, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (25, '2019-04-24 15:11:03', '老师，我开始写论文了', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (26, '2019-04-24 15:12:04', '嗯，好', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (27, '2019-04-24 15:21:09', '老师，我来找您', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (28, '2019-04-24 15:23:40', '清清浅浅', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (29, '2019-04-24 15:23:48', '清清浅浅', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (30, '2019-04-24 17:35:58', '老师在吗？', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (31, '2019-04-24 17:45:51', '老师，您在说什么？', 0, 99000001, 3010001, 1);
INSERT INTO `chat` VALUES (32, '2019-04-24 22:40:59', '嗯，我在，有什么事！', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (33, '2019-04-24 23:53:01', '老师，我毕设还没做完', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (34, '2019-04-24 23:53:26', '额', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (35, '2019-04-24 23:53:40', 'mimi9', 2, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (36, '2019-04-24 23:55:08', '笨蛋', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (37, '2019-04-24 23:55:27', '你要对自己负责！！！', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (38, '2019-04-24 23:55:35', 'mimi4', 2, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (40, '2019-04-25 00:10:52', '知道了，老师', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (41, '2019-04-25 00:11:08', '没什么', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (42, '2019-04-25 00:11:27', '就是无聊', 0, 3010001, 99000001, 1);
INSERT INTO `chat` VALUES (43, '2019-04-25 00:16:43', '老师，救救我', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (44, '2019-04-25 00:17:03', '无能为力', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (45, '2019-04-25 00:17:11', 'mimi7', 2, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (46, '2019-04-26 01:21:08', '爸爸', 0, 150301101, 99000001, 1);
INSERT INTO `chat` VALUES (47, '2019-04-26 01:28:57', '老师，我觉得我能做完了。', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (48, '2019-04-26 01:30:09', 'mimi5', 2, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (49, '2019-04-26 01:30:20', '谢谢老师', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (50, '2019-04-26 01:31:05', '晚安，老师您早点休息', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (51, '2019-04-26 01:36:07', '晚安', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (52, '2019-04-26 01:36:35', 'wananwanwnannanadjoxodkslslwkfjfjfjxkxkdks是必须你想买啥看着咔咔咔牛萨萨v', 0, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (53, '2019-04-26 01:37:19', 'mimi2', 2, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (54, '2019-04-26 01:37:39', 'mimi3', 2, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (55, '2019-04-28 18:17:15', '嗯', 0, 99000001, 150301101, 1);
INSERT INTO `chat` VALUES (56, '2019-04-28 23:16:49', 'grandpa', 0, 150301101, 99000002, 0);
INSERT INTO `chat` VALUES (57, '2019-04-29 01:47:39', '母亲大人', 0, 150301101, 150301103, 0);
INSERT INTO `chat` VALUES (58, '2019-04-30 19:47:23', '还是大好河山', 0, 150301101, 99000002, 0);
INSERT INTO `chat` VALUES (59, '2019-04-30 22:05:10', 'mimi2', 2, 150301101, 150301103, 0);
INSERT INTO `chat` VALUES (60, '2019-04-30 22:05:50', '儿子', 0, 99000001, 150301101, 1);
INSERT INTO `chat` VALUES (61, '2019-04-30 22:15:49', 'mimi1', 2, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (62, '2019-04-30 22:16:07', 'mimi5', 2, 3010001, 150301101, 1);
INSERT INTO `chat` VALUES (63, '2019-04-30 22:16:52', 'ha 老师救命', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (64, '2019-04-30 22:17:23', '救命', 0, 150301101, 3010001, 1);
INSERT INTO `chat` VALUES (65, '2019-05-07 11:11:00', '老师好', 0, 150301101, 3010001, 0);
INSERT INTO `chat` VALUES (66, '2019-05-07 11:11:10', '嗯', 0, 150301101, 99000001, 0);
INSERT INTO `chat` VALUES (67, '2019-05-07 11:12:52', 'mimi5', 2, 150301101, 99000001, 0);
COMMIT;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '班级ID',
  `class_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级名字',
  `grade_id` int(11) NOT NULL COMMENT '年级ID',
  `major_id` int(11) NOT NULL COMMENT '专业ID',
  `student_id` int(11) DEFAULT NULL COMMENT '班长ID',
  `teacher_id` int(11) DEFAULT NULL COMMENT '班主任ID',
  PRIMARY KEY (`class_id`),
  KEY `grade_id` (`grade_id`),
  KEY `major_id` (`major_id`),
  KEY `class_ibfk_3` (`student_id`),
  KEY `class_ibfk_4` (`teacher_id`),
  CONSTRAINT `class_ibfk_1` FOREIGN KEY (`grade_id`) REFERENCES `grade` (`grade_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `class_ibfk_2` FOREIGN KEY (`major_id`) REFERENCES `major` (`major_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `class_ibfk_3` FOREIGN KEY (`student_id`) REFERENCES `user` (`user_id`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `class_ibfk_4` FOREIGN KEY (`teacher_id`) REFERENCES `user` (`user_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1503013 DEFAULT CHARSET=utf8 COMMENT='班级信息表';

-- ----------------------------
-- Records of class
-- ----------------------------
BEGIN;
INSERT INTO `class` VALUES (1503011, '一班', 10288015, 301, 150301101, 3010001);
INSERT INTO `class` VALUES (1503012, '二班', 10288015, 301, NULL, 3010001);
COMMIT;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `college_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学院ID',
  `college_name` varchar(50) NOT NULL COMMENT '学院名字',
  `college_profile` varchar(20000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学院简介',
  `college_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学院地址',
  `college_tel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学院电话',
  `college_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学院网址',
  `college_logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学院logo',
  `school_id` int(11) NOT NULL COMMENT '学校ID',
  PRIMARY KEY (`college_id`) USING BTREE,
  KEY `college_ibfk_1` (`school_id`),
  CONSTRAINT `college_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1028804 DEFAULT CHARSET=utf8 COMMENT='学院信息表';

-- ----------------------------
-- Records of college
-- ----------------------------
BEGIN;
INSERT INTO `college` VALUES (1028803, '计算机科学与工程学院', '南京理工大学计算机科学与工程学院始建于1953年创办的哈尔滨军事工程学院模拟计算机研究组，先后经历了炮兵工程学院计算机教研室（1960年）、华东工程学院计算机科学与工程系（1979年）等发展阶段，是我国高等学校中较早建立的计算机系之一。2005年12月更名为计算机科学与技术学院，2012年5月改为现名。\n学院下设计算机科学与技术系、软件工程系、智能科学与技术系、数字媒体理论与工程系、计算机网络与通信技术系、计算机科学与工程实验中心、计算机应用技术研究所、信息处理及安全技术研究所、智能机器人研究所和网络空间安全工程研究院等。\n学院现有“模式识别与智能系统”国家二级重点学科、“计算机科学与技术”、“软件工程”和“网络空间安全”江苏省一级重点学科，“社会公共安全信息工程”工信部重点学科以及“社会公共安全技术”江苏省优势学科。其中，计算机科学学科为全球ESI1%学科。拥有“计算机科学与技术”“软件工程”、“网络空间安全”一级学科博士点和“模式识别与智能系统”二级学科博士点及相应的博士后流动站。拥有“计算机科学与技术”、“模式识别与智能系统”、“软件工程”、“网络空间安全”、“生物医学工程（跨学科）5个硕士点，并获得“985”优势学科创新平台建设工程立项支持。我院学科方向是南京理工大双一流学科建设的重要组成部分，其中模式识别与智能系统是“武器系统智能化”方向的支撑学科，网络空间安全学科是“网络与空间攻防”方向的支撑学科。目前，学院在校本科生1300余人，研究生720人，工程硕士500余人及博士后20余人。\n在计算机科学与人工智能技术领域，学院学科实验室和平台比较齐整，拥有“高维信息智能感知与系统”教育部重点实验室、“社会安全信息感知与系统”工信部重点实验室、“社会公共安全图像与视频理解”江苏省重点实验室，“社会公共安全科技”江苏省2011协同创新中心，江苏省公安厅“社会公共安全”重点实验室，教育部、国家外国专家局“高维信息智能感知与系统”111创新引智基地。同时学院与国内知名企业建立系列产学研协同创新平台，具有南京理工大学-中航科技智慧城市大数据联合实验室、深城院-南理工大数据技术联合实验室等。\n学院拥有一支综合素质好、学术水平高、实践经验丰富、具有开拓创新精神的教学科研队伍，学院现有教职工145人，其中博士生导师33人，正高37人，副高51人，专任教师130人，博士化率达88.5%。我院师资力量雄厚，国内知名模式识别与人工智能专家杨健教授是国际模式识别协会IAPR Fellow、长江学者特聘教授、国家杰出青年基金和国家万人计划获得者；同时具有国家万人计划、国家青年长江学者、国家优秀青年基金获得者和973首席青年科学家唐金辉教授、青年千人闫焱等青年才俊；拥有教育部新世纪人才1人、江苏省特聘教授2人，江苏省杰出青年和优秀青年基金获得者2人、省333高层次人才10人、霍英东教育基金会青年教师奖获得者1人，原国防科工委511高层次人才2人、青蓝工程人才12人，江苏省六大人才高峰获得者6人，最新引进的南京理工大学青年拔尖教授人才10余名。具有江苏省科技创新团队1个，江苏省“青蓝工程创新团队”1个，工业和信息化部 “研究型教学创新团队” 1个。\n学院重视人工智能领域基础和应用技术研究。我院是国内从事模式识别与人工智能基础性研究，特别是模式识别与智能系统方向的强势学科单位；同时，我院是从事地面无人智能系统的优势单位，先后作为地面无人机器人系统的总师单位。逐步形成了智能科学与技术、数据科学与工程、智能机器人与系统等三大特色方向；同时了建立人工智能领域从本科生、硕士生、博士生直至博士后研究人员的完整人才培养体系。\n学院科研实力雄厚，围绕国家重大需求发展，积极承担国防、行业大型高层次科研任务。近年来，学院承担国家自然科学基金重大计划、国家重点研发计划、国家973计划、国家863计划、国家攀登计划、国家科技攻关等重大科技计划项目以及省、部、委科研项目和企事业委托或国际合作的研发项目100余项。先后获国家自然科学二等奖1项和省部级一等奖6项、二等奖15项，三等奖12项，特别是在特征抽取理论与算法理论研究、视觉信息的表示学习理论与方法等方面产生形成一批标志性成果。\n学院在承担行业、国防等多层次基础研究项目的同时，积极参与地方经济建设，并注重研究成果应用转化。学院科研成果已成功转化并应用于金融、移动通信、智能交通等领域。学院推出印鉴真伪自动识别系统、银行票据自动处理系统，成功研制我国第一台具有自主知识产权的公路路面状况检测车等，创造经济效益1.7亿元。\n学院学术氛围浓厚，教风学风严谨活泼注重理论联系实际。学院先后获全国百篇优秀博士论文提名2篇，中国人工智能学会优秀博士学位论文2名，获江苏省优秀博士论文9篇，获江苏省优秀硕士论文12篇。本科生多次在全国“挑战杯”竞赛、国际国内ACM大赛、“蓝桥杯”全国软件和信息技术专业人才大赛、中国大学生程序设计竞赛（CCPC）等各类赛事获得优异的成绩。学院研究生学子先后获得Udacity-DiDi无人驾驶全球挑战赛冠军，阿里巴巴大数据竞赛第一名，中国智能车未来挑战赛三项亚军和1项季军，入选首届腾讯犀牛鸟精英研究生计划等。学院本科生升学出国率近45%，本科生和研究生年度就业率达99%以上。\n学院国际交流广泛。学院与卡耐基梅隆大学计算机学院机器人研究所开展了联合办学，联合培养了“机器人技术”硕士研究生40余人。此外，已与宾夕法尼亚大学、伊利诺伊大学、美国南加州大学、密西根州立大学、纽约城市大学、德国波恩大学、加拿大滑铁卢大学、阿尔伯塔大学、澳洲国立大学、澳大利亚皇家墨尔本理工大学、法国矿业联盟大学等美、欧、澳、亚洲10多个国家30多个大学、研究机构建立了密切合作关系，影响不断扩大，在国内外具有较高知名度。', '江苏省南京市玄武区孝陵卫200号', '84315636', 'http://cs.njust.edu.cn', 'http://cs.njust.edu.cn/_upload/tpl/01/46/326/template326/images/logo.jpg', 10288);
COMMIT;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '科目ID',
  `course_name` varchar(50) NOT NULL COMMENT '科目名字',
  `college_id` int(11) DEFAULT NULL COMMENT '专业ID',
  PRIMARY KEY (`course_id`),
  KEY `course_ibfk_1` (`college_id`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='科目信息表';

-- ----------------------------
-- Records of course
-- ----------------------------
BEGIN;
INSERT INTO `course` VALUES (1, '毕业设计', 1028803);
INSERT INTO `course` VALUES (2, '离散数学', 1028803);
INSERT INTO `course` VALUES (3, '数据结构', 1028803);
COMMIT;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `grade_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '年级ID',
  `grade_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级名字',
  `school_id` int(11) NOT NULL COMMENT '学校ID',
  PRIMARY KEY (`grade_id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `grade_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `school` (`school_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10288016 DEFAULT CHARSET=utf8 COMMENT='年级信息表';

-- ----------------------------
-- Records of grade
-- ----------------------------
BEGIN;
INSERT INTO `grade` VALUES (10288015, '2015届', 10288);
COMMIT;

-- ----------------------------
-- Table structure for homework
-- ----------------------------
DROP TABLE IF EXISTS `homework`;
CREATE TABLE `homework` (
  `homework_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '作业ID',
  `homework_content` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作业内容',
  `homework_date` datetime NOT NULL COMMENT '作业发布日期',
  `tclass_id` int(11) NOT NULL COMMENT '教师、科目、班级信息',
  `homework_attachment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '作业附件的地址',
  PRIMARY KEY (`homework_id`),
  KEY `tclass_id` (`tclass_id`),
  CONSTRAINT `homework_ibfk_1` FOREIGN KEY (`tclass_id`) REFERENCES `tclass` (`tclass_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='作业信息表';

-- ----------------------------
-- Records of homework
-- ----------------------------
BEGIN;
INSERT INTO `homework` VALUES (1, '完成开题报告', '2019-04-19 00:00:00', 1, 'www.baidu.com');
INSERT INTO `homework` VALUES (2, '完成外文翻译', '2019-04-18 00:00:00', 1, 'www.baidu.com');
INSERT INTO `homework` VALUES (3, '第一章课后题:第一章课后题第一章课后题第一章课后题第一章课后题第一章课后题第一章课后题第一章课后题', '2019-04-18 00:00:00', 2, 'www.baidu.com');
INSERT INTO `homework` VALUES (4, '第二章课后题', '2019-04-19 00:00:00', 2, 'www.baidu.com');
INSERT INTO `homework` VALUES (5, '第三章课后题', '2019-04-19 00:00:00', 2, 'www.baidu.com');
INSERT INTO `homework` VALUES (6, '第四章课后题', '2019-04-19 00:00:00', 2, '');
INSERT INTO `homework` VALUES (7, '第五章课后题', '2019-04-19 00:00:00', 2, '');
INSERT INTO `homework` VALUES (11, '第六章课后题', '2019-04-19 00:00:00', 2, '');
INSERT INTO `homework` VALUES (24, '第七章课后题!!', '2019-04-19 02:00:00', 2, '');
INSERT INTO `homework` VALUES (25, '第八章课后题!', '2019-04-19 03:09:56', 2, '');
INSERT INTO `homework` VALUES (29, '第五章课后题', '2019-04-23 14:17:49', 2, '');
INSERT INTO `homework` VALUES (30, '第五章课后题', '2019-04-23 14:21:49', 2, '');
INSERT INTO `homework` VALUES (31, '第五章课后题', '2019-04-23 14:24:43', 2, '');
INSERT INTO `homework` VALUES (32, '第1111章课后题', '2019-04-23 14:31:20', 2, '');
COMMIT;

-- ----------------------------
-- Table structure for major
-- ----------------------------
DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `major_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专业ID',
  `major_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业名字',
  `major_profile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业简介',
  `major_addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业地址',
  `major_tel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业电话',
  `major_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业网址',
  `major_logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '专业logo',
  `college_id` int(11) NOT NULL COMMENT '学院ID',
  PRIMARY KEY (`major_id`) USING BTREE,
  KEY `college_id` (`college_id`),
  CONSTRAINT `major_ibfk_1` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=302 DEFAULT CHARSET=utf8 COMMENT='专业信息表';

-- ----------------------------
-- Records of major
-- ----------------------------
BEGIN;
INSERT INTO `major` VALUES (301, '软件工程', '是我国高等学校中较早建立的计算机系之一', '江苏省南京市玄武区孝陵卫200号', '84315636', 'http://cs.njust.edu.cn', 'http://cs.njust.edu.cn/main.htm', 1028803);
COMMIT;

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '通知ID',
  `notice_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '通知标题',
  `notice_content` varchar(20000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '通知内容',
  `notice_date` datetime NOT NULL COMMENT '通知发布日期',
  `notice_attachment` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '通知附件的地址',
  `user_id` int(11) NOT NULL COMMENT '发布者ID',
  `class_id` int(11) NOT NULL COMMENT '班级ID',
  PRIMARY KEY (`notice_id`) USING BTREE,
  KEY `user_id` (`user_id`),
  KEY `class_id` (`class_id`),
  CONSTRAINT `notice_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `notice_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='通知信息表';

-- ----------------------------
-- Records of notice
-- ----------------------------
BEGIN;
INSERT INTO `notice` VALUES (1, '开家长会', '2019-04-22开家长会，主要是毕业的问题', '2019-04-21 12:23:58', '', 3010001, 1503011);
COMMIT;

-- ----------------------------
-- Table structure for parents
-- ----------------------------
DROP TABLE IF EXISTS `parents`;
CREATE TABLE `parents` (
  `parents_key` int(11) NOT NULL AUTO_INCREMENT COMMENT '家长关系key',
  `parents_id` int(11) NOT NULL COMMENT '家长ID',
  `parents_relation` enum('父亲','母亲','爷爷','奶奶','其他') NOT NULL DEFAULT '其他' COMMENT '家长和学生的关系',
  `student_id` int(11) NOT NULL COMMENT '学生ID',
  PRIMARY KEY (`parents_key`) USING BTREE,
  KEY `parents_id` (`parents_id`),
  KEY `student_id` (`student_id`),
  CONSTRAINT `parents_ibfk_1` FOREIGN KEY (`parents_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `parents_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='家长信息表';

-- ----------------------------
-- Records of parents
-- ----------------------------
BEGIN;
INSERT INTO `parents` VALUES (1, 99000001, '父亲', 150301101);
INSERT INTO `parents` VALUES (2, 99000002, '爷爷', 150301101);
INSERT INTO `parents` VALUES (3, 150301103, '其他', 150301101);
INSERT INTO `parents` VALUES (4, 150301104, '爷爷', 150301101);
COMMIT;

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `school_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学校ID',
  `school_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学校名字',
  `school_profile` varchar(20000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '学校简介',
  `school_addr` varchar(255) DEFAULT NULL COMMENT '学校地址',
  `school_tel` varchar(50) DEFAULT NULL COMMENT '学校电话',
  `school_url` varchar(255) DEFAULT NULL COMMENT '学校网址',
  `school_logo` varchar(255) DEFAULT NULL COMMENT '学校logo',
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10289 DEFAULT CHARSET=utf8 COMMENT='学校信息表';

-- ----------------------------
-- Records of school
-- ----------------------------
BEGIN;
INSERT INTO `school` VALUES (10288, '南京理工大学', '南京理工大学是隶属于工业和信息化部的全国重点大学，坐落在钟灵毓秀、虎踞龙蟠的古都南京。学校由创建于1953年的新中国军工科技最高学府---中国人民解放军军事工程学院（简称“哈军工”）分建而成，经历了炮兵工程学院、华东工程学院、华东工学院等发展阶段，1993年更名为南京理工大学。1995年，学校成为国家首批“211工程”重点建设高校；2000年，获批成立研究生院；2011年，获批建设“985工程优势学科创新平台”;2017年，学校入选“双一流”建设高校，“兵器科学与技术”学科入选“双一流”建设学科；2018年，王泽山院士获得2017年度国家最高科学技术奖，中共中央总书记、国家主席、中央军委主席习近平亲自为王泽山院士颁奖；2018年12月，学校成为工信部、教育部、江苏省共建高校。学校坚持“以人为本，厚德博学”的办学理念，秉持“进德修业，志道鼎新”的校训，弘扬“团结、献身、求是、创新”的校风，以服务国家战略需求、推动社会进步为使命，致力于建设国内一流、国际知名的特色高水平研究型大学。\n学校学科门类齐全，办学特色鲜明。现有机械工程学院、化工学院、电子工程与光电技术学院、计算机科学与工程学院、经济管理学院、能源与动力工程学院、自动化学院、理学院、外国语学院、公共事务学院、马克思主义学院、材料科学与工程学院/格莱特研究院、环境与生物工程学院、设计艺术与传媒学院、知识产权学院等15个专业学院，以及钱学森学院、中法工程师学院、国际教育学院、创新创业教育学院、继续教育学院，并与合作方联合创办了南京理工大学紫金学院和南京理工大学泰州科技学院两个独立学院。学校在长期发展过程中形成了兵器与装备、电子与信息、化工与材料三大优势学科群，工程学、化学、材料科学、计算机科学4个学科进入ESI国际学科领域全球排名前1%，其中，工程学进入前1‰。现有国家重点学科9个，江苏省优势学科6个，江苏省重点学科9个，工信部重点学科7个，国防特色学科10个；国家级特色专业9个，教育部卓越工程师培养计划试点专业13个，江苏省重点专业类12个（覆盖38个本科专业），江苏省品牌专业6个；博士后流动站16个；一级学科博士学位授权点18个、硕士学位授权点14个；具有专业学位授权点11个，其中工程硕士涵盖26个工程领域；具有高级管理人员工商管理硕士（EMBA）授予权；具有在职人员以同等学力申请博士、硕士学位的授予权以及外国留学生和港澳台学生的招生权。学校现有各类在校生30000余名，留学生1000余名。\n学校坚持以师为本，师资力量雄厚。具有教授任职资格整体审定权和博士生指导教师资格审批权。现有教职工3200余人，专任教师1900余人，教授、副教授1200余人，其中，入选省部级及以上人才计划400余人，包括：两院院士17人，外国院士3人，“长江学者”18人，“万人计划”专家21人，“国家杰出青年基金”获得者7人，“国防科技卓越青年人才基金”获得者4人，“国家级教学名师奖”获得者3人，首届“全国创新争先奖”获得者3人，国务院学位委员会学科评议组成员5人（其中召集人1人），“国家百千万人才工程”人选14人，国家级、省部级有突出贡献中青年专家26人，享受国务院政府特殊津贴204人等。拥有首批全国高校黄大年式教师团队1个、国家级教学团队5个、教育部创新团队5个、工信部研究型教学创新团队3个、国防科技创新团队9个、江苏省创新团队26个。学校先后入选“江苏省高层次人才创新创业基地”和“国家创新人才培养示范基地”。\n学校坚持立德树人，育人成果丰硕。始终坚持人才培养的中心地位，立足精英教育，培养基础宽厚，知识、能力、素质协调发展的高级专门人才和工程精英，造就求真务实、开拓创新、引领发展、具有国际视野的社会中坚。60多年来，累计为国家培养输送了18万余名各类高级专门人才，其中13人当选两院院士。“十二五”以来，学校获得国家级教学成果奖8项；省部级教学成果奖25项，其中特等奖4项、一等奖9项。学校创新创业教育工作成效显著，是全国18所获批国家双创示范基地的高校之一，是首批“全国创新创业典型经验高校”“全国创新创业教育改革示范高校”，同时也是首批“中美青年创客交流中心”和“全国高校实践育人创新创业基地”落户高校；在“互联网+”大学生创新创业大赛、“挑战杯”全国大学生课外学术科技作品竞赛、研究生创新实践系列大赛等重大赛事中屡获佳绩，其中，在第十四届“挑战杯”竞赛中，学校以总分全国第一的成绩，成为第七个捧得“挑战杯”的高校。\n学校坚持创新引领，科技优势突出。始终坚持面向国家重大战略，瞄准科技前沿，在先进发射、高效毁伤、光电信息、远程压制、智能无人平台等国防科技领域代表着国家水平。学校现有国家级重点实验室1个，国家级工程技术研究中心1个，国家地方联合工程实验室1个，国家级技术研究推广中心1个，国家级技术转移示范机构1个，国家级质检中心1个，省部级重点实验室24个，省部级工程（技术）研究中心30个，省部级哲学社会科学研究基地11个，建有国家大学科技园，并以此为依托承担了一大批国家重大科研任务，取得了一批标志性科研成果。“十二五”以来，学校获得省部级及以上科技奖励233项，其中国家级科技奖励15项（国家最高科学技术奖1项，国家技术发明一等奖1项，国家科技进步一等奖1项，国家技术发明二等奖7项，国家科技进步二等奖5项）。至此，学校自1978年以来获得的国家级科技奖励已达到101项。\n学校坚持开放办学，影响日益提升。大力推进国际化办学进程，与100多所海外知名高校和科研机构建立了密切的合作关系。学校获批国家级国际联合研究中心1个、示范型国家国际科技合作基地1个、高等学校学科创新引智基地5个，建有国际联合实验室13个。学校与法国梅斯国立工程师学院共建中法工程师学院，与德国卡尔斯鲁厄理工学院合作建立格莱特纳米科技研究所，与莫斯科鲍曼国立技术大学、澳大利亚国立大学、英国考文垂大学等设立中外合作办学项目。积极响应国家“一带一路”倡议，与白俄罗斯戈梅利大学共建孔子学院。学校大力推进产学研合作，设立了8个校外研究院，发挥国家级技术转移中心的作用，推动重大科技成果的转化应用，服务国家和地方经济社会发展。民用爆破、特种超细粉体制备、智能熔敷焊、印鉴真伪自动鉴别系统等技术，填补了相关领域的空白，创造了显著的经济效益和社会效益。学校成立了教育发展基金会，社会各界通过基金会设立了60余项奖教金和奖助学金，支持学校在人才培养、科学研究和社会服务领域不断追求卓越。\n学校办学环境宜人，基础设施一流。校园北依紫金山，西临明城墙，占地3118亩。校内曲塘潋滟，佳木葱茏，碧草如茵，景色如画，与中山陵风景区浑然一体，是修身治学的理想园地。校舍建筑总面积108万平方米，固定资产总值44.8亿元，各类基础设施齐全，后勤服务系统完善。各类教学科研仪器设备19.1亿元；图书馆藏有中外文图书文献250余万册。\n新时代展现新气象，新使命呼唤新作为。学校将大力弘扬优良传统，紧紧抓住“双一流”建设机遇，以博大的胸襟，宽广的视野，务实的作风，求是的精神，开拓进取，接续奋斗，坚定不移地朝着国内一流、国际知名的高水平研究型大学战略目标阔步前进，为实现“两个一百年”奋斗目标、实现中华民族伟大复兴的中国梦做出更大贡献。', '江苏省南京市玄武区孝陵卫200号', '84315114', 'http://www.njust.edu.cn', 'https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1555489983&di=42cad67b738af8d3ef0bd83a0ee00f44&src=http://android-artworks.25pp.com/fs08/2018/08/31/6/2_766b650936a0100b8eda4269e7193532_con.png');
COMMIT;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `score_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '成绩ID',
  `score_num` float(4,1) NOT NULL COMMENT '成绩分数',
  `score_comment` varchar(255) DEFAULT NULL COMMENT '成绩评语',
  `student_id` int(11) NOT NULL COMMENT '学生ID',
  `course_id` int(11) NOT NULL COMMENT '科目ID',
  `semester_id` int(11) NOT NULL COMMENT '学期ID',
  PRIMARY KEY (`score_id`),
  KEY `course_id` (`course_id`),
  KEY `semester_id` (`semester_id`),
  KEY `score_ibfk_1` (`student_id`),
  CONSTRAINT `score_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `score_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `score_ibfk_3` FOREIGN KEY (`semester_id`) REFERENCES `semester` (`semester_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生成绩信息表';

-- ----------------------------
-- Table structure for semester
-- ----------------------------
DROP TABLE IF EXISTS `semester`;
CREATE TABLE `semester` (
  `semester_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学期ID',
  `semester_name` varchar(50) NOT NULL COMMENT '学期名字',
  PRIMARY KEY (`semester_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学期信息表';

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` int(11) NOT NULL COMMENT '学生ID',
  `class_id` int(11) NOT NULL COMMENT '班级ID',
  PRIMARY KEY (`student_id`) USING BTREE,
  KEY `class_id` (`class_id`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `student_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

-- ----------------------------
-- Records of student
-- ----------------------------
BEGIN;
INSERT INTO `student` VALUES (150301101, 1503011);
COMMIT;

-- ----------------------------
-- Table structure for tclass
-- ----------------------------
DROP TABLE IF EXISTS `tclass`;
CREATE TABLE `tclass` (
  `tclass_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教师班级表ID',
  `teacher_id` int(11) NOT NULL COMMENT '教师ID',
  `class_id` int(11) NOT NULL COMMENT '班级ID',
  `course_id` int(11) NOT NULL COMMENT '科目ID',
  `tclass_validation` enum('审核中','审核通过','审核失败') NOT NULL DEFAULT '审核中' COMMENT '验证信息',
  PRIMARY KEY (`tclass_id`),
  KEY `class_id` (`class_id`),
  KEY `course_id` (`course_id`),
  KEY `tclass_ibfk_1` (`teacher_id`),
  CONSTRAINT `tclass_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tclass_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `class` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tclass_ibfk_3` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='教师教授班级信息表';

-- ----------------------------
-- Records of tclass
-- ----------------------------
BEGIN;
INSERT INTO `tclass` VALUES (1, 3010001, 1503011, 1, '审核中');
INSERT INTO `tclass` VALUES (2, 3010001, 1503011, 2, '审核通过');
INSERT INTO `tclass` VALUES (3, 3010001, 1503012, 3, '审核通过');
COMMIT;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teacher_id` int(11) NOT NULL COMMENT '教师ID',
  `teacher_info` varchar(255) DEFAULT NULL COMMENT '教师信息',
  `major_id` int(11) NOT NULL COMMENT '专业ID',
  PRIMARY KEY (`teacher_id`),
  KEY `major_id` (`major_id`),
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`teacher_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `teacher_ibfk_2` FOREIGN KEY (`major_id`) REFERENCES `major` (`major_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教师信息表';

-- ----------------------------
-- Records of teacher
-- ----------------------------
BEGIN;
INSERT INTO `teacher` VALUES (3010001, '教授', 301);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(50) NOT NULL COMMENT '用户名字',
  `user_sex` enum('男','女') NOT NULL DEFAULT '男' COMMENT '用户性别',
  `user_birth` date DEFAULT NULL COMMENT '用户生日',
  `user_tel` varchar(50) DEFAULT NULL COMMENT '用户电话',
  `user_addr` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `user_type` enum('管理员','教师','学生','家长') DEFAULT '学生' COMMENT '用户类别',
  `user_email` varchar(255) DEFAULT NULL COMMENT '用户邮箱',
  `user_profile` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `user_signature` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT '' COMMENT '用户签名',
  `user_date` datetime DEFAULT NULL COMMENT '用户注册日期',
  `user_password` varchar(255) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=150301105 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (3010001, '王老师', '男', '1977-04-18', '17723903528', '江苏省南京市玄武区孝陵卫200号', '教师', 'tomato1@njust.edu.cn', NULL, 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3359239509,2526752630&fm=27&gp=0.jpg', '2019-04-18 12:53:00', 'f2797f2182804d0cc7f0b85d254c146');
INSERT INTO `user` VALUES (99000001, '王家长', '男', '1972-06-11', '17723903529', '江苏省南京市玄武区孝陵卫200号', '家长', 'tomato2@njust.edu.cn', '锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦。', 'http://b-ssl.duitang.com/uploads/item/201711/15/20171115083959_TAxHm.thumb.700_0.jpeg', '2019-04-23 00:48:44', 'f2797f2182804d0cc7f0b85d254c146');
INSERT INTO `user` VALUES (99000002, '石敢当', '男', '1976-04-01', '17723903520', NULL, '家长', NULL, NULL, '', '2019-04-26 19:48:25', 'f2797f2182804d0cc7f0b85d254c146');
INSERT INTO `user` VALUES (150301101, '王余阳', '男', '1996-02-28', '17723903527', '江苏省南京市玄武区孝陵卫200号', '学生', 'tomato@njust.edu.cn', '越努力，越幸运', 'http://b-ssl.duitang.com/uploads/item/201703/27/20170327212618_itXAN.jpeg', '2019-04-16 17:00:58', 'f2797f2182804d0cc7f0b85d254c146');
INSERT INTO `user` VALUES (150301103, '哪吒', '女', '1977-04-15', '17723903521', NULL, '家长', NULL, NULL, '', '2019-04-29 01:34:46', 'f2797f2182804d0cc7f0b85d254c146');
INSERT INTO `user` VALUES (150301104, '李靖', '男', '1956-02-15', '17723903522', NULL, '家长', NULL, NULL, '', '2019-04-30 22:10:17', 'f2797f2182804d0cc7f0b85d254c146');
COMMIT;

-- ----------------------------
-- Table structure for validation
-- ----------------------------
DROP TABLE IF EXISTS `validation`;
CREATE TABLE `validation` (
  `validation_id` int(11) NOT NULL COMMENT '验证者的ID',
  `validation_acc` varchar(255) NOT NULL COMMENT '验证者的账号（手机号，邮箱）',
  `validation_code` varchar(50) NOT NULL COMMENT '验证码',
  PRIMARY KEY (`validation_id`),
  CONSTRAINT `validation_ibfk_1` FOREIGN KEY (`validation_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户邮箱、电话验证信息';

-- ----------------------------
-- Table structure for vnotice
-- ----------------------------
DROP TABLE IF EXISTS `vnotice`;
CREATE TABLE `vnotice` (
  `vnotice_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '通知查看ID',
  `vnotice_flag` enum('未查看','已查看') CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '未查看' COMMENT '是否查看',
  `notice_id` int(11) NOT NULL COMMENT '通知ID',
  `student_id` int(11) NOT NULL COMMENT '学生ID',
  `parents_id` int(11) DEFAULT NULL COMMENT '家长ID',
  PRIMARY KEY (`vnotice_id`),
  KEY `notice_id` (`notice_id`),
  KEY `vnotice_ibfk_2` (`student_id`),
  KEY `vnotice_ibfk_3` (`parents_id`),
  CONSTRAINT `vnotice_ibfk_1` FOREIGN KEY (`notice_id`) REFERENCES `notice` (`notice_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vnotice_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vnotice_ibfk_3` FOREIGN KEY (`parents_id`) REFERENCES `user` (`user_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='通知查看信息表';

-- ----------------------------
-- View structure for chat_view
-- ----------------------------
DROP VIEW IF EXISTS `chat_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `chat_view` AS select `chat`.`chat_id` AS `chat_id`,`chat`.`chat_date` AS `chat_date`,`chat`.`chat_type` AS `chat_type`,`chat`.`chat_content` AS `chat_content`,`chat`.`send_id` AS `send_id`,`chat`.`receive_id` AS `receive_id`,`chat`.`chat_mesg` AS `chat_mesg`,`send_user`.`user_name` AS `send_name`,`send_user`.`user_sex` AS `send_sex`,`send_user`.`user_birth` AS `send_birth`,`send_user`.`user_tel` AS `send_tel`,`send_user`.`user_addr` AS `send_addr`,`send_user`.`user_type` AS `send_type`,`send_user`.`user_email` AS `send_email`,`send_user`.`user_profile` AS `send_profile`,`send_user`.`user_signature` AS `send_signature`,`receive_user`.`user_name` AS `receive_name`,`receive_user`.`user_sex` AS `receive_sex`,`receive_user`.`user_birth` AS `receive_birth`,`receive_user`.`user_tel` AS `receive_tel`,`receive_user`.`user_addr` AS `receive_addr`,`receive_user`.`user_type` AS `receive_type`,`receive_user`.`user_email` AS `receive_email`,`receive_user`.`user_profile` AS `receive_profile`,`receive_user`.`user_signature` AS `receive_signature` from ((`chat` join `user` `send_user` on((`chat`.`send_id` = `send_user`.`user_id`))) join `user` `receive_user` on((`chat`.`receive_id` = `receive_user`.`user_id`)));

-- ----------------------------
-- View structure for contact_view
-- ----------------------------
DROP VIEW IF EXISTS `contact_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `contact_view` AS select `chat_t`.`user_id` AS `user_id`,`chat_t`.`user_name` AS `user_name`,`chat_t`.`user_tel` AS `user_tel`,`chat_t`.`user_type` AS `user_type`,`chat_t`.`user_signature` AS `user_signature`,`chat_t`.`user_email` AS `user_email`,`chat_t`.`user_profile` AS `user_profile`,`chat_t`.`user_birth` AS `user_birth`,`chat_t`.`user_addr` AS `user_addr`,`chat_t`.`user_sex` AS `user_sex`,`chat_t`.`chat_id` AS `chat_id`,`chat_t`.`other_id` AS `other_id`,`chat_t`.`chat_date` AS `chat_date`,`chat_t`.`chat_content` AS `chat_content`,`chat_t`.`chat_type` AS `chat_type`,`chat_t`.`chat_mesg` AS `chat_mesg`,count(if((`chat_t`.`chat_mesg` = 0),TRUE,NULL)) AS `chat_mesgnum` from (select `t`.`user_id` AS `user_id`,`t`.`user_name` AS `user_name`,`t`.`user_tel` AS `user_tel`,`t`.`user_type` AS `user_type`,`t`.`user_signature` AS `user_signature`,`t`.`user_email` AS `user_email`,`t`.`user_profile` AS `user_profile`,`t`.`user_birth` AS `user_birth`,`t`.`user_addr` AS `user_addr`,`t`.`user_sex` AS `user_sex`,`t`.`chat_id` AS `chat_id`,`t`.`other_id` AS `other_id`,`t`.`chat_date` AS `chat_date`,`t`.`chat_content` AS `chat_content`,`t`.`chat_type` AS `chat_type`,`t`.`chat_mesg` AS `chat_mesg` from ((select `user`.`user_id` AS `user_id`,`user`.`user_name` AS `user_name`,`user`.`user_tel` AS `user_tel`,`user`.`user_type` AS `user_type`,`user`.`user_signature` AS `user_signature`,`user`.`user_email` AS `user_email`,`user`.`user_profile` AS `user_profile`,`user`.`user_birth` AS `user_birth`,`user`.`user_addr` AS `user_addr`,`user`.`user_sex` AS `user_sex`,`chat`.`chat_id` AS `chat_id`,`chat`.`receive_id` AS `other_id`,`chat`.`chat_date` AS `chat_date`,`chat`.`chat_content` AS `chat_content`,`chat`.`chat_type` AS `chat_type`,`chat`.`chat_mesg` AS `chat_mesg` from (`user` join `chat` on((`user`.`user_id` = `chat`.`send_id`)))) union all (select `user`.`user_id` AS `user_id`,`user`.`user_name` AS `user_name`,`user`.`user_tel` AS `user_tel`,`user`.`user_type` AS `user_type`,`user`.`user_signature` AS `user_signature`,`user`.`user_email` AS `user_email`,`user`.`user_profile` AS `user_profile`,`user`.`user_birth` AS `user_birth`,`user`.`user_addr` AS `user_addr`,`user`.`user_sex` AS `user_sex`,`chat`.`chat_id` AS `chat_id`,`chat`.`send_id` AS `other_id`,`chat`.`chat_date` AS `chat_date`,`chat`.`chat_content` AS `chat_content`,`chat`.`chat_type` AS `chat_type`,1 AS `chat_mesg` from (`user` join `chat` on((`user`.`user_id` = `chat`.`receive_id`))))) `t` order by `t`.`chat_date` desc limit 10000000000) `chat_t` group by `chat_t`.`user_id`,`chat_t`.`other_id`;

-- ----------------------------
-- View structure for homework_view
-- ----------------------------
DROP VIEW IF EXISTS `homework_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `homework_view` AS select `course`.`course_name` AS `course_name`,`tclass`.`course_id` AS `course_id`,`tclass`.`teacher_id` AS `teacher_id`,`user`.`user_name` AS `user_name`,`user`.`user_tel` AS `user_tel`,`user`.`user_addr` AS `user_addr`,`user`.`user_email` AS `user_email`,`user`.`user_profile` AS `user_profile`,`user`.`user_signature` AS `user_signature`,`user`.`user_sex` AS `user_sex`,`tclass`.`tclass_validation` AS `tclass_validation`,`homework`.`homework_id` AS `homework_id`,`homework`.`homework_content` AS `homework_content`,`homework`.`homework_date` AS `homework_date`,`homework`.`homework_attachment` AS `homework_attachment`,`homework`.`tclass_id` AS `tclass_id`,`user`.`user_birth` AS `user_birth`,`tclass`.`class_id` AS `class_id` from (((`homework` join `tclass` on((`homework`.`tclass_id` = `tclass`.`tclass_id`))) join `course` on((`tclass`.`course_id` = `course`.`course_id`))) join `user` on((`tclass`.`teacher_id` = `user`.`user_id`)));

-- ----------------------------
-- View structure for notice_view
-- ----------------------------
DROP VIEW IF EXISTS `notice_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `notice_view` AS select `notice`.`notice_id` AS `notice_id`,`notice`.`notice_title` AS `notice_title`,`notice`.`notice_content` AS `notice_content`,`notice`.`notice_date` AS `notice_date`,`notice`.`notice_attachment` AS `notice_attachment`,`notice`.`class_id` AS `class_id`,`notice`.`user_id` AS `user_id`,`user`.`user_name` AS `user_name`,`user`.`user_sex` AS `user_sex`,`user`.`user_tel` AS `user_tel`,`user`.`user_addr` AS `user_addr`,`user`.`user_type` AS `user_type`,`user`.`user_email` AS `user_email`,`user`.`user_profile` AS `user_profile`,`user`.`user_signature` AS `user_signature`,`class`.`class_name` AS `class_name` from ((`notice` join `user` on((`notice`.`user_id` = `user`.`user_id`))) join `class` on((`notice`.`class_id` = `class`.`class_id`)));

-- ----------------------------
-- View structure for vnotice_view
-- ----------------------------
DROP VIEW IF EXISTS `vnotice_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `vnotice_view` AS select `vnotice`.`vnotice_id` AS `vnotice_id`,`vnotice`.`vnotice_flag` AS `vnotice_flag`,`vnotice`.`notice_id` AS `notice_id`,`vnotice`.`student_id` AS `student_id`,`vnotice`.`parents_id` AS `parents_id`,`user`.`user_name` AS `user_name`,`user`.`user_sex` AS `user_sex`,`user`.`user_birth` AS `user_birth`,`user`.`user_tel` AS `user_tel`,`user`.`user_addr` AS `user_addr`,`user`.`user_type` AS `user_type`,`user`.`user_email` AS `user_email`,`user`.`user_profile` AS `user_profile`,`user`.`user_signature` AS `user_signature`,`user_parents`.`user_name` AS `parents_name`,`user_parents`.`user_sex` AS `parents_sex`,`user_parents`.`user_birth` AS `parents_birth`,`user_parents`.`user_tel` AS `parents_tel`,`user_parents`.`user_addr` AS `parents_addr`,`user_parents`.`user_type` AS `parents_type`,`user_parents`.`user_email` AS `parents_email`,`user_parents`.`user_profile` AS `parents_profile`,`user_parents`.`user_signature` AS `parents_signature`,`user_parents`.`user_date` AS `user_date`,`parents`.`parents_relation` AS `parents_relation` from (((`vnotice` join `user` on((`vnotice`.`student_id` = `user`.`user_id`))) join `user` `user_parents` on((`vnotice`.`parents_id` = `user_parents`.`user_id`))) join `parents` on((`user_parents`.`user_id` = `parents`.`parents_id`)));

SET FOREIGN_KEY_CHECKS = 1;

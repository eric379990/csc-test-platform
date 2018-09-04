/*
Navicat MySQL Data Transfer

Source Server         : 10.237.3.81_root_123456
Source Server Version : 50719
Source Host           : 10.237.3.81:3389
Source Database       : db_eolinker

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-08-30 09:15:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for eo_api
-- ----------------------------
DROP TABLE IF EXISTS `eo_api`;
CREATE TABLE `eo_api` (
  `apiID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `apiName` varchar(255) COLLATE utf8_bin NOT NULL,
  `apiURI` varchar(255) COLLATE utf8_bin NOT NULL,
  `apiProtocol` tinyint(4) unsigned NOT NULL,
  `apiFailureMock` text COLLATE utf8_bin,
  `apiSuccessMock` text COLLATE utf8_bin,
  `apiRequestType` tinyint(4) unsigned NOT NULL,
  `apiSuccessMockType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `apiFailureMockType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `apiStatus` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `apiUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `groupID` int(11) unsigned NOT NULL,
  `projectID` int(11) unsigned NOT NULL,
  `starred` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `removed` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `removeTime` timestamp NULL DEFAULT NULL,
  `apiNoteType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `apiNoteRaw` text COLLATE utf8_bin,
  `apiNote` text COLLATE utf8_bin,
  `apiRequestParamType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `apiRequestRaw` text COLLATE utf8_bin,
  `updateUserID` int(11) NOT NULL DEFAULT '0',
  `mockRule` text COLLATE utf8_bin,
  `mockResult` text COLLATE utf8_bin,
  `mockConfig` text COLLATE utf8_bin,
  `apiSuccessStatusCode` varchar(255) COLLATE utf8_bin DEFAULT '200',
  `apiFailureStatusCode` varchar(255) COLLATE utf8_bin DEFAULT '200',
  `beforeInject` text COLLATE utf8_bin,
  `afterInject` text COLLATE utf8_bin,
  PRIMARY KEY (`apiID`,`groupID`,`apiURI`),
  KEY `groupID` (`groupID`),
  KEY `apiID` (`apiID`),
  KEY `projectID` (`projectID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_api_cache
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_cache`;
CREATE TABLE `eo_api_cache` (
  `cacheID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `projectID` int(10) unsigned NOT NULL,
  `groupID` int(10) unsigned NOT NULL,
  `apiID` int(10) unsigned NOT NULL,
  `apiJson` longtext NOT NULL,
  `starred` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `updateUserID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`cacheID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_env
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_env`;
CREATE TABLE `eo_api_env` (
  `envID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `envName` varchar(255) NOT NULL,
  `projectID` int(10) unsigned NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `port` char(255) DEFAULT NULL,
  PRIMARY KEY (`envID`,`projectID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_env_front_uri
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_env_front_uri`;
CREATE TABLE `eo_api_env_front_uri` (
  `envID` int(10) unsigned NOT NULL,
  `uri` varchar(255) NOT NULL,
  `uriID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `applyProtocol` varchar(4) NOT NULL DEFAULT '-1',
  PRIMARY KEY (`uriID`,`envID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_env_header
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_env_header`;
CREATE TABLE `eo_api_env_header` (
  `headerID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `envID` int(11) NOT NULL,
  `applyProtocol` varchar(255) DEFAULT NULL,
  `headerName` varchar(255) NOT NULL,
  `headerValue` text NOT NULL,
  PRIMARY KEY (`headerID`,`envID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_env_param
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_env_param`;
CREATE TABLE `eo_api_env_param` (
  `paramID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `envID` int(10) unsigned NOT NULL,
  `paramKey` varchar(255) NOT NULL,
  `paramValue` text NOT NULL,
  PRIMARY KEY (`paramID`,`envID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_env_param_additional
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_env_param_additional`;
CREATE TABLE `eo_api_env_param_additional` (
  `paramID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `envID` int(10) unsigned NOT NULL,
  `paramKey` varchar(255) NOT NULL,
  `paramValue` text NOT NULL,
  PRIMARY KEY (`paramID`,`envID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_group
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_group`;
CREATE TABLE `eo_api_group` (
  `groupID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `groupName` varchar(30) COLLATE utf8_bin NOT NULL,
  `projectID` int(11) unsigned NOT NULL,
  `parentGroupID` int(10) unsigned NOT NULL DEFAULT '0',
  `isChild` tinyint(4) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`groupID`,`projectID`),
  KEY `groupID` (`groupID`),
  KEY `projectID` (`projectID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_api_group_order
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_group_order`;
CREATE TABLE `eo_api_group_order` (
  `orderID` int(11) NOT NULL AUTO_INCREMENT,
  `projectID` int(11) NOT NULL,
  `orderList` text,
  PRIMARY KEY (`orderID`,`projectID`),
  UNIQUE KEY `projectID` (`projectID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_header
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_header`;
CREATE TABLE `eo_api_header` (
  `headerID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `headerName` varchar(255) NOT NULL,
  `headerValue` text NOT NULL,
  `apiID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`headerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_history
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_history`;
CREATE TABLE `eo_api_history` (
  `historyID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `projectID` int(10) unsigned NOT NULL,
  `groupID` int(10) unsigned NOT NULL,
  `apiID` int(10) unsigned NOT NULL,
  `historyJson` longtext NOT NULL,
  `updateDesc` varchar(255) NOT NULL,
  `updateUserID` int(10) unsigned NOT NULL,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isNow` tinyint(4) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`historyID`,`apiID`,`updateTime`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_request_param
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_request_param`;
CREATE TABLE `eo_api_request_param` (
  `paramID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `paramName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `paramKey` varchar(255) COLLATE utf8_bin NOT NULL,
  `paramValue` text COLLATE utf8_bin NOT NULL,
  `paramType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `paramLimit` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `apiID` int(10) unsigned NOT NULL,
  `paramNotNull` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`paramID`),
  KEY `apiID` (`apiID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_api_request_value
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_request_value`;
CREATE TABLE `eo_api_request_value` (
  `valueID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `value` text,
  `valueDescription` varchar(255) DEFAULT NULL,
  `paramID` int(10) unsigned NOT NULL,
  `rowNo` int(10) DEFAULT NULL,
  PRIMARY KEY (`valueID`),
  KEY `paramID` (`paramID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_result_param
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_result_param`;
CREATE TABLE `eo_api_result_param` (
  `paramID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `paramName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `paramKey` varchar(255) COLLATE utf8_bin NOT NULL,
  `apiID` int(11) unsigned NOT NULL,
  `paramNotNull` tinyint(4) unsigned NOT NULL,
  PRIMARY KEY (`paramID`),
  KEY `apiID` (`apiID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_api_result_value
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_result_value`;
CREATE TABLE `eo_api_result_value` (
  `valueID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `value` text COLLATE utf8_bin NOT NULL,
  `valueDescription` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `paramID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`valueID`),
  KEY `resultParamID` (`paramID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_api_schema
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_schema`;
CREATE TABLE `eo_api_schema` (
  `sID` int(11) NOT NULL AUTO_INCREMENT,
  `apiID` int(11) NOT NULL,
  `content` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for eo_api_status_code_group_order
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_status_code_group_order`;
CREATE TABLE `eo_api_status_code_group_order` (
  `orderID` int(11) NOT NULL AUTO_INCREMENT,
  `projectID` int(11) NOT NULL,
  `orderList` text NOT NULL,
  PRIMARY KEY (`orderID`,`projectID`),
  UNIQUE KEY `projectID` (`projectID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_api_test_history
-- ----------------------------
DROP TABLE IF EXISTS `eo_api_test_history`;
CREATE TABLE `eo_api_test_history` (
  `testID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `apiID` int(10) unsigned NOT NULL,
  `requestInfo` longtext,
  `resultInfo` longtext,
  `testTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `projectID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`testID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_conn_database
-- ----------------------------
DROP TABLE IF EXISTS `eo_conn_database`;
CREATE TABLE `eo_conn_database` (
  `connID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dbID` int(10) unsigned NOT NULL,
  `userID` int(10) unsigned NOT NULL,
  `userType` tinyint(4) NOT NULL DEFAULT '0',
  `inviteUserID` int(10) DEFAULT NULL,
  `partnerNickName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`connID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_conn_project
-- ----------------------------
DROP TABLE IF EXISTS `eo_conn_project`;
CREATE TABLE `eo_conn_project` (
  `connID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `projectID` int(11) unsigned NOT NULL,
  `userID` int(11) unsigned NOT NULL,
  `userType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `inviteUserID` int(11) DEFAULT NULL,
  `partnerNickName` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`connID`,`projectID`,`userID`),
  KEY `projectID` (`projectID`),
  KEY `eo_conn_ibfk_2` (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_database
-- ----------------------------
DROP TABLE IF EXISTS `eo_database`;
CREATE TABLE `eo_database` (
  `dbID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dbName` varchar(255) NOT NULL,
  `dbVersion` float unsigned NOT NULL,
  `dbUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `databaseType` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`dbID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_database_table
-- ----------------------------
DROP TABLE IF EXISTS `eo_database_table`;
CREATE TABLE `eo_database_table` (
  `dbID` int(10) unsigned NOT NULL,
  `tableID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tableName` varchar(255) NOT NULL,
  `tableDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tableID`,`dbID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_database_table_field
-- ----------------------------
DROP TABLE IF EXISTS `eo_database_table_field`;
CREATE TABLE `eo_database_table_field` (
  `fieldID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `fieldName` varchar(255) NOT NULL,
  `fieldType` varchar(10) NOT NULL,
  `fieldLength` varchar(10) NOT NULL,
  `isNotNull` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `isPrimaryKey` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `fieldDescription` varchar(255) DEFAULT NULL,
  `tableID` int(10) unsigned NOT NULL,
  `defaultValue` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fieldID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_log_project_operation
-- ----------------------------
DROP TABLE IF EXISTS `eo_log_project_operation`;
CREATE TABLE `eo_log_project_operation` (
  `opID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `opType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `opUserID` int(10) unsigned NOT NULL,
  `opDesc` text NOT NULL,
  `opTime` datetime NOT NULL,
  `opProjectID` int(10) unsigned NOT NULL,
  `opTarget` tinyint(4) unsigned NOT NULL,
  `opTargetID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`opID`,`opTargetID`,`opProjectID`,`opUserID`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_message
-- ----------------------------
DROP TABLE IF EXISTS `eo_message`;
CREATE TABLE `eo_message` (
  `msgID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `toUserID` int(10) unsigned NOT NULL,
  `fromUserID` int(10) unsigned NOT NULL,
  `msgSendTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `msgType` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `summary` varchar(255) DEFAULT NULL,
  `msg` text NOT NULL,
  `isRead` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `otherMsg` text,
  PRIMARY KEY (`msgID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project
-- ----------------------------
DROP TABLE IF EXISTS `eo_project`;
CREATE TABLE `eo_project` (
  `projectID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `projectType` tinyint(4) unsigned NOT NULL,
  `projectName` varchar(255) COLLATE utf8_bin NOT NULL,
  `projectUpdateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `projectVersion` varchar(6) COLLATE utf8_bin NOT NULL DEFAULT '1.0',
  PRIMARY KEY (`projectID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for eo_project_document
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_document`;
CREATE TABLE `eo_project_document` (
  `documentID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `groupID` int(10) unsigned NOT NULL,
  `projectID` int(10) unsigned NOT NULL,
  `contentType` tinyint(4) unsigned NOT NULL,
  `contentRaw` longtext,
  `content` longtext,
  `title` varchar(255) NOT NULL,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `userID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`documentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_document_group
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_document_group`;
CREATE TABLE `eo_project_document_group` (
  `groupID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `projectID` int(10) unsigned NOT NULL,
  `groupName` varchar(255) NOT NULL,
  `parentGroupID` int(10) unsigned NOT NULL DEFAULT '0',
  `isChild` tinyint(4) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`groupID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_document_group_order
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_document_group_order`;
CREATE TABLE `eo_project_document_group_order` (
  `orderID` int(11) NOT NULL AUTO_INCREMENT,
  `projectID` int(11) NOT NULL,
  `orderList` text NOT NULL,
  PRIMARY KEY (`orderID`,`projectID`),
  UNIQUE KEY `projectID` (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_environment
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_environment`;
CREATE TABLE `eo_project_environment` (
  `envID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `envName` varchar(255) NOT NULL,
  `envURI` varchar(255) NOT NULL,
  `projectID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`envID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_invite
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_invite`;
CREATE TABLE `eo_project_invite` (
  `projectID` int(11) unsigned NOT NULL,
  `inviteCode` varchar(6) NOT NULL,
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`projectID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_status_code
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_status_code`;
CREATE TABLE `eo_project_status_code` (
  `codeID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `codeDescription` varchar(255) NOT NULL,
  `groupID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`codeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_status_code_group
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_status_code_group`;
CREATE TABLE `eo_project_status_code_group` (
  `groupID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `projectID` int(10) unsigned NOT NULL,
  `groupName` varchar(255) NOT NULL,
  `parentGroupID` int(10) unsigned NOT NULL DEFAULT '0',
  `isChild` tinyint(4) unsigned NOT NULL DEFAULT '0',
  PRIMARY KEY (`groupID`,`projectID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_test_case
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_test_case`;
CREATE TABLE `eo_project_test_case` (
  `caseID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `projectID` int(11) NOT NULL COMMENT '项目ID',
  `userID` int(11) NOT NULL COMMENT '用户ID',
  `caseName` varchar(255) NOT NULL COMMENT '用例名称',
  `caseDesc` varchar(255) DEFAULT NULL COMMENT '用例描述',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime NOT NULL COMMENT '更新时间',
  `groupID` int(11) NOT NULL COMMENT '分组ID',
  `caseType` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0表示简单，1表示高级',
  `caseCode` longtext,
  `apiID` int(11) NOT NULL,
  PRIMARY KEY (`caseID`,`projectID`,`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_test_case_execution_details
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_test_case_execution_details`;
CREATE TABLE `eo_project_test_case_execution_details` (
  `testID` int(11) NOT NULL AUTO_INCREMENT,
  `startTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `endTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `projectID` int(11) NOT NULL,
  `groupID` int(11) DEFAULT NULL,
  `apiID` int(11) NOT NULL,
  `executionID` int(11) NOT NULL,
  `status` tinyint(4) DEFAULT NULL COMMENT '0表示未执行，1表示通过，2表示失败',
  `caseID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `requestInfo` longtext,
  `result` longtext,
  PRIMARY KEY (`testID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_test_case_group
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_test_case_group`;
CREATE TABLE `eo_project_test_case_group` (
  `groupID` int(11) NOT NULL AUTO_INCREMENT COMMENT '分组ID',
  `groupName` varchar(100) NOT NULL COMMENT '组名',
  `projectID` int(11) NOT NULL COMMENT '项目ID',
  `parentGroupID` int(11) NOT NULL DEFAULT '0' COMMENT '父分组',
  `isChild` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否子分组',
  PRIMARY KEY (`groupID`,`projectID`,`parentGroupID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_test_case_history
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_test_case_history`;
CREATE TABLE `eo_project_test_case_history` (
  `testID` int(11) NOT NULL AUTO_INCREMENT COMMENT '测试ID',
  `caseID` int(11) NOT NULL COMMENT '用例ID',
  `result` text COMMENT '测试结果',
  `testTime` datetime DEFAULT NULL COMMENT '测试时间',
  `status` tinyint(4) DEFAULT NULL COMMENT '0表示失败，1表示通过',
  PRIMARY KEY (`testID`,`caseID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_test_case_single
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_test_case_single`;
CREATE TABLE `eo_project_test_case_single` (
  `connID` int(11) NOT NULL AUTO_INCREMENT COMMENT '关联ID',
  `caseID` int(11) NOT NULL COMMENT '用例ID',
  `caseData` text COMMENT '内容',
  `caseCode` text COMMENT '用例代码',
  `statusCode` varchar(20) DEFAULT NULL,
  `matchType` tinyint(4) DEFAULT NULL,
  `matchRule` text,
  `apiName` varchar(255) NOT NULL COMMENT '接口名称',
  `apiURI` varchar(255) NOT NULL COMMENT '接口路径',
  `apiRequestType` tinyint(4) DEFAULT '0' COMMENT '请求参数类型',
  `orderNumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`connID`,`caseID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_project_test_execution_history
-- ----------------------------
DROP TABLE IF EXISTS `eo_project_test_execution_history`;
CREATE TABLE `eo_project_test_execution_history` (
  `executionID` int(11) NOT NULL AUTO_INCREMENT COMMENT '测试执行ID',
  `testTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '测试时间',
  `status` tinyint(4) DEFAULT NULL COMMENT '0表示未执行，1表示通过，2表示失败',
  `comments` text,
  `userID` int(11) DEFAULT NULL,
  `projectID` int(11) DEFAULT NULL,
  PRIMARY KEY (`executionID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for eo_user
-- ----------------------------
DROP TABLE IF EXISTS `eo_user`;
CREATE TABLE `eo_user` (
  `userID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userName` varchar(60) NOT NULL,
  `userPassword` varchar(60) NOT NULL,
  `userNickName` varchar(16) NOT NULL DEFAULT '',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

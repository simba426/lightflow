DROP TABLE IF EXISTS `poster`;
CREATE TABLE `poster` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `author_id` varchar(64) NOT NULL COMMENT '发送人id',
  `channel_id` int(10) NOT NULL COMMENT '频道id',
  `url` varchar(1024) NOT NULL COMMENT '内容链接',
  `title` varchar(255) NOT NULL COMMENT '内容链接',
  `content` varchar(1024) NOT NULL COMMENT '内容链接',
  `type` int(2) NOT NULL COMMENT '推文类型',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
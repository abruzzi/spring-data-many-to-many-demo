CREATE DATABASE IF NOT EXISTS `cbg`
USE `cbg`;

DROP TABLE IF EXISTS `tasks`;

CREATE TABLE `tasks` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `divisions`;

CREATE TABLE `divisions` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `division_permissions`;

CREATE TABLE `division_permissions` (
  `task_id` int(10) unsigned NOT NULL,
  `division_id` int(10) unsigned NOT NULL,
  `expire_at` datetime DEFAULT NULL,
  PRIMARY KEY (`task_id`,`division_id`),
  KEY `fk_division_permissions_division_idx` (`division_id`),
  CONSTRAINT `fk_division_permissions_task` FOREIGN KEY (`task_id`) REFERENCES `tasks` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_division_permissions_division` FOREIGN KEY (`division_id`) REFERENCES `divisions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
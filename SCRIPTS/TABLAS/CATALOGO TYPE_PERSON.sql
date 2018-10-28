CREATE TABLE `CHAODESEMPLEO`.`typeperson` (
  `ID_TYPEPERSON` int(11) NOT NULL AUTO_INCREMENT COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NAME` varchar(70) DEFAULT NULL COMMENT 'ATTRIBUTE WITH THE NAME OF THE TYPE OF PERSON',
  `STATE` int(11) DEFAULT NULL COMMENT 'STATE OF TYPE OF PERSON',
  
  `DATE_CREATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_TYPEPERSON`),
  KEY `STATE` (`STATE`),
  CONSTRAINT `typeperson_ibfk_1` FOREIGN KEY (`STATE`) REFERENCES `state` (`id_state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='CATALOGUE OF TYPE OF PERSON';

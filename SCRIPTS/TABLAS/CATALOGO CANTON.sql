CREATE TABLE `chaodesempleo`.`canton` (
  `ID_CANTON` int(11) NOT NULL AUTO_INCREMENT COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NAME` varchar(70) DEFAULT NULL COMMENT 'ATTRIBUTE WITH THE NAME OF THE CANTON',
  `STATE` int(11) DEFAULT NULL COMMENT 'STATE OF THE BENEFITS',
  `ID_PROVINCE` int(11) DEFAULT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE PROVINCE',
  
  `DATE_CREATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_CANTON`),
  KEY `fk_IDPROVINCE` (`ID_PROVINCE`),
  KEY `STATE` (`STATE`),
  CONSTRAINT `canton_ibfk_1` FOREIGN KEY (`STATE`) REFERENCES `state` (`id_state`),
  CONSTRAINT `fk_IDPROVINCE` FOREIGN KEY (`ID_PROVINCE`) REFERENCES `province` (`id_province`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='CATALOGUE OF CANTON';

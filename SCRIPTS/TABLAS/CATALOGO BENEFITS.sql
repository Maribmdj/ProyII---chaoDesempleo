CREATE TABLE `CHAODESEMPLEO`.`benefits` (
  `ID_benefits` int(11) NOT NULL AUTO_INCREMENT COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NAME` varchar(70) DEFAULT NULL COMMENT 'ATTRIBUTE WITH THE NAME OF THE BENEFIT OFFERED BY THE COMPANY',
  `STATE` int(11) DEFAULT NULL COMMENT 'STATE OF THE BENEFITS',
  
  `DATE_CREATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_benefits`),
  KEY `STATE` (`STATE`),
  CONSTRAINT `benefits_ibfk_1` FOREIGN KEY (`STATE`) REFERENCES `state` (`id_state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='TABLE OF BENEFITS OFFERED BY THE COMPANY';


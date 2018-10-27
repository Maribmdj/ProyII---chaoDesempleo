CREATE TABLE `province` (
  `ID_PROVINCE` int(11) NOT NULL COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NAME` varchar(70) DEFAULT NULL COMMENT 'ATTRIBUTE WITH THE NAME OF THE PROVINCE',
  `STATE` int(11) DEFAULT NULL,
  `ID_COUNTRY` int(11) DEFAULT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE COUNTRY',
  `DATE_CREATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` date DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` varchar(20) DEFAULT NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_PROVINCE`),
  KEY `fk_IDCOUNTRY` (`ID_COUNTRY`),
  KEY `STATE` (`STATE`),
  CONSTRAINT `fk_IDCOUNTRY` FOREIGN KEY (`ID_COUNTRY`) REFERENCES `country` (`id_country`),
  CONSTRAINT `province_ibfk_1` FOREIGN KEY (`STATE`) REFERENCES `state` (`id_state`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='CATALOGUE OF PROVINCE';

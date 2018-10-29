CREATE TABLE `chaodesempleo`.`JOBXREQ` (
  `ID_JOBXREQ` INT NOT NULL AUTO_INCREMENT COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',  
  `ID_REQ` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE REQUIRIMENT',
  `ID_JOB` INT NULL COMMENT 'REFERENCED IDENTIFIER OF THE TABLE JOB',
  
  `DATE_CREATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_JOBXREQ`),
  
  KEY `fk_IDREQ` (`ID_REQ`),
  KEY `fk_JRIDJOB` (`ID_JOB`),
  CONSTRAINT `fk_IDREQ` FOREIGN KEY (`ID_REQ`) REFERENCES `REQUIRIMENT` (`ID_REQUIRIMENT`),
  CONSTRAINT `fk_JRIDJOB` FOREIGN KEY (`ID_JOB`) REFERENCES `JOB` (`ID_JOB`))
  
COMMENT = 'TABLE JOB X REQUIRIMENT';


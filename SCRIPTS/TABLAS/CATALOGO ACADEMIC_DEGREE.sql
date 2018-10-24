
CREATE TABLE `chaodesempleo`.`ACADEMIC_DEGREE` (
  `ID_ACADEMIC_DEGREE` INT NOT NULL COMMENT 'UNIQUE IDENTIFIER OF THE TABLE',
  `NAME` VARCHAR(70) NULL COMMENT 'ATTRIBUTE WITH THE NAME OF THE ACADEMIC_DEGREE',
  `STATE` VARCHAR(15) NULL COMMENT 'STATE OF THE ACADEMIC_DEGREE',
  `DATE_CREATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_CREATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  `DATE_LAST_MODIFICATION` DATE NULL COMMENT 'ATTRIBUTE AUDIT',
  `USER_LAST_MODIFICATION` VARCHAR(20) NULL COMMENT 'ATTRIBUTE AUDIT',
  PRIMARY KEY (`ID_ACADEMIC_DEGREE`))
COMMENT = 'CATALOGUE OF ACADEMIC_DEGREE';


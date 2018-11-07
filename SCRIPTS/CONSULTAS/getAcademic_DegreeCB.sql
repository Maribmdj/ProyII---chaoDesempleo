Delimiter $$

CREATE PROCEDURE `getADegreeCB`()
MODIFIES SQL DATA
BEGIN
  SELECT name FROM academic_degree;
  #where ID_JOB_POSITION = isnull (ID_JOB_POSITION);
END$$

delimiter ;
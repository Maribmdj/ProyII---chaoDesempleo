Delimiter $$

CREATE PROCEDURE `getJobPositionCB`()
MODIFIES SQL DATA
BEGIN
  SELECT name FROM job_position;
  #where ID_JOB_POSITION = isnull (ID_JOB_POSITION);
END$$

delimiter ;
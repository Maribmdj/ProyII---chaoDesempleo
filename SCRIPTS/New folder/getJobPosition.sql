Delimiter $$

CREATE PROCEDURE `getJobPosition`()
MODIFIES SQL DATA
BEGIN
  SELECT ID_JOB_POSITION, name, state FROM job_position;
END$$

delimiter ;
Delimiter $$

CREATE PROCEDURE `getJobPosition`(in pID_JOB_POSITION int)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM job_position
  where ID_JOB_POSITION = isnull (pID_JOB_POSITION,ID_JOB_POSITION);
END$$

delimiter ;
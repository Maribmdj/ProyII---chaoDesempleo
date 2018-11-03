Delimiter $$

CREATE PROCEDURE `getJobPosition`(in pID_JOB_POSITION int)
MODIFIES SQL DATA
BEGIN
  SELECT ID_JOB_POSITION, name, state FROM job_position
  where ID_JOB_POSITION = ifnull (pID_JOB_POSITION,ID_JOB_POSITION);
END$$

delimiter ;
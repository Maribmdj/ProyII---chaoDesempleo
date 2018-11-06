Delimiter $$

CREATE PROCEDURE `getJobxReq`(in pid_jobxreq int)
MODIFIES SQL DATA
BEGIN
  SELECT id_jobxreq, ID_REQ, ID_JOB FROM jobxreq
  where id_jobxreq = isnull (pid_jobxreq,id_jobxreq);
END$$

delimiter ;
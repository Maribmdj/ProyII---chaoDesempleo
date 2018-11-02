Delimiter $$

CREATE PROCEDURE `getJobxReq`()
MODIFIES SQL DATA
BEGIN
  SELECT id_jobxreq, ID_REQ, ID_JOB FROM jobxreq;
END$$

delimiter ;
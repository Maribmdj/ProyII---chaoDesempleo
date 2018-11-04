DELIMITER $$
CREATE PROCEDURE update_jobxreq(IN pid_jobxreq INT, IN pid_req INT, IN pid_job INT)
	BEGIN
		UPDATE jobxreq
        set 
        id_req = ifnull ( pid_req,id_req),
        id_job = ifnull ( pid_job,id_job)
        where id_jobxreq=pid_jobxreq;
    END$$
    
DELIMITER ;
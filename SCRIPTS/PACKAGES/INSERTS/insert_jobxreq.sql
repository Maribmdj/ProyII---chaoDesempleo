DELIMITER $$
CREATE PROCEDURE insert_jobxreq(IN pId_req INT, IN pId_job INT)
	BEGIN
		INSERT INTO jobxreq(ID_REQ, ID_JOB) 
        VALUES (pId_req, pId_job);
    END$$
    
DELIMITER ;
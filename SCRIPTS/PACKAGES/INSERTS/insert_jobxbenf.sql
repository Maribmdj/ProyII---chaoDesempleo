DELIMITER $$
CREATE PROCEDURE insert_jobxbenf(IN pId_benf INT, IN pId_job INT)
	BEGIN
		INSERT INTO jobxbenf(ID_BENF, ID_JOB) 
        VALUES (pId_benf, pId_job);
    END$$
    
DELIMITER ;
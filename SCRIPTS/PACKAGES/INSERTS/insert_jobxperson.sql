DELIMITER $$
CREATE PROCEDURE insert_jobxperson(IN pId_person INT, IN pId_job INT)
	BEGIN
		INSERT INTO jobxperson(ID_PERSON, ID_JOB) 
        VALUES (pId_person, pId_job);
    END$$
    
DELIMITER ;
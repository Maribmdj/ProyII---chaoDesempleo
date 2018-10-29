DELIMITER $$
CREATE PROCEDURE insert_job_position(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO job_position(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
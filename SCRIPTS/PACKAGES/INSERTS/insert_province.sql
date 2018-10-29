DELIMITER $$
CREATE PROCEDURE insert_province(IN pName VARCHAR(70), IN pState INT, IN pid_country INT)
	BEGIN
		INSERT INTO province(name, state, id_country) VALUES (pName, pState, pid_country);
    END$$
    
DELIMITER ;
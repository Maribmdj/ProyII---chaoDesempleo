DELIMITER $$
CREATE PROCEDURE insert_nationality(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO nationality(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
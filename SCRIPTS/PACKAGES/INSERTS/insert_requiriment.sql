DELIMITER $$
CREATE PROCEDURE insert_requiriment(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO requiriment(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
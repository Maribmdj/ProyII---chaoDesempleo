DELIMITER $$
CREATE PROCEDURE insert_career(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO career(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
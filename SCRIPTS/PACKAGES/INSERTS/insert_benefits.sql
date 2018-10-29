DELIMITER $$
CREATE PROCEDURE insert_benefits(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO benefits(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
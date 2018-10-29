DELIMITER $$
CREATE PROCEDURE insert_country(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO country(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
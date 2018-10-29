DELIMITER $$
CREATE PROCEDURE insert_typeperson(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO typeperson(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
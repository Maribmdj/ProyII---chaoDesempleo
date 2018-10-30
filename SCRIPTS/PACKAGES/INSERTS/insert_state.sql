DELIMITER $$
CREATE PROCEDURE insert_state(IN pName VARCHAR(70))
	BEGIN
		INSERT INTO state(name) VALUES (pName);
    END$$
    
DELIMITER ;
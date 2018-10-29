DELIMITER $$
CREATE PROCEDURE insert_distrito(IN pName VARCHAR(70), IN pState INT, IN pID_CANTON INT)
	BEGIN
		INSERT INTO distrito(name, state, ID_CANTON) VALUES (pName, pState, pID_CANTON);
    END$$
    
DELIMITER ;
DELIMITER $$
CREATE PROCEDURE insert_canton(IN pName VARCHAR(70), IN pState INT, IN pId_province INT)
	BEGIN
		INSERT INTO canton(name, state, id_province) VALUES (pName, pState, pId_province);
    END$$
    
DELIMITER ;
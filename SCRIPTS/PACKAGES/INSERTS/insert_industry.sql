DELIMITER $$
CREATE PROCEDURE insert_industry(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO industry(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
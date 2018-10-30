DELIMITER $$
CREATE PROCEDURE insert_academic_degree(IN pName VARCHAR(70), IN pState INT)
	BEGIN
		INSERT INTO academic_degree(name, state) VALUES (pName, pState);
    END$$
    
DELIMITER ;
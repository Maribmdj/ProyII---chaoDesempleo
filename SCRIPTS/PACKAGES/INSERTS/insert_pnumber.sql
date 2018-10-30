DELIMITER $$
CREATE PROCEDURE insert_pnumber(IN number VARCHAR(70), IN pid_person INT)
	BEGIN
		INSERT INTO pnumber(pnumber, id_person) VALUES (number, pid_person);
    END$$
    
DELIMITER ;
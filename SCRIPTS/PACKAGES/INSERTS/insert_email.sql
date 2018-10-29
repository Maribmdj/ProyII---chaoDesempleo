DELIMITER $$
CREATE PROCEDURE insert_email(IN pEmail VARCHAR(70), IN pID_person INT)
	BEGIN
		INSERT INTO email(email, ID_PERSON) VALUES (pEmail, pID_person);
    END$$
    
DELIMITER ;email
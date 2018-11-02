DELIMITER $$
CREATE PROCEDURE update_email(IN pid_email INT, IN pemail VARCHAR(100), IN pid_person INT)
	BEGIN
		UPDATE email
        set 
        pemail = email,
        pid_person = id_person
        where pid_email = id_email;
    END$$
    
DELIMITER ;
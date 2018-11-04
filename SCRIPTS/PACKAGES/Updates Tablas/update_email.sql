DELIMITER $$
CREATE PROCEDURE update_email(IN pid_email INT, IN pemail VARCHAR(100), IN pid_person INT)
	BEGIN
		UPDATE email
        set 
        email = isnull(pemail, email),
        id_person = isnull(pid_person, id_person)
        where pemail = email;
    END$$
    
DELIMITER ;
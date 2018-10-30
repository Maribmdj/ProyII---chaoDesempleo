DELIMITER $$
CREATE PROCEDURE insert_user(IN puser INT, IN ppassword VARCHAR(100), IN pid_person INT)
	BEGIN
		INSERT INTO user(user, password, id_person) VALUES (puser, ppassword, pid_person);
    END$$
    
DELIMITER ;
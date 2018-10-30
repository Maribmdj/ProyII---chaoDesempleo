DELIMITER $$
CREATE PROCEDURE update_user(IN puser INT, IN ppassword VARCHAR(100), IN pid_person INT)
	BEGIN
		UPDATE user
        set user=puser, 
        password=ppassword
        where id_user=pid_user;
    END$$
    
DELIMITER ;
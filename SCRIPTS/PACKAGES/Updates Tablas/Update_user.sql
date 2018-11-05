DELIMITER $$
CREATE PROCEDURE update_user(IN puser VARCHAR(80), IN ppassword VARCHAR(100))
	BEGIN
		UPDATE user
        set 
        user = ifnull(puser,user),
        password = ifnull(ppassword, password)
        where puser=user;
    END$$
    DELIMITER;
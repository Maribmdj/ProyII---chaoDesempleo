DELIMITER $$
CREATE PROCEDURE update_country(IN pid_country INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE country
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_country=pid_country;
    END$$
    
DELIMITER ;
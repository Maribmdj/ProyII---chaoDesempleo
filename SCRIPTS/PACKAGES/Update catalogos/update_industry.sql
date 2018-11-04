DELIMITER $$
CREATE PROCEDURE update_industry(IN pid_industry INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE industry
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_industry=pid_industry;
    END$$
    
DELIMITER ;
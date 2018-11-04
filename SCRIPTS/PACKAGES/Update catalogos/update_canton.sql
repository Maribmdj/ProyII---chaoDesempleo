DELIMITER $$
CREATE PROCEDURE update_canton(IN pid_canton INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE canton
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_canton=pid_canton;
    END$$
    
DELIMITER ;
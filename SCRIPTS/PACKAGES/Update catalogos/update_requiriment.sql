DELIMITER $$
CREATE PROCEDURE update_requiriment(IN pid_requiriment INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE requiriment
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_requiriment=pid_requiriment;
    END$$
    
DELIMITER ;
DELIMITER $$
CREATE PROCEDURE update_state(IN pid_state INT, IN pName VARCHAR(70))
	BEGIN
		UPDATE state
        set 
        name = ifnull ( pname,name)
        where id_state=pstate;
    END$$
    
DELIMITER ;
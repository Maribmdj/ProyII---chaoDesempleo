DELIMITER $$
CREATE PROCEDURE update_distrito(IN pid_distrito INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE distrito
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_distrito=pid_distrito;
    END$$
    
DELIMITER ;
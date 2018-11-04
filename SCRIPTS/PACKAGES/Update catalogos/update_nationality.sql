DELIMITER $$
CREATE PROCEDURE update_nationality(IN pid_nationality INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE nationality
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_nationality=pid_nationality;
    END$$
    
DELIMITER ;
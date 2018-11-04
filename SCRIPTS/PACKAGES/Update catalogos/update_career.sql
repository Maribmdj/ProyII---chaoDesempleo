DELIMITER $$
CREATE PROCEDURE update_career(IN pid_career INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE career
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_career=pid_career;
    END$$
    
DELIMITER ;
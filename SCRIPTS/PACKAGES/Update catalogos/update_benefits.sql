DELIMITER $$
CREATE PROCEDURE update_benefits(IN pid_benefits INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE benefits
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_benefits=pid_benefits;
    END$$
    
DELIMITER ;
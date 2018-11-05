DELIMITER $$
CREATE PROCEDURE update_province(IN pid_province INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE province
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_province=pid_province;
    END$$
    
DELIMITER ;
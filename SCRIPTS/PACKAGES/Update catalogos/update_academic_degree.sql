DELIMITER $$
CREATE PROCEDURE update_academic_degree(IN pid_academic_degree INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE academic_degree
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_academic_degree=pid_academic_degree;
    END$$
    
DELIMITER ;
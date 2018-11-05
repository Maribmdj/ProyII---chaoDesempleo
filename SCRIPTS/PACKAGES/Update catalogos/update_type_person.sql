DELIMITER $$
CREATE PROCEDURE update_type_person(IN pid_type_person INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE type_person
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_type_person=pid_type_person;
    END$$
    
DELIMITER ;
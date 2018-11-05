DELIMITER $$
CREATE PROCEDURE update_job_position(IN pid_job_position INT, IN pName VARCHAR(70), IN pState INT)
	BEGIN
		UPDATE job_position
        set 
        name = ifnull ( pname,name),
        state = ifnull ( pstate,state)
        where id_job_position=pid_jobposition;
    END$$
    
DELIMITER ;
DELIMITER $$
CREATE PROCEDURE update_jobxbenf(IN pid_jobxbenf INT, IN pid_benf INT, IN pid_job INT)
	BEGIN
		UPDATE jobxbenf
        set 
        id_benefif = ifnull ( pid_benefit,id_benefit),
        id_job = ifnull ( pid_job,id_job)
        where id_jobxbenf=pid_jobxbenf;
    END$$
    
DELIMITER ;
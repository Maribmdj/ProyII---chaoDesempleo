DELIMITER $$
CREATE PROCEDURE update_jobxbenf(IN pid_jobxbenf INT, IN pid_benf INT, IN pid_job INT)
	BEGIN
		UPDATE jobxbenf
        set 
        pid_benf	= id_benf, 
        pid_job		= id_job
        where id_jobxbenf=pid_jobxbenf;
    END$$
    
DELIMITER ;
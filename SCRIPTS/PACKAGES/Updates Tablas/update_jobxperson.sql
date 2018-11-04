DELIMITER $$
CREATE PROCEDURE update_jobxperson(IN pid_jobxperson INT, IN pid_person INT, IN pid_job INT,IN pcvpdf VARCHAR(100))
	BEGIN
		UPDATE jobxperson
        set 
        id_person = ifnull ( pid_person,id_person),
        id_job = ifnull (pid_job,id_job),
        cvpdf = isnull(pcvpdf, cvpdf)
        where id_jobxperson=pid_jobxperson;
    END$$
    
DELIMITER ;
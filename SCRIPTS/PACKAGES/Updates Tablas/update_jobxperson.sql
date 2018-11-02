DELIMITER $$
CREATE PROCEDURE update_jobxperson(IN pid_jobxperson INT, IN pid_person VARCHAR(100), IN pid_job INT,IN pcvpdf VARCHAR(100))
	BEGIN
		UPDATE jobxperson
        set 
        pid_person = id_person, 
        pid_job=id_job,
        pcvpdf = cvpdf
        where id_jobxperson=pid_jobxperson;
    END$$
    
DELIMITER ;
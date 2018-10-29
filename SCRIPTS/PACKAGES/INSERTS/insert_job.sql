DELIMITER $$
CREATE PROCEDURE insert_job(IN pbirthdate DATE, IN pdescription VARCHAR(100), IN ppubdate DATE, IN pduedate DATE, IN pvacancies INT, IN pid_state INT, IN pid_career INT, IN pid_adegree INT, IN pid_jobpos INT)
	BEGIN
		INSERT INTO job(BIRTHDATE, description, pubdate, duedate, vacancies, id_state, id_career, id_adegree, id_jobpos) 
        VALUES (pbirthdate, pdescription, ppubdate, pduedate, pvacancies, pid_state, pid_career, pid_adegree, pid_jobpos);
    END$$
    
DELIMITER ;
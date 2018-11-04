DELIMITER $$
CREATE PROCEDURE insert_jobxperson(IN pPDF VARCHAR(200), IN pId_person INT, IN pId_job INT)


	BEGIN
		INSERT INTO jobxperson(PDFCV, ID_PERSON, ID_JOB) 
        VALUES (pPDF, pId_person, pId_job);
    END$$
    
DELIMITER ;
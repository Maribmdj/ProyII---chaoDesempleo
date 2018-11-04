DELIMITER $$
CREATE PROCEDURE update_number(IN ppnumber VARCHAR(100), IN pid_person INT)
	BEGIN
		UPDATE pnumber
        set 
        pnumber = ifnull ( ppnumber,pumber),
        id_person = ifnull ( pid_person,id_person)
        where ppnumber=pnumber;
    END$$
    
DELIMITER ;
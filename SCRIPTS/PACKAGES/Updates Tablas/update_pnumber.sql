DELIMITER $$
CREATE PROCEDURE update_number(IN pidpnumber INT, IN ppnumber VARCHAR(100), IN pid_person INT)
	BEGIN
		UPDATE pnumber
        set ppnumber = pnumber,
        pid_person = id_person
        where pid_pnumber=id_pnumber;
    END$$
    
DELIMITER ;
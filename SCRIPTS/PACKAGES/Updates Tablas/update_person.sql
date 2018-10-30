DELIMITER $$
CREATE PROCEDURE update_person(IN pnumber_identif INT, IN pname VARCHAR(70), IN plastname1 VARCHAR(70), IN plastname2 VARCHAR(70), IN pbirthdate DATE, IN pphoto VARCHAR(100), IN pid_typeperson INT, IN pid_nationality INT, IN pid_industry INT, IN pid_distrito INT)
	BEGIN
		UPDATE person
        set 
        pnumber_identif=number_identif,
        pname =name,
        plastname1 =lastname1,
        plastname2 =lastname2,
        pbirthdate =birthdate,
        pphoto =photo,
        pid_typeperson = id_typeperson, 
        pid_nationality = id_nationality,
        pid_industry = id_industry,
        pid_distrito = id_distrito
        where id_person=pid_person;
    END$$
    
DELIMITER ;
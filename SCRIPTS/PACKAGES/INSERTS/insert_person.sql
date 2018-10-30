DELIMITER $$
CREATE PROCEDURE insert_person(IN pnumber_identif INT, IN pname VARCHAR(70), IN plastname1 VARCHAR(70), IN plastname2 VARCHAR(70), IN pbirthdate DATE, IN pphoto VARCHAR(100), IN pid_typeperson INT, IN pid_nationality INT, IN pid_industry INT, IN pid_distrito INT)
	BEGIN
		INSERT INTO person(NUMBER_IDENTIF, NAME, LASTNAME1, LASTNAME2, BIRTHDATE, PHOTO, ID_TYPEPERSON, ID_NATIONALITY, ID_INDUSTRY, ID_DISTRITO) 
        VALUES (pnumber_identif, pname, plastname1, plastname2, pbirthdate, pphoto, pid_typeperson, pid_nationality, pid_industry, pid_distrito);
    END$$
    
DELIMITER ;
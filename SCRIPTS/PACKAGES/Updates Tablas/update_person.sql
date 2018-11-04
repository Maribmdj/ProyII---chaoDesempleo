DELIMITER $$
CREATE PROCEDURE update_person(IN pnumber_identif INT, IN pname VARCHAR(70), IN plastname1 VARCHAR(70), IN plastname2 VARCHAR(70), IN pbirthdate DATE, IN pphoto VARCHAR(100), IN pid_typeperson INT, IN pid_nationality INT, IN pid_industry INT, IN pid_distrito INT)
	BEGIN
		UPDATE person
        set 
        number_identif = ifnull ( pnumber_identif,number_identif),
        name = ifnull ( pname,name),
        lastname1 = ifnull ( plastname1,lastname1),
        lastname2 = ifnull ( plastname2,lastname2),
        birthdate = ifnull ( pbirthdate,birthdate),
		photo = ifnull ( pphoto,photo),
        type_person = ifnull ( ptype_person,type_person),
        nationality = ifnull(pnationality, nationality),
        industry = ifnull(pindustry, industry),
        distrito = ifnull ( pdistrito,distrito)
        where id_pnumberidentf=pid_pnumberidentif;
    END$$
    
DELIMITER ;
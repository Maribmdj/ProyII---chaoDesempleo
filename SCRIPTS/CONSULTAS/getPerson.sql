Delimiter $$

CREATE PROCEDURE `getPerson`(in pid_person int)
MODIFIES SQL DATA
BEGIN
  SELECT id_person, NUMBER_IDENTIF, name, LASTNAME1, LASTNAME2, birthdate, photo, cvpdf, ID_DISTRITO, ID_INDUSTRY, ID_NATIONALITY, ID_TYPEPERSON FROM person
  where id_person = ifnull (pid_person,id_person);
END$$

delimiter ;
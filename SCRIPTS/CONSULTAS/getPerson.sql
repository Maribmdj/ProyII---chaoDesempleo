Delimiter $$

CREATE PROCEDURE `getPerson`(in pid_person int)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM person
  where id_person = isnull (pid_person,id_person);
END$$

delimiter ;
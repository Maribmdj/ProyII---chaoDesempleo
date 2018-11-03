Delimiter $$

CREATE PROCEDURE `getTypePerson`(in pId_typeperson int)
MODIFIES SQL DATA
BEGIN
  SELECT ID_TYPEPERSON, NAME, STATE FROM typeperson 
  where id_typeperson = ifnull (pid_typeperson,id_typeperson);
END$$

delimiter ;
Delimiter $$

CREATE PROCEDURE `getTypePerson`(in pId_typeperson int)
MODIFIES SQL DATA
BEGIN
  SELECT NAME FROM typeperson 
  where id_typeperson = isnull (pid_typeperson,id_typeperson);
END$$

delimiter ;
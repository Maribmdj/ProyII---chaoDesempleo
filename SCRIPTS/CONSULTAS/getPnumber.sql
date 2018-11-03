Delimiter $$

CREATE PROCEDURE `getPNumber`(in pId_pnumber int)
MODIFIES SQL DATA
BEGIN
  SELECT id_pnumber, pnumber, ID_PERSON FROM pnumber
  where id_pnumber = ifnull (pid_pnumber,id_pnumber);
END$$

delimiter ;pnumber
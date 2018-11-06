Delimiter $$

CREATE PROCEDURE `getPNumber`(in pId_pnumber int)
MODIFIES SQL DATA
BEGIN
  SELECT pnumber FROM pnumber
  where id_pnumber = isnull (pid_pnumber,id_pnumber);
END$$

delimiter ;pnumber
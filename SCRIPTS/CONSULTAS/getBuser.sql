Delimiter $$

CREATE PROCEDURE `getBuser`(in pid_buser int)
MODIFIES SQL DATA
BEGIN
  SELECT id_buser, user FROM buser
  where id_buser = isnull (pid_buser,id_buser);
END$$

delimiter ;
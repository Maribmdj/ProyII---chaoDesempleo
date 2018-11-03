Delimiter $$

CREATE PROCEDURE `getDistrito`(IN PID_DISTRITO INT)
MODIFIES SQL DATA
BEGIN
  SELECT id_distritO, name, state FROM distrito
    where id_DISTRITO = ifnull (pid_DISTRITO,iD_DISTRITO);

END$$

delimiter ;
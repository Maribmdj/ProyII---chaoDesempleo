Delimiter $$

CREATE PROCEDURE `getDistrito`(IN PID_DISTRITO INT)
MODIFIES SQL DATA
BEGIN
	SELECT name FROM distrito
    where id_DISTRITO = isnull (pid_DISTRITO,iD_DISTRITO);

END$$

delimiter ;
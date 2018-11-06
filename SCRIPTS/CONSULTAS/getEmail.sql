Delimiter $$

CREATE PROCEDURE `getEmail`(IN PID_EMAIL INT)
MODIFIES SQL DATA
BEGIN
  SELECT EMAIL FROM email
    where id_EMAIL = isnull (pid_EMAIL,id_EMAIL);

END$$

delimiter ;
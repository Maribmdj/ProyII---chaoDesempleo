Delimiter $$

CREATE PROCEDURE `getEmail`(IN PID_EMAIL INT)
MODIFIES SQL DATA
BEGIN
  SELECT ID_EMAIL, EMAIL, ID_PERSON FROM email
    where id_EMAIL = ifnull (pid_EMAIL,id_EMAIL);

END$$

delimiter ;
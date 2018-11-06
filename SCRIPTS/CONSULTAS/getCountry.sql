Delimiter $$

CREATE PROCEDURE `getCountry`(IN PID_COUNTRY INT)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM country
    where id_COUNTRY = isnull (pid_COUNTRY,id_COUNTRY);

END$$

delimiter ;
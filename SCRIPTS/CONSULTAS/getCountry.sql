Delimiter $$

CREATE PROCEDURE `getCountry`(IN PID_COUNTRY INT)
MODIFIES SQL DATA
BEGIN
  SELECT id_country, name, state FROM country
    where id_COUNTRY = ifnull (pid_COUNTRY,id_COUNTRY);

END$$

delimiter ;
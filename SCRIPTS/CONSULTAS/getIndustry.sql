Delimiter $$

CREATE PROCEDURE `getIndustry`(IN PID_INDUSTRY INT)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM industry
    where id_INDUSTRY = isnull (pid_INDUSTRY,id_INDUSTRY);

END$$

delimiter ;
Delimiter $$

CREATE PROCEDURE `getIndustry`(IN PID_INDUSTRY INT)
MODIFIES SQL DATA
BEGIN
  SELECT id_industry, name, state FROM industry
    where id_INDUSTRY = ifnull (pid_INDUSTRY,id_INDUSTRY);

END$$

delimiter ;
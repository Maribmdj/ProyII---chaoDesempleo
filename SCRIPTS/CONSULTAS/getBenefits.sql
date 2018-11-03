Delimiter $$

CREATE PROCEDURE `getBenefits`(IN PID_BENEFITS INT)
MODIFIES SQL DATA
BEGIN
  SELECT ID_BENEFITS, name, state FROM benefits
	where id_BENEFITS = ifnull (pid_BENEFITS,id_BENEFITS);

END$$

delimiter ;
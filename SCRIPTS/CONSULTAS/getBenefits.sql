Delimiter $$

CREATE PROCEDURE `getBenefits`(IN PID_BENEFITS INT)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM benefits
	where id_BENEFITS = isnull (pid_BENEFITS,id_BENEFITS);

END$$

delimiter ;
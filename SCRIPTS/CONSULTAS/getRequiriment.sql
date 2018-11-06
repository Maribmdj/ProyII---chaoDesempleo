Delimiter $$

CREATE PROCEDURE `getRequiriment`(IN PID_REQUIRIMENT INT)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM requiriment
	where id_REQUIRIMENT = isnull (pid_rEQUIRIMENT,id_rEQUIRIMENT);

END$$

delimiter ;
Delimiter $$

CREATE PROCEDURE `getRequiriment`(IN PID_REQUIRIMENT INT)
MODIFIES SQL DATA
BEGIN
  SELECT ID_REQUIRIMENT, name, state FROM requiriment
	where id_REQUIRIMENT = ifnull (pid_rEQUIRIMENT,id_rEQUIRIMENT);

END$$

delimiter ;
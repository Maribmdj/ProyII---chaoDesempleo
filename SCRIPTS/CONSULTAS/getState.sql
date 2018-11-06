Delimiter $$

CREATE PROCEDURE `getState`(IN PID_STATE INT)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM state
    where id_STATE = isnull (pid_STATE,id_STATE);

END$$

delimiter ;
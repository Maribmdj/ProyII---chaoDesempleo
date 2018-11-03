Delimiter $$

CREATE PROCEDURE `getState`(IN PID_STATE INT)
MODIFIES SQL DATA
BEGIN
  SELECT id_state, name FROM state
    where id_STATE = ifnull (pid_STATE,id_STATE);

END$$

delimiter ;
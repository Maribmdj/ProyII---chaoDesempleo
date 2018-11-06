Delimiter $$

CREATE PROCEDURE `getProvince`(IN PID_PROVINCE int)
MODIFIES SQL DATA
BEGIN
  SELECT name FROM Province
    where id_pROVINCE = isnull (pid_pROVINCE,id_pROVINCE);

END$$

delimiter ;
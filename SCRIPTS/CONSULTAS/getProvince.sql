Delimiter $$

CREATE PROCEDURE `getProvince`(IN PID_PROVINCE int)
MODIFIES SQL DATA
BEGIN
  SELECT id_province, name, state FROM Province
    where id_pROVINCE = ifnull (pid_pROVINCE,id_pROVINCE);

END$$

delimiter ;
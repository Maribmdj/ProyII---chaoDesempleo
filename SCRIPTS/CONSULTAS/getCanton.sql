Delimiter $$

CREATE PROCEDURE `getCanton`(INPID_CANTON INT)
MODIFIES SQL DATA
BEGIN
  SELECT id_canton, NAME, STATE FROM canton
    where id_CANTON = ifnull (pid_CANTON,id_CANTON);

END$$

delimiter ;
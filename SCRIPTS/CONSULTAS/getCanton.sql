Delimiter $$

CREATE PROCEDURE `getCanton`(INPID_CANTON INT)
MODIFIES SQL DATA
BEGIN
  SELECT NAME FROM canton
    where id_CANTON = isnull (pid_CANTON,id_CANTON);

END$$

delimiter ;
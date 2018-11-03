Delimiter $$

CREATE PROCEDURE `getBuser`()
MODIFIES SQL DATA
BEGIN
  SELECT id_user, user FROM buser;
END$$

delimiter ;
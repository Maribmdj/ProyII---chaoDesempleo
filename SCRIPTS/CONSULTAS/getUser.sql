Delimiter $$

CREATE PROCEDURE `getUser`()
MODIFIES SQL DATA
BEGIN
  SELECT id_user, user, ID_PERSON FROM user;
END$$

delimiter ;
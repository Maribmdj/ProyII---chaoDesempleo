Delimiter $$

CREATE PROCEDURE `getUser`(in pid_user int)
MODIFIES SQL DATA
BEGIN
  SELECT user FROM user
  where id_user = isnull (pid_user,id_user);
END$$

delimiter ;
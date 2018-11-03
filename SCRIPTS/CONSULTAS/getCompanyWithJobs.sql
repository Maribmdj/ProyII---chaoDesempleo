Delimiter $$

CREATE PROCEDURE `getCompanyWithJobs`()
MODIFIES SQL DATA
BEGIN
  SELECT industry.name, count()FROM user
  where id_user = ifnull (pid_user,id_user);
END$$

delimiter ;
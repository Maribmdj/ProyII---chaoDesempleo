Delimiter $$

CREATE PROCEDURE `getCareer`()
MODIFIES SQL DATA
BEGIN
  SELECT name FROM career
    where id_CAREER = isnull (pid_CAREER,id_CAREER);
END$$

delimiter ;
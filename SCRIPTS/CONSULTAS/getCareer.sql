Delimiter $$

CREATE PROCEDURE `getCareer`()
MODIFIES SQL DATA
BEGIN
  SELECT id_career, name, state FROM career
    where id_CAREER = ifnull (pid_CAREER,id_CAREER);
END$$

delimiter ;
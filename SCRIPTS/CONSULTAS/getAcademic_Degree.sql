Delimiter $$

CREATE PROCEDURE `getAcademic_Degree`(in pID_ACADEMIC_DEGREE INT)
MODIFIES SQL DATA
BEGIN
  SELECT ID_ACADEMIC_DEGREE, NAME, ACADEMIC_DEGREE, STATE FROM academic_degree
    where id_academic_degree = ifnull (pid_academic_degree,id_academic_degree);
END$$

delimiter ;
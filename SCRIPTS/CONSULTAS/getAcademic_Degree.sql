Delimiter $$

CREATE PROCEDURE `getAcademic_Degree`(in pID_ACADEMIC_DEGREE INT)
MODIFIES SQL DATA
BEGIN
  SELECT NAme FROM academic_degree
    where id_academic_degree = isnull (pid_academic_degree,id_academic_degree);
END$$

delimiter ;
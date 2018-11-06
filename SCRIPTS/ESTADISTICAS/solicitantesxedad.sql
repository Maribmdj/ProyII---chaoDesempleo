Delimiter $$
CREATE PROCEDURE `SolicitantesxEdad`()
MODIFIES SQL DATA
BEGIN
  SELECT
    SUM(IF(age < 18,1,0)) as 'Under 18',
    SUM(IF(age BETWEEN 19 and 30,1,0)) as '19 - 30',
    SUM(IF(age BETWEEN 30 and 45,1,0)) as '30 - 45',
    SUM(IF(age BETWEEN 46 and 55,1,0)) as '46 - 55',
    SUM(IF(age BETWEEN 55 and 65,1,0)) as '55 - 65',
    SUM(IF(age BETWEEN 66 and 75,1,0)) as '66 - 75',
    SUM(IF(age BETWEEN 76 and 85,1,0)) as '75 - 85',
    SUM(IF(age > 85,1,0)) as 'Over 85'
	FROM (select YEAR(CURDATE()) - YEAR(p.birthdate) as 'age' from person p, jobxperson j where p.id_person = j.id_person and p.id_typeperson = 3) as ages;

END$$

delimiter ;
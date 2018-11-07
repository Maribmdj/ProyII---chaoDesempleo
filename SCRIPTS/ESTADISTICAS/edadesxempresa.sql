drop procedure if exists `edadesxempresa`;

Delimiter $$

CREATE PROCEDURE `edadesxempresa`(IN pid_empresa INT)
MODIFIES SQL DATA
BEGIN
	SELECT SUM(IF(p.age < 18,1,0)) as 'Under 18', SUM(IF(p.age BETWEEN 19 and 30,1,0)) as '19 - 30', SUM(IF(p.age BETWEEN 30 and 45,1,0)) as '30 - 45', SUM(IF(p.age BETWEEN 46 and 55,1,0)) as '46 - 55', SUM(IF(p.age BETWEEN 55 and 65,1,0)) as '55 - 65', SUM(IF(p.age BETWEEN 66 and 75,1,0)) as '66 - 75', SUM(IF(p.age BETWEEN 76 and 85,1,0)) as '75 - 85', SUM(IF(p.age > 85,1,0)) as 'Over 85'
	FROM
	(SELECT p.age
	FROM (SELECT p.id_person, (year(sysdate()) - year(p.birthdate)) as 'age', j.id_job FROM (SELECT p.id_person, p.name, p.lastname1, p.birthdate, p.id_typeperson, j.name as 'academic_degree' from person p, academic_degree j where p.id_academic_degree = j.id_academic_degree) p, jobxperson j  WHERE p.id_typeperson = 3 AND j.id_person = p.id_person) p, 
		(SELECT p.id_jobxperson, p.id_job, p.id_person FROM jobxperson p, job j WHERE p.id_job = j.id_job AND p.id_person = pid_empresa) j 
	WHERE p.id_job = j.id_job) p;
END$$

delimiter ;
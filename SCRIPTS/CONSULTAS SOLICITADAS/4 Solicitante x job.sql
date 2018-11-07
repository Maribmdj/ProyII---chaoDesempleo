drop procedure if exists `solicitantexempresa`;

Delimiter $$

CREATE PROCEDURE `solicitantexempresa`(IN pid_empresa INT)
MODIFIES SQL DATA
BEGIN
	SELECT 
		j.id_job as 'Puesto', 
        j.description as 'Descripción',
		CONCAT(p.name,' ',p.lastname1) AS 'Solicitante', 
        p.Edad,
		p.curriculum,
		p.fecha,
        p.academic_degree
	FROM 
		(SELECT p.id_person, p.name, p.lastname1, (year(sysdate()) - year(p.birthdate)) as 'Edad', j.id_job, j.PDFCV as 'curriculum',j.date_creation as 'fecha', p.academic_degree
		FROM (SELECT p.id_person, p.name, p.lastname1, p.birthdate, p.id_typeperson, j.name as 'academic_degree' from person p, academic_degree j where p.id_academic_degree = j.id_academic_degree) p, jobxperson j 
		WHERE p.id_typeperson = 3 AND j.id_person = p.id_person) p,
		
		(SELECT p.id_jobxperson, p.id_job, p.id_person, j.DESCRIPTION
		FROM jobxperson p, job j
		WHERE p.id_job = j.id_job AND p.id_person = pid_empresa) j 
	WHERE p.id_job = j.id_job;
END$$

delimiter ;
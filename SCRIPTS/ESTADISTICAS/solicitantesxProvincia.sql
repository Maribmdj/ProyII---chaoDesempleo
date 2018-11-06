Delimiter $$

CREATE PROCEDURE `SolicitantesxProvincia`()
MODIFIES SQL DATA
BEGIN
  SELECT
	dp.provincia,
    count(dp.id_person) as 'Total'
	FROM 
		(select p.id_person, d.name as 'Provincia' from 
			(select c.name, d.id_distrito from 
				(select f.name, g.id_canton from 
					province f, 
					canton g 
                where f.id_province = g.id_province) c,
				distrito d 
			where c.id_canton = d.ID_CANTON) d,
            person p
		where p.id_distrito = d.id_distrito and p.id_typeperson = 3) dp, 
		jobxperson 
    WHERE dp.id_person = jobxperson.ID_PERSON group by provincia;

END$$

delimiter ;
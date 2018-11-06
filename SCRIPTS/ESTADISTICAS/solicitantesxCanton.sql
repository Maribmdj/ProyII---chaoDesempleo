Delimiter $$

CREATE PROCEDURE `SolicitantesxCanton`()
MODIFIES SQL DATA
BEGIN
  SELECT
	dp.canton,
    count(dp.id_person) as 'Total'
	FROM (select p.id_person, d.name as 'Canton' from person p, (select c.name, d.id_distrito from canton c, distrito d where c.id_canton = d.ID_CANTON) d where p.id_distrito = d.id_distrito and p.id_typeperson = 3) as dp, jobxperson
    WHERE dp.id_person = jobxperson.ID_PERSON group by canton;

END$$

delimiter ;
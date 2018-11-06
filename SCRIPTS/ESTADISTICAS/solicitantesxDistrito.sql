Delimiter $$

CREATE PROCEDURE `SolicitantesxDistrito`()
MODIFIES SQL DATA
BEGIN
  SELECT
	dp.distrito,
    count(dp.id_person) as 'Total'
	FROM (select p.id_person, d.name as 'distrito' from person p, distrito d where p.id_distrito = d.id_distrito and p.id_typeperson = 3) as dp, jobxperson
    WHERE dp.id_person = jobxperson.ID_PERSON group by distrito;

END$$

delimiter ;
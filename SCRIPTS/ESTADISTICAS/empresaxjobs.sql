Delimiter $$
CREATE PROCEDURE `empresaxjobs`(IN i INT)
MODIFIES SQL DATA
BEGIN
  Select p.id_person as 'ID', p.name as 'NOMBRE',  @curRow := @CurRow + 1 as 'PUESTO' from
	(SELECT e.ID_PERSON, e.name, count(j.id_person) as 'num_jobs' FROM(select id_person, concat(name, ' ', lastname1, ' ', lastname2) as name from person where id_typeperson = 2) e, jobxperson j WHERE e.id_person = j.id_person  group by j.id_person order by num_jobs desc) p,
    (SELECT @CurRow := 0) var
    where @CurRow <= i - 1;
END$$

delimiter ;
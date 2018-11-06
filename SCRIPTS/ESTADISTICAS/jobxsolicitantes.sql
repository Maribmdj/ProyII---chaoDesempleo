    
Delimiter $$
CREATE PROCEDURE `jobxsolicitantes`(IN i INT)
MODIFIES SQL DATA
BEGIN
  Select p.id_job as 'ID', p.DESCRIPTION as 'DESCRIPCION',  @curRow := @CurRow + 1 as 'PUESTO' from
	(SELECT e.id_job, e.DESCRIPTION, count(j.id_job) as 'num_soli' FROM job e, (select jobxperson.ID_JOB from person, jobxperson where jobxperson.ID_PERSON = person.ID_PERSON and person.ID_TYPEPERSON = 3) j WHERE e.id_job = j.id_job  group by j.id_job order by num_soli desc) p,
    (SELECT @CurRow := 0) var
    where @CurRow <= i-1;
END$$

delimiter ;
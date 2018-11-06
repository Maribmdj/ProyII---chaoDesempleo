Delimiter $$

CREATE PROCEDURE `getCOMPANYwithjobs`()
MODIFIES SQL DATA
BEGIN
  SELECT person.name as PERSON, count(jobxperson) AS Jobxperson
  FROM person p inner join jobxperson jxp
  on p.ID_TYPEPERSON=3 and jxp.id_person = p.id_person;
END$$

delimiter ;
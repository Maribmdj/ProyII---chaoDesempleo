Delimiter $$

CREATE PROCEDURE `getPersonCB`()
MODIFIES SQL DATA
BEGIN

  SELECT CONCAT(P.name,' ',P.lastname1,' ',P.lastname2)
  FROM person p inner join typeperson tp
  where p.id_typeperson=tp.id_typeperson and tp.name='EMPRESA';    
    
END$$

delimiter ;
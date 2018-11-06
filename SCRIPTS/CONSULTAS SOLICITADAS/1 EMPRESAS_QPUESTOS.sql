Delimiter $$
#ADMIN CONSULTA 1: EMPRESAS ASOCIADAS Y CANTIDAD DE PUESTOS
CREATE PROCEDURE `EMPRESA_QPUESTOS`()
MODIFIES SQL DATA
BEGIN
	Select CONCAT(p.name,' ',p.lastname1,' ',p.lastname2) AS NOMBRE_COMPLETO, COUNT(1) AS TOTAL
	from person p inner join typeperson tp
	on p.ID_TYPEPERSON = tp.id_typeperson and tp.name='EMPRESA'
		inner join jobxperson JP ON JP.ID_PERSON=P.ID_PERSON 
	group by NOMBRE_COMPLETO
	order by NOMBRE_COMPLETO;

END$$

delimiter ;
Delimiter $$

CREATE PROCEDURE `getPNumber`()
MODIFIES SQL DATA
BEGIN
  SELECT id_pnumber, pnumber, ID_PERSON FROM pnumber;
END$$

delimiter ;pnumber
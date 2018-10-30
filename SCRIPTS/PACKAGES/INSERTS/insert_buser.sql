DELIMITER $$
CREATE PROCEDURE insert_buser(IN pDate DATE, IN ppwprevious VARCHAR(100), IN ppwcurrent VARCHAR(100), IN pId_user INT)
	BEGIN
		INSERT INTO buser(date, pwprevious, pwcurrent, id_user) VALUES (pDate, ppwprevious, ppwcurrent, pId_user);
    END$$
    
DELIMITER ;
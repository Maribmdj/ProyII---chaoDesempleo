DELIMITER $$
CREATE PROCEDURE update_buser(IN pid_buser INT, IN PDATE DATE, IN pPWPREVIOUS VARCHAR(100), IN pPWCURRENT VARCHAR(100), IN pid_USER INT)
	BEGIN
		UPDATE buser
        SET
		  DATE = isnull(pDATE, date),
		  PWPREVIOUS = isnull(pPWPREVIOUS, pwprevious),
		  PWCURRENT = isnull(pPWCURRENT, pwcurrent),
		  ID_USER = isnull(pid_USER, id_user)
        WHERE ID_BUSER = pid_buser;
    END$$
    
DELIMITER ;
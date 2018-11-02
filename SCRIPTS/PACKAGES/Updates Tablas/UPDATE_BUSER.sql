DELIMITER $$
CREATE PROCEDURE update_buser(IN pid_buser INT, IN PDATE DATE, IN pPWPREVIOUS VARCHAR(100), IN PPWCURRENT VARCHAR(100), IN pid_USER INT)
	BEGIN
		UPDATE buser
		  PDATE = DATE,
		  PWPREVIOUS = PPWPREVIOUS, 
		  PWCURRENT = PPWCURRENT,  
		  ID_USER = PID_USER
    END$$
    
DELIMITER ;
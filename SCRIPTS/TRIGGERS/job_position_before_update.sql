DELIMITER $$
CREATE TRIGGER job_position_before_update BEFORE update ON job_position
FOR EACH ROW BEGIN
    SET new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;
        

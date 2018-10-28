DELIMITER $$
CREATE TRIGGER person_before_update BEFORE update ON person
FOR EACH ROW BEGIN
    SET new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;
        

DELIMITER $$
CREATE TRIGGER benefits_before_update BEFORE update ON benefits
FOR EACH ROW BEGIN
    SET new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;
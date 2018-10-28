DELIMITER $$
CREATE TRIGGER canton_before_update BEFORE update ON canton
FOR EACH ROW BEGIN
    SET new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;
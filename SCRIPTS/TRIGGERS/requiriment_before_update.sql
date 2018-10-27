DELIMITER $$
CREATE TRIGGER requiriment_before_update BEFORE update ON requiriment
FOR EACH ROW BEGIN
    SET new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;
        
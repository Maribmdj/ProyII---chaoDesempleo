DELIMITER $$
CREATE TRIGGER academic_degree_before_update BEFORE update ON academic_degree
FOR EACH ROW BEGIN
    SET new.DATE_LAST_MODIFICATION = NOW(),
        new.USER_LAST_MODIFICATION = system_user();
	END; $$
    
DELIMITER ;
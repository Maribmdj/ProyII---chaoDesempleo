DELIMITER $$

DROP FUNCTION IF EXISTS changePassword$$

create function changePassword(puser varchar(70), ppasswordC varchar(100), ppasswordP varchar(100))
RETURNS INT
READS SQL DATA
DETERMINISTIC
BEGIN
	DECLARE i INT;
    #DECLARE pidUser INT = (select id_user from user where user=puser);
    
    #ACTUALIZAR TABLA USER
    call update_user(puser, ppasswordP);
    #INSERTAR TABLA BUSER
	call insert_buser(NOW(), ppasswordC, ppasswordP, (select id_user from user where user=puser));
	
    if ((select i)!= 0)
	then
		return (select i);
	else
		return -1; 
	end if;
end $$
DELIMITER ;
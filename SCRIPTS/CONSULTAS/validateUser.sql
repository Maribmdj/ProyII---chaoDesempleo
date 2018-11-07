DELIMITER $$

DROP FUNCTION IF EXISTS validateUser$$

create function validateUser(username varchar(70), ppassword varchar(100))
RETURNS INT
READS SQL DATA
DETERMINISTIC
BEGIN
	DECLARE i INT default 0;
    select id_user from user where user = username and password = ppassword INTO i;
	if ((select i)!= 0)
	then
		return (select i);
	else
		return -1; 
	end if;
end $$
DELIMITER ;
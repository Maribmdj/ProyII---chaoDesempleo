DELIMITER $$

DROP FUNCTION IF EXISTS validateUser$$

create function validateUser(username varchar(70), ppassword varchar(100))
RETURNS INT
READS SQL DATA
DETERMINISTIC
BEGIN
	DECLARE i INT;
<<<<<<< HEAD
    select p.id_typeperson from user
    u inner join person p
    on u.id_person=p.id_person and u.user=username 
    and u.password=ppassword into i;
	if ((select i)!= 0)
=======
    
	select p.id_typeperson 
	from user u inner join person p
	on u.id_person=p.id_person and u.user = username and u.password = ppassword INTO i;
	
    if ((select i)!= 0)
>>>>>>> 86a8aea19f0848091ee8f36f38c1da1f4d61cf96
	then
		return (select i);
	else
		return -1; 
	end if;
end $$
DELIMITER ;
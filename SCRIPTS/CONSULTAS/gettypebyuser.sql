delimiter $$

CREATE PROCEDURE `gettypebyuser`(IN pid_user INT)
BEGIN  
  select id_typeperson from person, user where user.id_person = person.id_person and user.id_user = pid_user;
END$$

delimiter ;
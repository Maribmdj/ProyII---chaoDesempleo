Delimiter $$
CREATE PROCEDURE `deletejobsevent`()
MODIFIES SQL DATA
BEGIN
    declare x VARCHAR(40) default 'Job ran. 0 jobs eliminated';
    select concat('Job ran. ',count(id_job),' jobs eliminated') into x FROM chaodesempleo.job where date(duedate) <= date(sysdate());
	delete from jobxbenf where id_job in (SELECT id_job FROM chaodesempleo.job where date(duedate) <= date(sysdate()));
	delete from jobxperson where id_job in (SELECT id_job FROM chaodesempleo.job where date(duedate) <= date(sysdate()));
	delete from jobxreq where id_job in (SELECT id_job FROM chaodesempleo.job where date(duedate) <= date(sysdate()));
	delete from chaodesempleo.job where date(duedate) <= date(sysdate());
    SIGNAL SQLSTATE '01000' SET MESSAGE_TEXT = x;
END$$

delimiter ;

CREATE EVENT delete_overdue_jobs ON SCHEDULE EVERY 1 MINUTE DO call deletejobsevent();
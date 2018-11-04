 DELIMITER $$
CREATE PROCEDURE update_JOB(IN pID_JOB INT, IN pBIRTHDATE date, IN pDESCRIPTION VARCHAR(70), IN pPUBDATE DATE, IN pDUEDATE DATE, IN pVANCACIE int, IN pid_STATE INT, IN pid_CAREER INT, IN pid_ADEGREE INT, IN pid_JOBPOS INT)
	BEGIN
		UPDATE job 
        SET
		
		  BIRTHDATE 	= isnull(PBIRTHDATE, birthdate),
		  DESCRIPTION 	= isnull(PDESCRIPTION, description),
		  PUBDATE 		= isnull(PPUBDATE, pubdate),
		  DUEDATE		= isnull(PDUEDATES, duedate),
		  VACANCIES 	= isnull(PVACANTES, vacantes),
		  pid_state 	= isnull(pID_STATE, id_state),
		  ID_CAREER 	= isnull(pId_CAREER, id_career),
		  ID_ADEGREE 	= isnull(PID_ADEGREE, id_degree),
		  ID_JOBPOS 	= isnull(PID_JOBPOS, id_jobpos)
		  Where pid_job = id_job;
	END$$
    
DELIMITER ;
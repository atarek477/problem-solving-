SELECT t1.teacher_id, COUNT(DISTINCT t1.subject_id) AS cnt
FROM teacher  AS t1
GROUP BY t1.teacher_id
SELECT s.student_id,s.student_name,sub.subject_name,
 count(e.student_id) AS attended_exams
 FROM  students    AS s
 JOIN  subjects    AS sub
 LEFT JOIN examinations AS e
 ON e.student_id =s.student_id
 AND e.subject_name=sub.subject_name
 GROUP BY  sub.subject_name,s.student_id
 ORDER BY s.student_id, sub.subject_name
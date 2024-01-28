SELECT contest_id  ,
ROUND(COUNT(contest_id)/u.counter,4)*100 AS percentage

FROM register AS r
JOIN
(
SELECT COUNT(*) AS counter  FROM users

) AS u

 GROUP BY contest_id
 ORDER BY percentage DESC ,contest_id ASC

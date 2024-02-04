SELECT u.name AS results FROM users AS u JOIN movierating  AS mr
ON mr.user_id= u.user_id
GROUP BY u.user_id ORDER BY u.name ASC   LIMIT 1
UNION

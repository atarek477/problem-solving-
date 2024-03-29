SELECT u.name ,
 (CASE WHEN SUM(r1.distance) IS NULL THEN 0 ELSE SUM(r1.distance) END) AS travelled_distance
FROM users AS u
LEFT JOIN rides
AS r1
ON r1.user_id=u.id
GROUP BY r1.user_id
ORDER BY travelled_distance  DESC , u.name ASC
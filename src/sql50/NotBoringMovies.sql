SELECT *
FROM cinema
WHERE id%2=1
AND description!='boring'
ORDER BY id DESC
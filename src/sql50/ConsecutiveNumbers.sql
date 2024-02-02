SELECT  l4.num AS  ConsecutiveNums
FROM logs AS l4
JOIN
(SELECT l1.id,l1.num
FROM logs AS  l1
JOIN
(
    SELECT id AS id2 ,num AS n
    FROM logs
    ORDER BY num
)
AS l2
ON l2.id2= l1.id+1 AND l2.n = l1.num
)AS l3
ON l3.id= l4.id+1 AND l3.num = l4.num
GROUP BY l4.num ;

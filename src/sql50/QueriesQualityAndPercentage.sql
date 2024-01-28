SELECT query_name,
ROUND(SUM(rating/position)/COUNT(query_name),2) AS quality ,
CASE WHEN ROUND(r1/COUNT(query_name),4)*100 IS NULL THEN 0
ELSE ROUND(r1/COUNT(query_name),4)*100
END AS poor_query_percentage
 FROM queries  AS q1
LEFT JOIN
(
SELECT query_name AS qn,
COUNT(rating) AS r1
FROM   queries
WHERE  rating <3
GROUP BY  query_name
) AS q2
ON q1.query_name=q2.qn
WHERE query_name IS NOT NULL
GROUP BY  query_name
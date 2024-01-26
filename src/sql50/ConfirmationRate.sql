SELECT c3.id1 AS user_id,
CASE
    WHEN (c3.test2 =0) THEN 0
    ELSE ROUND((c3.test2 / (c3.test2 +c3.test1)),2 )
  END AS confirmation_rate

 FROM confirmations AS c1 right  JOIN
 (SELECT s1.user_id AS id1 ,
 SUM(CASE WHEN c2.action = 'timeout' THEN 1 ELSE 0 END) AS test1,
  SUM(CASE WHEN c2.action = 'confirmed' THEN 1 ELSE 0 END) AS test2

FROM
  signups AS s1
  LEFT JOIN confirmations AS c2 ON s1.user_id = c2.user_id
WHERE
  c2.action IN ('timeout', 'confirmed') OR c2.action IS NULL
GROUP BY
  s1.user_id ) AS c3
ON c3.id1= c1.user_id
GROUP BY c3.id1
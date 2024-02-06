WITH CombinedCounts AS (
    SELECT requester_id AS id, COUNT(accepter_id) AS num
    FROM RequestAccepted
    GROUP BY requester_id
    UNION ALL
    SELECT accepter_id AS id, COUNT(requester_id) AS num
    FROM RequestAccepted
    GROUP BY accepter_id
)
SELECT id,  num
FROM (
    SELECT id, SUM(num) AS num
    FROM CombinedCounts
    GROUP BY id
) AS subquery
GROUP BY id
ORDER BY num DESC
LIMIT 1
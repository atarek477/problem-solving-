
SELECT CASE WHEN ROUND(COUNT(DISTINCT a1.player_id) / a3.cnt, 2) IS NULL THEN 0
ELSE   ROUND(COUNT(DISTINCT a1.player_id) / a3.cnt, 2)
END AS fraction
FROM activity AS a1
JOIN (
    SELECT MIN(TO_DAYS(event_date))AS d1, player_id AS pi
    FROM activity
    GROUP BY pi
) AS a2 ON a2.d1+1 = TO_DAYS(a1.event_date) AND a2.pi = a1.player_id
JOIN (
    SELECT COUNT(DISTINCT player_id) AS cnt
    FROM activity
) AS a3
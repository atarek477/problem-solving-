
-- first solution  bad solution
SELECT a1.player_id , a1.event_date as first_login
FROM activity as a1
WHERE to_days(a1.event_date)=
(SELECT min(to_days(a2.event_date))
 FROM activity as a2
 WHERE a1.player_id=a2.player_id)


-- second solution masterpiece
 SELECT a1.player_id ,min( a1.event_date)  as first_login
 FROM activity as a1
 GROUP BY a1.player_id
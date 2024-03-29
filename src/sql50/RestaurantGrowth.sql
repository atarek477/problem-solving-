SELECT visited_on,SUM(amount) as amount, ROUND((SUM(amount)/7), 2) as average_amount
FROM
(SELECT distinct visited_on,
sum(amount) over(order by visited_on rows between 6 preceding and current row) as amount
FROM
(SELECT visited_on, SUM(amount) as amount FROM Customer GROUP BY 1) temp2
)TEMP
GROUP BY visited_on
LIMIT 100 OFFSET 6
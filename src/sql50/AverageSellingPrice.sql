SELECT p.product_id ,
 CASE WHEN
ROUND(SUM(p.price*u.units )/SUM(u.units),2)  IS NULL
THEN 0
ELSE ROUND(SUM(p.price*u.units )/SUM(u.units),2)
END  AS average_price
FROM prices AS p LEFT JOIN unitssold AS u
ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY  p.product_id
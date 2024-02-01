SELECT ROUND(count(*)/cnt*100 ,2) AS immediate_percentage FROM delivery AS d1
JOIN
(
SELECT customer_id ,MIN(order_date) as a1 ,customer_pref_delivery_date
FROM delivery
GROUP BY customer_id
) AS d2
ON d1.customer_id= d2.customer_id AND d1.customer_pref_delivery_date= d2.a1
JOIN
(
    SELECT COUNT(DISTINCT customer_id ) AS cnt FROM delivery
) AS d3
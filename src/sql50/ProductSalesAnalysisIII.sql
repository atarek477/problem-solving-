SELECT s.product_id ,s.`year` AS first_year ,s.quantity,price   FROM sales AS s
JOIN
(
SELECT  product_id AS p1 , MIN(year) AS y1
FROM sales GROUP BY p1
) AS s2
ON  s.product_id= s2.p1 AND s2.y1= s.year
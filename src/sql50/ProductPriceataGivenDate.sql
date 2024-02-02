SELECT p2.product_id,p2.new_price AS price
 FROM products AS p2
 JOIN
(
 SELECT  product_id,MAX(change_date) AS d1
 FROM products
 WHERE  TO_DAYS(change_date)<=TO_DAYS('2019-08-16')
GROUP BY product_id
) AS temp
ON temp.product_id =p2.product_id AND temp.d1=p2.change_date
UNION
SELECT product_id,10 AS price
FROM products
WHERE product_id NOT IN ( SELECT  product_id
 FROM products
 WHERE  TO_DAYS(change_date)<=TO_DAYS('2019-08-16')
GROUP BY product_id)
GROUP BY product_id
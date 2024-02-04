SELECT p.product_name,SUM(o.unit) AS unit FROM products AS p  JOIN orders AS o
ON p.product_id =o.product_id
  WHERE order_date BETWEEN '2020-02-01' AND '2020-02-29'
  GROUP BY o.product_id
  HAVING SUM(o.unit)>=100
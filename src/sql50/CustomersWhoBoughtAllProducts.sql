SELECT id AS customer_id  FROM (SELECT c.customer_id AS id  ,COUNT(DISTINCT c.product_key) AS cnt FROM customer AS c
GROUP BY  c.customer_id ) AS c1
WHERE c1.cnt IN (SELECT COUNT(*) FROM product)


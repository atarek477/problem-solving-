SELECT DISTINCT p.product_id ,  p.product_name
FROM    product  AS p
JOIN    sales    AS s
ON    p.product_id =s.product_id
WHERE   p.product_id
NOT IN
(
    SELECT product_id
    FROM sales AS s
    WHERE  sale_date
    NOT BETWEEN '2019-01-01' AND '2019-03-31'
)

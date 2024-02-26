SELECT s.name
 FROM salesperson AS s
 WHERE s.sales_id
 NOT IN
 (
 SELECT sales_id AS s1
 FROM company as c
 JOIN orders as o
 ON c.com_id= o.com_id
 WHERE  c.name="RED"
 )

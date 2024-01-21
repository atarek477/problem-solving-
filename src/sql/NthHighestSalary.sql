SELECT DISTINCT(p.salary)
FROM
(
SELECT (dense_rank() OVER (ORDER BY salary DESC)) AS row_num,salary
FROM employee
)AS p
WHERE p.row_num =N
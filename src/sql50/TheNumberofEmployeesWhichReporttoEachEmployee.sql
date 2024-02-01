
SELECT e1.employee_id, e1.name,e2.reports_count, ROUND(sum1/e2.reports_count) AS average_age
FROM employees    AS e1
JOIN
(
SELECT reports_to AS id,  COUNT(reports_to) AS reports_count , SUM(age) AS  sum1
FROM employees
WHERE reports_to IS NOT NULL
GROUP BY reports_to
) AS e2
ON e2.id = e1.employee_id
ORDER BY employee_id ASC
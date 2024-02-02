SELECT employee_id
FROM employees AS e
WHERE manager_id NOT IN (SELECT employee_id FROM employees ) AND salary<30000
ORDER BY employee_id;

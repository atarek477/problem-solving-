--not the best
SELECT e1.name as employee
FROM employee as e1
WHERE e1.salary>(SELECT e2.salary
                 FROM employee as e2
                 WHERE( e2.id=e1.managerId))



SELECT e1.name
FROM employee AS e1
JOIN (
SELECT e2.managerId
FROM employee as e2
GROUP BY e2.managerId
HAVING count(e2.managerId)>4
)
 AS e3
 ON e1.id =e3.managerId;
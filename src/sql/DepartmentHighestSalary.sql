SELECT d.name AS Department ,e.name AS Employee  ,e.salary AS Salary  FROM
employee AS e
JOIN
(
SELECT  MAX(salary) AS s , departmentId AS d
FROM employee
GROUP BY  departmentId
) AS  t
ON  e.salary = t.s  AND e.departmentId= t.d
JOIN department AS d
ON e.departmentId= d.id



linq

var query = from e in db.employee
            join t in (
                from emp in db.employee
                group emp by emp.departmentId into g
                select new
                {
                    s = g.Max(emp => emp.salary),
                    d = g.Key
                }
            ) on new { e.salary, e.departmentId } equals new { t.s, t.d }
            join d in db.department on e.departmentId equals d.id
            select new
            {
                Department = d.name,
                Employee = e.name,
                Salary = e.salary
            };
SELECT e.name,b.bonus  FROM employee  AS e  LEFT JOIN bonus AS b ON e.empId= b.empId WHERE
b.bonus<1000 or
b.bonus is null
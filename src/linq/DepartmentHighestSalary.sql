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
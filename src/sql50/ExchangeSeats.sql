SELECT  s1.id AS id,
CASE
WHEN s2.student IS NULL
THEN s1.student
ELSE s2.student
END AS student
FROM seat s1
LEFT  JOIN
seat s2 ON  s1.id+1=s2.id
WHERE s1.id%2=1
UNION
SELECT s1.id AS id,s2.student AS student
FROM seat s1
JOIN seat s2 ON  s1.id=s2.id+1
WHERE s1.id%2=0
ORDER BY id

 SELECT  u.name         , t1.am AS balance
 FROM users AS u
 JOIN
  (SELECT account AS acc ,SUM(amount) AS am FROM Transactions GROUP BY  account) AS t1
ON t1.acc= u.account
WHERE t1.am>10000
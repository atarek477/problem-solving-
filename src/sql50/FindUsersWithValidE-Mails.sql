SELECT *
FROM users
WHERE REGEXP_LIKE(mail, '^[A-Za-z][A-Za-z0-9._-]*@leetcode+\.+com$') AND mail NOT LIKE '%?%';
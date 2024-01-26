SELECT v1.author_id AS id FROM views AS v1 WHERE v1.author_id = v1.viewer_id
GROUP BY   v1.author_id ORDER BY v1.author_id ASC
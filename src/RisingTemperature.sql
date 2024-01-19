SELECT w2.id
FROM weather as w1
join weather as w2 on to_days(w2.recordDate)=to_days(w1.recordDate)+1
where w2.temperature> w1.temperature

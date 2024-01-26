select
a1.machine_id ,
ROUND( (sum(a2.timestamp-a1.timestamp)/count(a1.machine_id)),3) as processing_time
from activity as a1
join activity as a2
on a1.machine_id = a2.machine_id
where a1.process_id=a2.process_id
and a1.activity_type!=a2.activity_type
and a1.activity_type='start'
group by a1.machine_id

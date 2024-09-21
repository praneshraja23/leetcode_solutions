# Write your MySQL query statement below
select distinct a.player_id,a.event_date as first_login 
from Activity a
where a.event_date=(select min(b.event_date)
from Activity b 
where b.player_id=a.player_id)
group by a.player_id;
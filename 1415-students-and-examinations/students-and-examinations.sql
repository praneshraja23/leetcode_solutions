# Write your MySQL query statement below
select a.student_id,a.student_name,
       s.subject_name,count(e.subject_name) as attended_exams
from Students a 
cross join Subjects s
left join Examinations e
on a.student_id=e.student_id and s.subject_name=e.subject_name
group by  a.student_id,a.student_name,s.subject_name
order by a.student_id;
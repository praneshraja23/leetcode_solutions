# Write your MySQL query statement below
select a.name 
from SalesPerson a
where a.sales_id not in
(select b.sales_id from Orders b
join Company c 
on b.com_id=c.com_id 
where c.name="RED");
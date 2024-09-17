# Write your MySQL query statement below
select product_name,year,price 
from Sales as a left Join Product as b 
on a.product_id=b.product_id;
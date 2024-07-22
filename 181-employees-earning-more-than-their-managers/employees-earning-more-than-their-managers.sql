# Write your MySQL query statement below
select a.name as Employee from Employee a where a.salary > 
(select salary from Employee where id=a.managerId);
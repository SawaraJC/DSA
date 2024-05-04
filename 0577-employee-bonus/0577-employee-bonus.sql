# Write your MySQL query statement below
select Employee.name, Bonus.bonus from Employee left join Bonus on Employee.empId = Bonus.empId where Bonus < 1000 or Bonus is null
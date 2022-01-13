## 具体题目分析
SQL1 查找最晚入职员工的所有信息 （limit）
select * from employees order by hire_date desc limit 1;

SQL2 查找入职员工时间排名倒数第三的员工所有信息（limit offest）
select * from employees order by hire_date desc limit 2, 1;
(第一个变量是偏移量，第二个变量是所取得最大行数)

SQL3 查找当前薪水详情以及部门编号dept_no（inner join）
select s.*, d.dept_no 
from salaries as s inner join dept_manager as d on s.emp_no = d.emp_no
where s.to_date = '9999-01-01' and d.to_date = '9999-01-01'
order by emp_no;
ps: 这题left join也可以。

SQL4 查找所有已经分配部门的员工的last_name和first_name（inner join）
select e.last_name, e.first_name, d.dept_no
from employees as e inner join dept_emp as d on e.emp_no = d.emp_no;

SQL5 查找所有员工的last_name和first_name （left join）
select e.last_name, e.first_name, d.dept_no
from employees as e left join dept_emp as d on e.emp_no = d.emp_no;
(left join 只要满足where范围内记录的都会保留)

SQL7 查找薪水记录超过15次的员工号emp_no以及其对应的次数（count）
select emp_no, count(emp_no) as t
from salaries group by emp_no
having t > 15;

SQL8 找出所有员工当前薪水salary情况 (distinct)
select distinct salary
from salaries
order by salary desc;

SQL10 获取所有非manager的员工emp_no （left join）
select employees.emp_no
from employees left join dept_manager
on employees.emp_no = dept_manager.emp_no
where dept_manager.dept_no is NULL;
create database bootcamp_2504p;

use bootcamp_2504p;

create table staffs (
	id int,
    first_name varchar(100),
    last_name varchar(100),
    salary numeric(10,2)
);

select * from staffs;

-- DML - insert
insert into staffs (id, first_name, last_Name, salary) values (1, 'John', 'Lau', 20000);
insert into staffs (id, first_name, last_Name, salary) values (2, 'Sally', 'Lau', 18000);

-- Another way to insert data
insert into staffs values (3, 'Oscar', 'Wong', 24000);

-- DML - update
update staffs set salary = salary * 1.1 where first_name = 'John';
select * from staffs;

-- update more than one field
update staffs set salary = salary * 1.05, last_name = 'Chan' where id = 3;
select * from staffs;

insert into staffs values (4, 'Alex', 'Chan', 15000);

-- DML - delete
delete from staffs where first_name = 'Sally';
select * from staffs;

-- select 
-- 1. where AND OR
select * from staffs where last_name = 'Chan' and salary > 23000;
select * from staffs where last_name = 'Chan' or salary > 16000;
select * from staffs where last_name = 'Lau' or salary > 16000 and last_name = 'Chan'; -- AND first, and then OR
select * from staffs where (last_name = 'Lau' or salary > 16000) and last_name = 'Chan'; -- support ()

-- >, <, >=, <=, =, <>
select * from staffs where last_name <> 'Lau';

-- * (all columns)
-- id, salary (specific column)
select id, salary from staffs;

-- alias 
select t.id, t.salary from staffs t where t.salary > 20000;

-- order by
select t.*
from staffs t
where t.salary > 18000
order by t.first_name; -- by default ascending order

select t.*
from staffs t
where t.salary > 18000
order by t.first_name desc; -- descending order

-- group by

create table books (
	title varchar(50),
    genre varchar(50),
    price numeric(7,2)
);
insert into books values ('book 1', 'adventure', 11.9);
insert into books values ('book 2', 'fantasy', 8.49);
insert into books values ('book 3', 'romance', 9.99);
insert into books values ('book 4', 'adventure', 9.99);
insert into books values ('book 5', 'fantasy', 7.99);
insert into books values ('book 6', 'romance', 5.88);

select b.genre
, avg(b.price) as avg_price
, max(b.price) as max_price
, min(b.price) as min_price
, count(*) as no_of_books
, sum(b.price) as total_price
, min(length(b.title)) as min_length_title
-- , price 
-- , title
from books b
group by b.genre;

-- Having -- filter group
select b.genre, sum(b.price) as total_price -- step 4
from books b
where b.price < 9 -- step 1
group by b.genre -- step 2
having sum(b.price) > 10; -- step 3

-- case insensitive
select * from staffs where last_name = 'chan';

-- String Operation
select t.*
, upper(t.first_name) upper_first_name
, lower(t.last_name) lower_last_name
, length(t.first_name)
, concat(t.first_name, ' ', t.last_name) as full_name
, substring(t.first_name, 2, 3) -- Starting from the 2nd char, get 3 chars
, replace(t.first_name, 'J', 'X')
, instr(t.first_name, 's') -- not found: 0, Number of character: 2
from staffs t;

select b.genre
, round(avg(price), 2)
, floor(avg(price))
, ceil(avg(price))
, avg(price)
, power(2, 3)
from books b
group by b.genre;

-- Example
select b.price, sum(b.price) total_price
from books b
group by b.price
having max(price) > 9;

-- Add column
alter table staffs add join_date date;
select * from staffs;

update staffs set join_date = STR_TO_DATE('2020-06-30', '%Y-%m-%d') where id = 1;
update staffs set join_date = STR_TO_DATE('2021-01-15', '%Y-%m-%d') where id = 4;
update staffs set join_date = STR_TO_DATE('2018-12-20', '%Y-%m-%d') where id = 3;

select * from staffs where join_date = STR_TO_DATE('2018-12-20', '%Y-%m-%d');
select * from staffs where join_date between '2020-01-01' and '2020-12-31';

select s.join_date, s.join_date + interval 3 month - interval 1 day as probation_end, s.*
from staffs s;

-- create table (varchar, numeric, integer, date, datetime)
-- insert, update, delete
-- group by + agg functions (max, min, etc)
-- group by + having

-- Primary Key + Foreign Key
-- One To Many, Many To Many, One To One

-- A department has many employees
-- A Employee belongs to one department (allow null department)
create table departments (
	id int primary key,
    description varchar(50),
    code varchar(5)
);
insert into departments values (1, 'Information Technology', 'IT');
select * from departments;
-- insert into departments values (1, 'Human Resource', 'HR'); -- error
insert into departments values (2, 'Human Resource', 'HR'); -- OK
select * from departments;

create table employees (
	id int primary key, -- PK = "not null" + "unique" + "indexing"
    first_name varchar(50),
    last_name varchar(50),
    email varchar(50) not null unique, -- "unique" is a constriant
    department_id int not null, -- "not null" is a constriant
    FOREIGN KEY (department_id) REFERENCES departments(id) -- validate if the department_id exists in table departments
);
-- FK cannot ensure the value of department_id is non-null value.
-- Every table has its PK.

-- technically error and data invalid (FK helps safeguard invalid data)
-- insert into employees values (1, 'John', 'Lau', 'john@gmail.com', 3); 

insert into departments values (3, 'Marketing', 'MKT');
insert into employees values (1, 'John', 'Lau', 'john@gmail.com', 3); -- become OK

select * from employees;
insert into employees values (2, 'Oscar', 'Wong', null); -- after setting "not null" constraint to department_id, error
-- insert into employees values (2, 'Oscar', 'Wong', 'john@gmail.com', 1);
insert into employees values (2, 'Oscar', 'Wong', 'oscar@gmail.com', 1);

select * from employees;

-- inner join
select e.first_name as employee_first_name
, e.last_name as employee_last_name
, d.description as department_name
from departments d inner join employees e on e.department_id = d.id;

-- Many to Many (Students vs Subjects)
create table students (
	id int primary key,
    student_card_id varchar(10) not null unique,
    name varchar(50) not null
);
create table subjects (
	id int primary key,
    description varchar(50) not null
);
-- A student has no duplicated subject
-- A subject would not belong to the same student twice
-- The student id exists in table students
-- The subject id exists in table subjects
create table student_subjects (
	id int primary key,
    student_id int not null,
    subject_id int not null,
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (subject_id) REFERENCES subjects(id),
    unique(student_id, subject_id)
);
insert into students values (1, 'NO123', 'John');
insert into students values (2, 'NO124', 'Chris');

insert into subjects values (1, 'History');
insert into subjects values (2, 'English');
insert into subjects values (3, 'Math');

insert into student_subjects values (1, 2, 2); -- Chris + English
insert into student_subjects values (2, 2, 3); -- Chris + Math
insert into student_subjects values (3, 1, 1); -- John + History
-- insert into student_subjects values (4, 2, 3); -- Chris + Math (error, duplicate)
-- insert into student_subjects values (5, 7, 3); -- error, student id not exists
-- insert into student_subjects values (6, 1, 4); -- error, subject id not exists

select * from student_subjects;

-- Inner Join (~90%)
-- 2 x 3 x 3 = 18 rows (without "on" when inner join)
select ss.id, stu.name, sub.description -- last step: you can pick any columns you want
from student_subjects ss
	inner join students stu on stu.id = ss.student_id
    inner join subjects sub on sub.id = ss.subject_id
    ;

-- left Join
insert into students values (3, 'NO125', 'Mary');
-- Find all students and with his registered subjects, including those students without subject.
select stu.*, ss.*
from students stu left join student_subjects ss on stu.id = ss.student_id;

-- right join
select stu.*, ss.*
from students stu right join student_subjects ss on stu.id = ss.student_id;
select stu.*, ss.*
from student_subjects ss right join students stu on stu.id = ss.student_id;









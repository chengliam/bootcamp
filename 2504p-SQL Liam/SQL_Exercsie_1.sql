create database SQL_Exercsie_1;

use SQL_Exercsie_1;

create table regions (
	region_id int primary key,
    region_name varchar(25) not null
);

select * from regions;

create table counties (
	country_id char(2) primary key,
	cuntry_name varchar(40) not null,
	region_id int not null,
	foreign key (region_id) references regions(region_id)
);

select * from counties;

create table locations (
	location_id int primary key,
    street_adress varchar(25) not null,
    postal_code varchar(12) not null,
    city varchar(30) not null,
    state_province varchar(12),
    country_id char(2) not null,
    foreign key (country_id) references counties(country_id)
);

select * from locations;

create table departments (
	department_id int primary key,
	department_name varchar(30) not null,
	manager_id int not null unique,
	location_id int not null,
    foreign key (location_id) references locations(location_id)
);

select * from departments;

create table jobs (
	job_id varchar(10) primary key,
    job_title varchar(35) not null,
    min_salary int not null,
    max_salary int not null
);

select * from jobs;

create table employees (
	employee_id int primary key,
    first_name varchar(20) not null,
    last_name varchar(25) not null,
    email varchar(25) not null,
    phone_number varchar(20) not null,
    hire_date date,
    job_id varchar(10) not null,
    salary int not null,
    commission_pct int not null,
    manager_id int not null,
    department_id int not null,
    foreign key (job_id) references jobs(job_id),
    foreign key (department_id) references departments(department_id)
    );

select * from employees;

create table job_history (
	employee_id int not null unique,
    start_date date not null unique,
    end_date date,
    job_id varchar(10) not null unique,
    department_id int not null unique,
    foreign key (employee_id) references employees(employee_id),
    foreign key (job_id) references jobs(job_id),
    foreign key (department_id) references departments(department_id));
    
    select * from job_history;
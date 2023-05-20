create database crm_next_gen_01;
use crm_next_app_01;
use crm_next_gen_01;
create table login(emailid varchar(15), password varchar(10));
select * from login;

insert into login values("amit@gmail.com", "Amit123");
insert into login values("atul@gmail.com", "Atul123");
alter table login 
	rename 	column password to Password ;

create table leads(name varchar(15), emailid varchar(15), phone_num varchar(10), city varchar(15));
insert into leads values();
create table leads(first_name varchar(10), last_name varchar(10), email_id varchar(15), ph_num varchar(10), city varchar(15));
select * from leads;

ALTER TABLE leads 
	modify COLUMN email_id VARCHAR (30);

select * from leads;
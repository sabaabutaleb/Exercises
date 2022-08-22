create table table1(id integer, value integer);
insert into table1 values(1, -56);
insert into table1 values(2, 76);
insert into table1 values(3, -84);
insert into table1 values(4, 96);
insert into table1 values(5, -47);
select * from table1;
select value*(-1)  from table1;
--Q2
create table division (divisionid int ,year int, revenue int);
insert into division values(1,2018,60);
insert into division values(1,2021,40);
insert into division values(1,2020,70);
insert into division values(2,2021,-10);
insert into division values(3,2018,20);
insert into division values(3,2016,40);
insert into division values(4,2021,50);
select divisionid from division where year=2021 and revenue >0;
--Q3
create table yeartable (id int, year int);
insert into yeartable values(1,1776);
insert into yeartable values(2,2001);
insert into yeartable values(3,1643);
insert into yeartable values(4,1865);
insert into yeartable values(5,1969);
select (year/100)+1  from yeartable ;
--Q4
--create table evenOdd (id int, value varchar(50));
--insert into evenOdd values(1,4);
--insert into evenOdd values(2,11);
--insert into evenOdd values(3,57);
--insert into evenOdd values(4,24);
--insert into evenOdd values(5,47);
--select * from evenodd ;
--select value, case when value % 2 = 0 then 'even' when value % 2 = 1 then 'odd'  end value from evenOdd ; 
--select value,
--case
--	when (value %  2) = 0 then 'even' 
--    when(value % 2) =1 then 'odd' 
-- end value from evenodd ;

 
--Q5
create table people(id serial, name varchar(50),age int);
insert into people values(default, 'bob' ,21);
insert into people values(default,'sam',19);
insert into people values(default,'jill' ,18);
insert into people values(default,'jim',21);
insert into people values(default,'sally',19);
insert into people values(default,'jess',20);
insert into people values(default,'will',21);
select * from people;
select age  ,count(age) from people group by age order by age asc;
--Q6
create table people2(id serial, name varchar(50));
insert into people2 values(default, 'bob');
insert into people2 values(default,'sam');
insert into people2 values(default,'jill');
insert into people2 values(default,'jim');
insert into people2 values(default,'sally');
insert into people2 values(default,'jess');
insert into people2 values(default,'will');
select * from people2;
select id, name, concat ('Hi, ', name , ' ! How are you today?') as SayHello from people2 ;

--select  concat ('hi,'+ name+ 'How are you today!') as sayhello from people2;

--Q7
create table product (id serial, name varchar(50), amountsold int);
insert into product values(default, 'cup',11);
insert into product values(default, 'saucer',22);
insert into product values(default, 'plate',46);
insert into product values(default, 'fork',34);
insert into product values(default, 'spoon',45);
insert into product values(default, 'knife',78);
insert into product values(default, 'mug',23);
insert into product values(default, 'glass',64);
insert into product values(default, 'tumbeler',24);
select *from product;
select * from product order by amountsold desc limit 5;
--select id, name, concat('hi ',name, ' your amount is: ', amountsold) as greeting from product;
--Q8
create table countrys(id serial, name varchar(50),country varchar(50));
insert into countrys values(default, 'bob smith' ,'united states');
insert into countrys values(default,'jim jines','china');
insert into countrys values(default,'sam white' ,'japan');
insert into countrys values(default,'jess black','canada');
insert into countrys values(default,'will wilson','germany');
insert into countrys values(default,'wilson scott','england');
insert into countrys values(default,'scott danial','france');
insert into countrys values(default,'danial jackson','canada');
delete from  countrys where name = 'jack jakson';
insert into countrys values(default,'jack jakson','united states');

select * from countrys;
select name from countrys except select name from countrys where country= 'united states' or country= 'canada';
--Q9
create table boys(id serial, name varchar(50),age int);
insert into boys values(default, 'bob' ,21);
insert into boys values(default,'sam',19);
insert into boys values(default,'jill' ,18);
insert into boys values(default,'jim',21);
insert into boys values(default,'sally',19);
insert into boys values(default,'jess',20);
insert into boys values(default,'will',21);
select * from boys;
select distinct  age from boys order by age asc ;
--Q10
select sum(age) from boys;


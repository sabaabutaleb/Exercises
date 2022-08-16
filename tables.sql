/*Querying practice
--Select all records from the Employee table.
--Select all records from the Employee table where last name is King.
--Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
--Select all albums in Album table and sort result set in descending order by title.
--Select first name from Customer and sort result set in ascending order by city
--Select all invoices with a billing address like “T%”
--Select all invoices that have a total between 15 and 50
--Select all employees hired between 1st of June 2003 and 1st of March 2004
--Insert practice
Insert two new records into Genre table
Insert two new records into Employee table
Insert two new records into Customer table
--Update Practice
--Update Aaron Mitchell in Customer table to Robert Walter
--Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”
Save all of your queries/commands in an sql file and push it to your exercise repo.*/
select * from "Employee";
select * from "Employee" where "LastName" ='King';
select * from "Employee"  where "FirstName" ='Andrew' and "ReportsTo" is  null; 
select * from "Album" order by "Title" desc ;
select "FirstName"  from "Customer" order by "City" asc ;
select * from "Invoice" where "BillingAddress" like 'T%';
select * from "Invoice"  where "Total" >=15 and "Total" <=50;
select * from "Employee" where "HireDate" > '2003-06-01' and "HireDate" < '2004-03-01';
--insert practice
insert  into "Genre" ( "GenreId" ,"Name" ) values(26,'Jazzzz');
insert  into "Genre" ( "GenreId" ,"Name" ) values(27,'Jaaaaz');
select * from "Employee" e ;
--set identity_insert "Employee" on;
insert  into "Employee" values(9,'smith','will','sofeware engineer',2,'1958-12-08 00:00:00.000','2002-12-12 00:00:00.000','3320 tigersroad','Destin','FL','Canada','T5L 2T3','+1(780)693-5252','+1(780)693-5253', ' will@gmail.cim');
insert  into "Employee" values(10,'sam','wiliam','sofeware engineer',2,'1958-12-08 00:00:00.000','2002-12-12 00:00:00.000','3320 tigersroad','Destin','FL','Canada','T5L 2T3','+1(780)693-5252','+1(780)693-5253', ' sam@gmail.cim');
select * from "Customer" c ;
insert into "Customer"("CustomerId", "FirstName" ,"LastName" ,"Address" ,"City" ,"PostalCode"  ,"Phone" ,"Email" ,"SupportRepId") values(60,'paul','gim','46 tiger road','kinner','6589','+108502613535','paul@gmail.com',3);
insert into "Customer"("CustomerId", "FirstName" ,"LastName" ,"Address" ,"City" ,"PostalCode"  ,"Phone" ,"Email" ,"SupportRepId") values(61,'pam','gimmy','5846 tiger road','kinner','6589','+108502553535','pam@gmail.com',3);

--update practice
update "Customer" set "LastName" ='Walter' where "LastName" ='Mitchell';
update  "Customer"  set "FirstName" ='Robert' where "FirstName" ='Aaron';
update "Artist" set "Name" = 'CCR' where "Name" ='Creedence Clearwater Revival';








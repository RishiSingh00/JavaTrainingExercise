use hughes;

create table bankaccount(
accountno int primary key,
name varchar(100),
balance decimal(10,2),
openingDate date,
password varchar(20)
);

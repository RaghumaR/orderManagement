# orderManagement

use mydb;

create table customerorderdetails(
id int auto_increment PRIMARY KEY,
name varchar(20),
grade varchar(20),
addressLine1 varchar(50),
addressLine2 varchar(50),
city varchar(20),
state varchar(20),
zip varchar(20)
);

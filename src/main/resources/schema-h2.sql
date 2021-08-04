drop table if exsits person;

create table person
(
   id integer not null auto increment,
   name varchar,
   last_name varchar,
   birthdate date
)
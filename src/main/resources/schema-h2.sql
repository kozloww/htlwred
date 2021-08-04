drop table if exists person;

create table person
(
   id integer not null primary key,
   name varchar,
   last_name varchar,
   birthdate date
)
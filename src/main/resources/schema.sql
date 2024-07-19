drop table if exists users cascade;
create table users (id uuid not null, first_name varchar(255), last_name varchar(255), login_name varchar(255), primary key (id));
drop table if exists transactions cascade;
create table transactions (amount numeric(38,2), id uuid not null, user_id uuid, primary key (id));
alter table if exists transactions add constraint fk1 foreign key (user_id) references users;
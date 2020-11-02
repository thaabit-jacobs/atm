create table if not exists users(
	id int primary key not null,
	first_name varchar(225) not null,
	last_name varchar(225) not null,
	email varchar(225) not null,
	date_created date not null
);
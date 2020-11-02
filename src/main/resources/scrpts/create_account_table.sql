create table if not exists accounts(
	id int primary key not null,
	account_name varchar(225) not null,
	account_type varchar(225) not null,
	account_number int not null,
	date_created date not null,
	balance decimal(10, 2) not null
);
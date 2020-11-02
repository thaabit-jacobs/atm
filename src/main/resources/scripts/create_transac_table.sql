create table if not exists transactions(
    id int primary key not null,
    transac_type varchar(125) not null,
    transaction_success boolean not null,
    transaction_amount decimal(10, 2),
    date_time timestamp not null,
    account_id int not null,
    foreign key(account_id) references accounts(id)
);
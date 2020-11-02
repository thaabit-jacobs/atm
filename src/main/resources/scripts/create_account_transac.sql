create table if not exists account_transac(
    account_id int not null,
    transac_id int not null,
    foreign key(account_id) references accounts(id),
    foreign key(transac_id) references transactions(id)
);
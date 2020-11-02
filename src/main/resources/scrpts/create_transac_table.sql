create table if not exists transactions(
    id int primary key not null,
    transac_type varchar(125) not null,
    date_time timestamp not null,
    transaction_success boolean not null,
    transaction_amount decimal(10, 2)
);
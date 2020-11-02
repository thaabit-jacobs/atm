create table if not exists user_account(
    user_id int not null,
    account_id int not null,
    foreign key(user_id) references users(id),
    foreign key(account_id) references accounts(id)
);
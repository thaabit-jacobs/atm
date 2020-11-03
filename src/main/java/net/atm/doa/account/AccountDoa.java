package net.atm.doa.account;

import net.atm.model.transaction.Transaction;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import net.atm.model.account.Account;

import java.util.List;

public interface AccountDoa {

    @SqlUpdate("insert into accounts(id, account_name, account_type, account_number, date_created, balance, user_id)" +
    " values(:id, :accountName, :accountType, :accountNum, :dateCreated, :balance, :userId)")
    void insertAccount(@BindBean Account account);

    @SqlUpdate("update accounts set account_name=:accountName, account_type=:account_type, account_number=:account_number, balance=:balance where id=:id")
    void updateAccount(@BindBean Account account);

    @SqlUpdate("delete from accounts where id=:id")
    void deleteAccount(@Bind("id") int id);

    @SqlQuery("select id, account_name, account_type, account_number, balance, date_created, user_id from accounts")
    List<Account> selectAllAccounts(); 

    @SqlQuery("select id, account_name, account_type, account_number, balance, date_created, user_id from accounts where id=:id")
    Account selectAccount(@Bind("id")int id);

    @SqlQuery("select * from transactions where account_id=:id")
    List<Transaction> selectAllAccountTransacs(@Bind("id") int id);

}

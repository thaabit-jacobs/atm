package net.atm.doa.account;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import net.atm.model.account.Account;

import java.util.List;

public interface AccountDoa {

    @SqlUpdate("insert into accounts(id, account_name, account_type, account_number, date_created, balance)" + 
    " values(:id, :accountName, :accountType, :accountNum, :dateCreated, :balance)")
    void insertAccount(@BindBean Account account);

    @SqlUpdate("update accounts set account_name=:accountName, balance=:balance where id=:id")
    void updateAccount(@BindBean Account account);

    @SqlUpdate("insert into account_transac(account_id, transac_id) values(?, ?)")
    void insertAccountTransac(int accountId, int transacId);

    @SqlUpdate("delete from accounts where id=:id")
    void deleteAccount(@Bind("id") int id);

    @SqlQuery("select * from accounts")
    List<Account> selectAllAccounts(); 

    @SqlQuery("select * from accounts where id=:id")
    Account selectAccount(@Bind("id")int id); 
    
}

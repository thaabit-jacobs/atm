package net.atm.doa.account;

import java.util.List;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import net.atm.model.account.Account;

import org.jdbi.v3.core.spi.JdbiPlugin;


public class AccountDoaImpl implements AccountDoa {

    private  final Jdbi  jdbi = Jdbi.create("jdbc:postgresql://localhost:5432/bank", "thaabit", "1234");

    public AccountDoaImpl(){
        jdbi.installPlugin((JdbiPlugin) new SqlObjectPlugin());
    }

     @Override
     public void insertAccount(Account account) {
         jdbi.useExtension(AccountDoa.class, doa -> doa.insertAccount(account));
    }

     @Override
     public void updateAccount(Account account) {
         jdbi.useExtension(AccountDoa.class, doa -> doa.updateAccount(account));
     }

     public void insertAccountTransac(int accountId, int transacId){
        jdbi.useExtension(AccountDoa.class, doa -> doa.insertAccountTransac(accountId, transacId));
     }

     @Override
     public void deleteAccount(int id) {
         jdbi.useExtension(AccountDoa.class, doa -> doa.deleteAccount(id));
     }

     @Override
     public List<Account> selectAllAccounts() {
        jdbi.registerRowMapper(Account.class, (rs, ctx) -> new Account(rs.getInt("id"), rs.getString("account_name"), rs.getString("account_type"), rs.getDouble("balance")));
         return jdbi.withExtension(AccountDoa.class, doa -> doa.selectAllAccounts());
     }

     
     @Override
     public Account selectAccount(int id) {
        jdbi.registerRowMapper(Account.class, (rs, ctx) -> new Account(rs.getInt("id"), rs.getString("account_name"), rs.getString("account_type"), rs.getDouble("balance")));
         return jdbi.withExtension(AccountDoa.class, doa -> doa.selectAccount(id));
     }
}

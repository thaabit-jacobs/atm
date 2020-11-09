package net.atm.doa.user;

import net.atm.model.account.Account;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import net.atm.model.user.User;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class UserDoaImpl implements UserDoa {

    private  final Jdbi  jdbi = Jdbi.create("jdbc:postgresql://localhost:5432/bank", "thaabit", "1234");

    public UserDoaImpl(){
        jdbi.installPlugin((JdbiPlugin) new SqlObjectPlugin());
    }


    @Override
    public void insertUser(User user) {
        jdbi.useExtension(UserDoa.class, doa -> doa.insertUser(user));

    }

    @Override
    public void updateUser(User user) {
        jdbi.useExtension(UserDoa.class, doa -> doa.updateUser(user));
    }

    @Override
    public List<Account> selectAllUserAccounts(int i){
        jdbi.registerRowMapper(Account.class, (rs, ctx) -> new Account(rs.getInt("id"), rs.getString("account_name"), rs.getString("account_type"), rs.getInt("account_number"), rs.getDouble("balance"), new Timestamp(rs.getDate("date_created").getTime()).toLocalDateTime(), rs.getInt("user_id")));
       return jdbi.withExtension(UserDoa.class, doa -> doa.selectAllUserAccounts(i));
    }

    @Override
    public Account selectUserAccount(int id,int userId){
        jdbi.registerRowMapper(Account.class, (rs, ctx) -> new Account(rs.getInt("id"), rs.getString("account_name"), rs.getString("account_type"), rs.getInt("account_number"), rs.getDouble("balance"), new Timestamp(rs.getDate("date_created").getTime()).toLocalDateTime(), rs.getInt("user_id")));
       return jdbi.withExtension(UserDoa.class, doa -> doa.selectUserAccount(id, userId));
    }

    @Override
    public User selectUser(int id) {
        jdbi.registerRowMapper(User.class, (rs, ctx) -> new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("password"), rs.getString("email"), new Timestamp(rs.getDate("date_created").getTime()).toLocalDateTime()));
        return jdbi.withExtension(UserDoa.class, doa -> doa.selectUser(id));
    }

    @Override
    public List<User> selectAllUser() {
        jdbi.registerRowMapper(User.class, (rs, ctx) -> new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("password"), rs.getString("email"),new Timestamp(rs.getDate("date_created").getTime()).toLocalDateTime()));
        return jdbi.withExtension(UserDoa.class, doa -> doa.selectAllUser());
    }

    @Override
    public void deleteUser(int id) {
        jdbi.useExtension(UserDoa.class, doa -> doa.deleteUser(id));
    }

    @Override
    public User selectUserIfExist(String email, String password){
        jdbi.registerRowMapper(User.class, (rs, ctx) -> new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("password"), rs.getString("email"), new Timestamp(rs.getDate("date_created").getTime()).toLocalDateTime()));
        return jdbi.withExtension(UserDoa.class, doa -> doa.selectUserIfExist(email, password));
    }
}

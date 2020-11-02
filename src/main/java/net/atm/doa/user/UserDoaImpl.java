package net.atm.doa.user;

import org.jdbi.v3.core.Jdbi;
//import org.jdbi.v3.core.spi.JdbiPlugin.Singleton;
import org.jdbi.v3.core.spi.JdbiPlugin;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.jdbi.v3.sqlobject.customizer.Bind;

import net.atm.model.user.User;
import net.atm.types.AccountType;

import java.time.LocalDate;
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
    public void insertUserAccount(int userId, int accountId){
        jdbi.useExtension(UserDoa.class, doa -> doa.insertUserAccount(userId, accountId));
    }

    @Override
    public User selectUser(int id) {
        jdbi.registerRowMapper(User.class, (rs, ctx) -> new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("password"), rs.getString("email")));
        return jdbi.withExtension(UserDoa.class, doa -> doa.selectUser(id));
    }

    @Override
    public List<User> selectAllUser() {
        jdbi.registerRowMapper(User.class, (rs, ctx) -> new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("password"), rs.getString("email")));
        return jdbi.withExtension(UserDoa.class, doa -> doa.selectAllUser());
    }

    @Override
    public void deleteUser(int id) {
        jdbi.useExtension(UserDoa.class, doa -> doa.deleteUser(id));
    }
}

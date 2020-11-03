package net.atm.doa.user;

import net.atm.model.account.Account;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.customizer.BindFields;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import net.atm.model.user.User;

import java.time.LocalDate;
import java.util.List;


public interface UserDoa{

    @SqlUpdate("insert into users (id, first_name, last_name, password, email, date_created) " +
            "values (:id, :firstName, :lastName, :password, :email, :dateCreated)")
    void insertUser(@BindBean User user);

    @SqlUpdate("update users set first_name=:firstName, last_name=:lastName, password=:password, email=:email where id=:id" )
    void updateUser(@BindBean User user);

    @SqlUpdate("delete from users where id=:id")
    void deleteUser(@Bind("id") int id);

    @SqlQuery("select * from users where id=:id")
    User selectUser(@Bind("id") int id);

    @SqlQuery("select * from users")
    List<User> selectAllUser();

    @SqlQuery("select * from accounts where user_id=:id")
    List<Account> selectAllUserAccounts(@Bind("id") int id);


}
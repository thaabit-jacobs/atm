package net.atm.mapper;

import net.atm.model.account.Account;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class AccountMapper  implements RowMapper<Account>{
    @Override
    public Account map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new Account(rs.getInt("id"), rs.getString("account_name"), rs.getString("account_type"), rs.getInt("account_number"),rs.getDouble("balance"), new Timestamp(rs.getDate("date_created").getTime()).toLocalDateTime(), rs.getInt("user_id"));
    }
}

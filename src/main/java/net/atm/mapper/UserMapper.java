package net.atm.mapper;

import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import net.atm.model.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;
/*
public class UserMapper implements RowMapper<User> {


    @Override
    public User map(ResultSet rs, StatementContext ctx) throws SQLException {
        return new User(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("password"), rs.getString("email"));
    }
}*/

package com.msc.spring.dao.rowmapper;

import com.msc.spring.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(rs.getInt(1),rs.getString(2), rs.getString(3));
    }
}

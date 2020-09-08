package com.msc.spring.employee.dto.rowmapper;

import com.msc.spring.employee.dto.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee(rs.getInt(1),rs.getString(2), rs.getString(3));
        return emp;
    }
}

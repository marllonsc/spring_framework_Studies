package com.msc.spring.employee.dao;

import com.msc.spring.connection.ConnectionJDBC;
import com.msc.spring.employee.dto.Employee;
import com.msc.spring.employee.dto.rowmapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOImpl implements  EmployeeDAO {

    @Autowired
    @Qualifier("connection")
    private ConnectionJDBC jdbcTemplate;

    @Override
    public Boolean create(Employee employee) {
        try {
            String sql = "insert into employee values(?,?,?)";
            jdbcTemplate.getConnection().update(sql, employee.getId(), employee.getFirstName(), employee.getLastNam());
            return true;
        } catch (Exception e) {
            System.out.println("Error!!! " +e.getMessage());
            return false;
        }
    }

    @Override
    public Boolean update(Employee old, Employee neo) {
        try {
            String sql = "update employee set firstname=?, lastname=? where id=?";
            jdbcTemplate.getConnection().update(sql, neo.getFirstName(), neo.getLastNam(), old.getId());
            return true;
        }catch (Exception e) {
            System.out.println("Error!!! " +e.getMessage());
            return false;
        }
    }

    @Override
    public Boolean delete(Employee employee) {
        try {
            String sql = "delete from employee where id=?";
            jdbcTemplate.getConnection().update(sql, employee.getId());
            return true;
        }catch (Exception e) {
            System.out.println("Error!!! " +e.getMessage());
            return false;
        }
    }

    @Override
    public Employee read(Employee employee) {
        try {
            String sql = "select * from employee where id=?";
            EmployeeRowMapper emprow = new EmployeeRowMapper();
            employee = jdbcTemplate.getConnection().queryForObject(sql, emprow, employee.getId());
            return employee;
        }catch (Exception e) {
            System.out.println("Error!!! " +e.getMessage());
            return null;
        }
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> list;
        try {
            String sql = "select * from employee";
            EmployeeRowMapper emprow = new EmployeeRowMapper();
            list = jdbcTemplate.getConnection().query(sql, emprow);
            return list;
        }catch (Exception e) {
            System.out.println("Error!!! " +e.getMessage());
            return new ArrayList<Employee>();
        }
    }


}

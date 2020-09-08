package com.msc.spring.employee.dao;

import com.msc.spring.employee.dto.Employee;

import java.util.List;

public interface EmployeeDAO {

    Boolean create(Employee employee);

    Boolean update(Employee old, Employee neo);

    Boolean delete(Employee employee);

    Employee read(Employee employee);

    List<Employee> getAll();
}

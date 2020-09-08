package com.msc.spring;

import com.msc.spring.employee.dao.EmployeeDAO;
import com.msc.spring.employee.dao.EmployeeDAOImpl;
import com.msc.spring.employee.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJDBC implements CommandLineRunner
{

    @Autowired
    @Qualifier("empDao")
    private EmployeeDAO employeeDAO;


    public static void main( String[] args ) {
        SpringApplication.run(SpringJDBC.class, args);
    }

    @Bean("empDao")
    public EmployeeDAO createDao(){
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        return employeeDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        // employeeDAO.create(new Employee(null,"TuTU","VAVA"));  Insert
        Boolean up = employeeDAO.update(new Employee(1), new Employee("Kadu","09"));
        // Boolean del = employeeDAO.delete(new Employee(3));  //delete
        System.out.println(up + " + Employee "+ employeeDAO.read(new Employee(1)));
        System.out.println("List "+employeeDAO.getAll());
    }
}

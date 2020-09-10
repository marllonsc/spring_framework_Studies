package com.msc.spring.controller;

import com.msc.spring.dto.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {

    @RequestMapping("/readList")
    public ModelAndView sendOList(){
        ModelAndView modelAndView = new ModelAndView("displayList");

        Employee employee = new Employee();
        employee.setId(258);
        employee.setName("John");
        employee.setSalary(20000.0);

        Employee employee2 = new Employee();
        employee2.setId(953);
        employee2.setName("Marllon");
        employee2.setSalary(50000.0);

        Employee employee3 = new Employee();
        employee3.setId(123);
        employee3.setName("Lucas");
        employee3.setSalary(750000.0);

        List list = new ArrayList<Employee>();
        list.add(employee);
        list.add(employee2);
        list.add(employee3);

        modelAndView.addObject("list", list);
        return modelAndView;
    }
}

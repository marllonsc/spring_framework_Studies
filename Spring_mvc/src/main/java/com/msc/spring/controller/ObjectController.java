package com.msc.spring.controller;

import com.msc.spring.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectController {

    @RequestMapping("/readObject")
    public ModelAndView sendObject(){
        ModelAndView modelAndView = new ModelAndView("displayObject");
        Employee employee = new Employee();
        employee.setId(123);
        employee.setName("John");
        employee.setSalary(20000.0);
        modelAndView.addObject("employee", employee );
        return modelAndView;
    }
}

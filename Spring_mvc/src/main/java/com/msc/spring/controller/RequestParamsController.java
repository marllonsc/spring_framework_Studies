package com.msc.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {


    // test http://localhost:8080/showData?id=23&name=Marllon&sal=20.5
    @RequestMapping("/showData")
    public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
    @RequestParam(value = "sal" ,required = false, defaultValue = "6000.0") Double salary){
        ModelAndView modelAndView = new ModelAndView("userReg");

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

        return modelAndView;
    }
}

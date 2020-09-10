package com.msc.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("id", 123);
        model.addObject("name", "Marllon Costa");
        model.addObject("salary", 10000);
        return model;
    }
}

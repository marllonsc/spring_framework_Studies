package com.msc.spring.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControler {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }
}

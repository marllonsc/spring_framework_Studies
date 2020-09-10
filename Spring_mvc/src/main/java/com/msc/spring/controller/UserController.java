package com.msc.spring.controller;

import com.msc.spring.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/registrationPage")
    public String showRegistrationPage(){
       // ModelAndView modelAndView = new ModelAndView("userReg");
        return "userReg";
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, ModelMap model){
        System.out.println(user);
        //ModelAndView modelAndView = new ModelAndView("regResult");
       // modelAndView.addObject("user",user);
        model.addAttribute("user",user);
        return "regResult";
    }


}

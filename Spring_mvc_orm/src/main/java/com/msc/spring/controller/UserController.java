package com.msc.spring.controller;

import com.msc.spring.entity.User;
import com.msc.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/registrationPage")
    public String showRegistrationPage(){
        // ModelAndView modelAndView = new ModelAndView("userReg");
        return "userReg";
    }

    @RequestMapping("/delete")
    public String deeltePage(){
        return "deleteUser";
    }

    @RequestMapping("/update")
    public String udpatePage(){

        return "UpdateUser";
    }

    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User user, ModelMap model){
        System.out.println(user);
        Boolean result = service.save(user);
        if (result) {
            model.addAttribute("message","Sucess Insert");
            model.addAttribute("user",user);
            return "regResult";
        } else {
            model.addAttribute("message","Error !");
            model.addAttribute("user","It was not insert, something worng just happened!");
            return "regResult";
        }
    }

    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute("user") User user, ModelMap model){
        System.out.println(user);
        Boolean result = service.update(user);
        if (result) {
            model.addAttribute("message","Sucess Update");
            model.addAttribute("user",user);
            return "regResult";
        } else {
            model.addAttribute("message","Error !");
            model.addAttribute("user","It was not insert, something worng just happened!");
            return "regResult";
        }
    }


    @RequestMapping(value = "deleteUser", method = RequestMethod.POST)
    public String deleteUser(@ModelAttribute("user") User user, ModelMap model){
        System.out.println(user);
        Boolean result = service.delete(user);
        if (result) {
            model.addAttribute("message","Sucess Delete");
            model.addAttribute("user",user);
            return "regResult";
        } else {
            model.addAttribute("message","Error !");
            model.addAttribute("user","It was not insert, something worng just happened!");
            return "regResult";
        }
    }


    @RequestMapping(value = "/showUser")
    public String findUser(@RequestParam() int id, ModelMap model){
        User result = service.load(new User(id));
        if (result != null) {
            model.addAttribute("message","Sucess Search");
            model.addAttribute("user",result);
            return "showUsers";
        } else {
            model.addAttribute("message","Not Found!");
            model.addAttribute("user","empty");
            return "showUsers";
        }
    }

    @RequestMapping(value = "/showAll")
    public String getAll(ModelMap model){
        List<User> result = service.findAll();
        if (result != null) {
            model.addAttribute("message","Sucess Search");
            model.addAttribute("user",result);
            return "showUsers";
        } else {
            model.addAttribute("message","Not Found!");
            model.addAttribute("user","empty");
            return "showUsers";
        }
    }

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }


}

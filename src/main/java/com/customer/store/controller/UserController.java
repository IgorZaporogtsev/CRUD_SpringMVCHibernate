package com.customer.store.controller;

import com.customer.store.model.User;
import com.customer.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public String getAllUser(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("getAllUser", this.userService.getAllUser());
        return "user";
    }



}
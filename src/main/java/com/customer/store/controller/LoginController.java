package com.customer.store.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String loginPage(Model model){
        return "login";
    }

}

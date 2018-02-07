package com.customer.store.controller;

import com.customer.store.model.User;
import com.customer.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser(Model model){
        model.addAttribute("getAllUser", this.userService.getAllUser());
        return "getAlluser";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addUserpage(Model model){
        model.addAttribute("user", new User());
        return "adduser";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
             userService.addUser(user);

        return "redirect:/user";
    }



    @RequestMapping("/delete/{id}")
    public String deteteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return "redirect:/user";
    }

 /*   @RequestMapping(value="delete")
    public String deleteUser(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(id);
        return "redirect:/user";
    }*/

}
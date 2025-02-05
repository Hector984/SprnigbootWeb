package com.hector.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.hector.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        model.addAttribute("title", "Spring app");
        model.addAttribute("name", "Héctor");
        model.addAttribute("lastname", "García"); 

        return "details";
    }

    @GetMapping("/users")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("Hector", "Jimenez"), 
            new User("Jose", "Jimenez"), 
            new User("Caro", "Jimenez")
        );

        model.addAttribute("users", users);

        return "users";
    }

}

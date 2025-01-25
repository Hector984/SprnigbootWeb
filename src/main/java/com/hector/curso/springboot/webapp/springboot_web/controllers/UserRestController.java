package com.hector.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hector.curso.springboot.webapp.springboot_web.dto.UserDTO;
import com.hector.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    // Otra forma de indicar que tipo de metodo es
    // @RequestMapping("/details", method = RequestMethod.GET)
    @GetMapping("/details")
    public UserDTO details() {
        
        UserDTO userDTo = new UserDTO();
        User user = new User("Hector", "Jimenez");

        userDTo.setTitle("Spring app");
        userDTo.setUser(user);

        // Asi se crean los json
        // Map<String, Object> body = new HashMap<>();

        // body.put("title", "Spring app");
        // body.put("user", user);

        return userDTo;
    }

    @GetMapping("/users")
    public List<User> users() {
        User user1 = new User("Hector", "Jimenez");
        User user2 = new User("Jose", "Jimenez");
        User user3 = new User("Caro", "Jimenez");

        List<User> users = List.of(user1, user2, user3);

        return users; 
    }
} 

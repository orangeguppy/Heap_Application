package com.application.web;

import com.application.database.entity.User;
import com.application.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/api")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
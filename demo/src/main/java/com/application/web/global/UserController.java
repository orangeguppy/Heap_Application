package com.application.web.global;
import java.util.List;
import java.util.Optional;

import com.application.database.global.entity.User;
import com.application.database.global.repository.UserRepository;
import org.hibernate.annotations.GeneratorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @GetMapping("/{userName}/{password}")
    Optional<User> getUserByUserNameAndPassword(@PathVariable String userName, @PathVariable String password) {
        return userRepository.findByUserNameAndPassword(userName, password);
    }

    @GetMapping("/{emailAddress}/{password}")
    Optional<User> getUserByEmailAddressAndPassword(@PathVariable String emailAddress, @PathVariable String password) {
        return userRepository.findByUserNameAndPassword(emailAddress, password);
    }

    @GetMapping("/register-account")
    public String registerAccount(Model model)
    {
        model.addAttribute("user", new User());
        return "register-account";
    }

    @PostMapping("/process-account")
    public String processAccount(User user)
    {
        userRepository.save(user);
        return "login-success";
    }

//    @GetMapping("/{dateRegistered}")
//    List<User> getUsersByDateRegistered(@PathVariable LocalDate dateRegistered) {
//        return userRepository.findByDateRegistered(dateRegistered);
//    }
}
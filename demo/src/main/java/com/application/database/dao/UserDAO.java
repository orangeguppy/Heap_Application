package com.application.database.dao;
import com.application.database.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class UserDAO {
    @Autowired
    UserRepository userRepository;
    public boolean save(User user) throws Exception {
        userRepository.save(user);
        return false;
    }

    @Bean
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
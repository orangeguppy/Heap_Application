package com.application.database.service;

import com.application.database.entity.User;
import com.application.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserAccessService {
    @Autowired
    private EntityManager em;
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserWithId(Integer id) {
        return userRepository.findById(id);
    }
}
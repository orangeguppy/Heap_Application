package com.application.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.application.database.entity.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();
    Optional<User> findById(int id);

    List<User> findByDateRegistered(LocalDate dateRegistered);
}
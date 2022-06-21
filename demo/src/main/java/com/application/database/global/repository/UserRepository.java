package com.application.database.repository.global;

import com.application.database.entity.global.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();
    Optional<User> findById(int id);
    List<User> findByDateRegistered(LocalDate dateRegistered);
}
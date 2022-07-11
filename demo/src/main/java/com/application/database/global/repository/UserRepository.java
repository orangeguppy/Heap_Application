package com.application.database.global.repository;

import com.application.database.global.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findAll();

    Optional<User> findByUserName(String userName);
    Optional<User> findByUserNameAndPassword(String userName, String password);

    Optional<User> findByEmailAddressAndPassword(String emailAddress, String password);
    Optional<User> findById(int id);
    List<User> findByDateRegistered(LocalDate dateRegistered);
}
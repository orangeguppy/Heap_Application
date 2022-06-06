package com.application.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.application.database.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
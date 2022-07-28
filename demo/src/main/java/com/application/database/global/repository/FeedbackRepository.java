package com.application.database.global.repository;

import com.application.database.global.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    List<Feedback> findAll(); // list all feedback rows in the database

    List<Feedback> findByName(String name); // list all feedback forms with this name

    List<Feedback> findByEmail(String email); // list all feedback forms with this email
}

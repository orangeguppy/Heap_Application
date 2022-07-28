package com.application.database.global.repository;

import com.application.database.global.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    List<Feedback> findAll();

    List<Feedback> findByName(String name);

    List<Feedback> findByEmail(String email);
}

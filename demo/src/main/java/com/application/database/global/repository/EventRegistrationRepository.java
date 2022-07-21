package com.application.database.global.repository;


import com.application.database.global.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRegistrationRepository extends JpaRepository<Events, Integer> {
    List<Events> findAll();
    Optional<Events> findByEID(int EID);
    List<Events> findByEventNameContaining(String eventName);
}
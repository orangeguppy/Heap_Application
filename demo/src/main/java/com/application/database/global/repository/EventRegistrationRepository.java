package com.application.database.global.repository;


import com.application.database.global.entity.EventRegistration;
import com.application.database.global.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Integer> {
    List<EventRegistration> findAll();
    Optional<EventRegistration> findByEIDAndUID(int EID, int UID);
    List<EventRegistration> findByUIDAndEventNameContaining(int UID, String eventName);
}
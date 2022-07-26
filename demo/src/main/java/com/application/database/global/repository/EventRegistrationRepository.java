package com.application.database.global.repository;

import com.application.database.global.entity.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Integer> {
    List<EventRegistration> findAll();
    Optional<EventRegistration> findByEIDAndUID(int EID, int UID);

    List<EventRegistration> findByEID(int EID);

    List<EventRegistration> findByUID(int UID);
}
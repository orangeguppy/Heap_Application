package com.application.database.global.repository;

import com.application.database.global.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventsRepository extends JpaRepository<Events, Integer> {
    List<Events> findAll();
    Events findByEID(int EID);
    Optional<Events> findByStartDate(LocalDate startDate);

    List<Events> findByEventNameContaining(String eventName);

    List<Events> findByOID(int OID);

    List<Events> findByOIDAndEventNameContaining(int OID, String eventName);
}
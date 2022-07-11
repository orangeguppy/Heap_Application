package com.application.database.global.repository;


import com.application.database.global.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventsRepository extends JpaRepository<Events, Integer> {
    List<Events> findAll();
    Optional<Events> findByEID(int EID);
    Optional<Events> findByEventName(String eventName);
    Optional<Events> findByEventNameAndStartDate(String eventName, LocalDate startDate);
    Optional<Events> findByStartDate(LocalDate startDate);

    List<Events> findByEventNameContaining(String eventName);
}
package com.application.database.repository.global;


import com.application.database.entity.global.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventsRepository extends JpaRepository<Events, Integer> {
    List<Events> findAll();
    Optional<Events> findByEID(int EID);

}

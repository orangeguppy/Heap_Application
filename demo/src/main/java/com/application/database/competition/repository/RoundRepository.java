package com.application.database.competition.repository;

import com.application.database.competition.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundRepository extends JpaRepository<Round, Integer> {
    // check if specific event has certain round (roundName)

    // return all events with specific round (single selection and multiple selection)

    // return all events with specific number of rounds
}

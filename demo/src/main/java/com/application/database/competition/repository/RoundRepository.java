package com.application.database.competition.repository;

import com.application.database.competition.repository.entity.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoundRepository extends JpaRepository<Round, Integer> {
    // check if specific event has certain round (roundName) (TBC boolean)

    // return all events with specific round (single selection and multiple selection)
    List<Round> findByRoundNameContaining(String roundName);

    // return all events with specific number of rounds (TBC)
}

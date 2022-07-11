package com.application.database.competition.repository;

import com.application.database.competition.entity.Score;
import com.application.database.global.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
    Optional<Score> findByRoundNameAndUID(String roundName, int UID);


}

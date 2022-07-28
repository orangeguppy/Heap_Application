package com.application.database.competition.repository;

import com.application.database.competition.repository.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
    // return score of specific round for specific event for specific user (EID, roundName, UID)
    Optional<Score> findByEIDAndRoundNameAndUID(int EID, String roundName, int UID);

    // return highest, lowest, mean, median scores (TBC)

    // return users with same specific score (TBC)


}

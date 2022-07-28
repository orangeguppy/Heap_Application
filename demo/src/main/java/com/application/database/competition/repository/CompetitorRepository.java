package com.application.database.competition.repository;

import com.application.database.competition.repository.entity.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitorRepository extends JpaRepository<Competitor, Integer> {
    // return all users involved in competition (including their roles)


    // check if user is involved in particular competition (UID AND EID)
}

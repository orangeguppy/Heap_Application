package com.application.database.repository.competition;

import com.application.database.entity.competition.Competitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitorRepository extends JpaRepository<Competitor, Integer> {
}

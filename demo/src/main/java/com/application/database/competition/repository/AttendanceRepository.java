package com.application.database.competition.repository;

import com.application.database.competition.entity.Attendance;
import com.application.database.global.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    // return attendance status for all participants in all rounds
    List<Attendance> findAll();

    // return attendance status for specific round of specific event (UID, EID, roundName)
    Optional<Attendance> findByUIDAndEIDAndRoundName(int UID, int EID, String roundName);

    // return attendance count or % for particular round of specific event (TBC)

}

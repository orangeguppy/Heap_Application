package com.application.database.entity.competition;
import com.application.database.entity.global.Events;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
public class Competition extends Events {
    private int WID; // winner ID

    public Competition() {
    }

    public Competition(String eventName, int maxCapacity, String eventLocation, int minAge, LocalDate registrationStart, LocalDate registrationEnd, LocalDate startDateTime, LocalDate endDateTime) {
        super(eventName, maxCapacity, eventLocation, minAge, registrationStart, registrationEnd, startDateTime, endDateTime);
    }
}
package com.application.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.*;

public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EID;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OID;

    private String eventName;
    private int maxCapacity;
    private String eventLocation;
    private int minAge;
    private LocalDate dateTimeCreated; // Exact UTC moment that event was created
    private LocalDate registrationStart;
    private LocalDate registrationEnd;
    private LocalDate startDateTime;
    private LocalDate endDateTime;

    public Event () {
    }

    public Event (
}

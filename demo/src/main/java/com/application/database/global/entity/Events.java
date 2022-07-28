package com.application.database.global.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.*;
@Entity
public class Events implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int EID;

    private int OID; // UserID who organised the event

    private String eventName;
    private int maxCapacity;
    private String eventLocation;
    private int minAge;
    private Instant dateTimeCreated; // Exact UTC moment that event was created
    private LocalDate registrationStart;
    private LocalDate registrationEnd;
    private LocalDate startDate;
    private LocalDate endDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private String roles;

    private String type;
    private String description;
    private String imageURL = "https://digitaldefynd.com/wp-content/uploads/2020/07/Best-Abstract-Art-course-tutorial-class-certification-training-online-scaled.jpg";
    public Events () {
    }

    public Events (String eventName, int maxCapacity, String eventLocation, int minAge, LocalDate registrationStart,
                   LocalDate registrationEnd, LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime) {
        this.eventName = eventName;
        this.maxCapacity = maxCapacity;
        this.eventLocation = eventLocation;
        this.minAge = minAge;
        this.dateTimeCreated = Instant.now();
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public Events (String eventName, int maxCapacity, String eventLocation, int minAge, LocalDate registrationStart,
                   LocalDate registrationEnd, LocalDate startDate, LocalDate endDate, String imageURL, LocalTime startTime, LocalTime endTime, String roles) {
        this.eventName = eventName;
        this.maxCapacity = maxCapacity;
        this.eventLocation = eventLocation;
        this.minAge = minAge;
        this.dateTimeCreated = Instant.now();
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;
        this.startDate = startDate;
        this.endDate= endDate;
        this.imageURL = imageURL;
        this.startTime = startTime;
        this.endTime = endTime;
        this.roles = roles;
    }
    public int getEID() {
        return EID;
    }
    public int getOID() {
        return OID;
    }
    public String getEventName() {return eventName; }
    public int getMaxCapacity() {
        return maxCapacity;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public int getMinAge() {
        return minAge;
    }
    public Instant getDateTimeCreated() {
        return dateTimeCreated;
    }
    public LocalDate getRegistrationStart() { return registrationStart; }
    public LocalDate getRegistrationEnd() {
        return registrationEnd;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }

    public String getDescription() { return description; }

    public String getImageURL() { return imageURL; }

    public String getType() { return type; }
    public String toString() {
        return String.format("EID=<%d>, OID=<%d>, Event Name=<%s>, Maximum Capacity=<%d>, Event Location=<%s>, Minimum Age=<%d>, ", EID, OID, eventName, maxCapacity, eventLocation, minAge);
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getRoles() {
        return roles;
    }
}

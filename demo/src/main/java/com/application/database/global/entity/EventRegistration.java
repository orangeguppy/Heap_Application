package com.application.database.global.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class EventRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ERID;

    private int UID; // user participating in the event

    private int EID; // event registered for

    private Instant dateTimeRegistered; // time the event was registered for

    private String role; // role the user plays in the event

    public EventRegistration() {}

    public EventRegistration(int UID, int EID, String role) {
        this.UID = UID;
        this.EID = EID;
        this.role = role;
    }

    public int getERID() {
        return ERID;
    }

    public int getUID() {
        return UID;
    }

    public int getEID() {
        return EID;
    }

    public Instant getDateTimeRegistered() {
        return dateTimeRegistered;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
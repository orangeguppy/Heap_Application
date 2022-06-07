package com.application.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth; // User's birthday, in UTC
    private String emailAddress;
    private int mobileNumber;
    private Instant dateTimeRegistered; // Exact UTC moment the user registered a new account

    private LocalDate dateRegistered; // date registered in UTC

    public User() {
    }
    public User(String firstName, String lastName, ZonedDateTime dateOfBirth, String emailAddress, int mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.dateTimeRegistered = Instant.now();
        this.dateRegistered = LocalDate.ofInstant(dateTimeRegistered, ZoneId.of("Etc/UTC"));

        // Converting birthday to UTC date at 12am
        // UTC DateTime
        ZonedDateTime utc = dateOfBirth.withZoneSameInstant(ZoneId.of("Etc/UTC"));
        this.dateOfBirth = utc.toLocalDate();
    }

    public int getAge() {
        LocalDate dateNowInUTC = LocalDate.ofInstant(Instant.now(), ZoneId.of("Etc/UTC"));
        return Period.between(dateOfBirth, dateNowInUTC).getYears();
    }
    public String toString() {
        return String.format("UID=<%d> Name=<%s %s> %d ", UID, firstName, lastName, getAge());
    }
}
package com.application.database.global.entity;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name="user")
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

    // Login details
    private String userName;

    private String password;

    public User() {
    }
    public User(String firstName, String lastName, String userName, String password, ZonedDateTime dateOfBirth, String emailAddress, int mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.dateTimeRegistered = Instant.now();
        this.dateRegistered = LocalDate.ofInstant(dateTimeRegistered, ZoneId.of("Etc/UTC"));

        // Converting birthday to UTC date at 12am
        // UTC DateTime
        ZonedDateTime utc = dateOfBirth.withZoneSameInstant(ZoneId.of("Etc/UTC"));
        this.dateOfBirth = utc.toLocalDate();
    }

    public int getUID() {
        return UID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public Instant getDateTimeRegistered() {
        return dateTimeRegistered;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public int getAge() {
        LocalDate dateNowInUTC = LocalDate.ofInstant(Instant.now(), ZoneId.of("Etc/UTC"));
        return Period.between(dateOfBirth, dateNowInUTC).getYears();
    }
    @Override
    public String toString() {
        return String.format("UID=<%d> Name=<%s %s> %d ", UID, firstName, lastName, getAge());
    }
}
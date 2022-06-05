package com.application.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int UID;
    private String firstName;
    private String lastName;

    // private LocalDate dateOfBirth;
    private String emailAddress;
    private int mobileNumber;
    // private Date dateTimeRegistered; // Date the user registered a new account

    public User() {
        this.UID = 0;
        this.firstName = null;
        this.lastName = null;
        this.emailAddress = null;
        this.mobileNumber = 0;
    }
    public User(int UID, String firstName, String lastName, String emailAddress, int mobileNumber) {
        this.UID = UID;
        this.firstName = firstName;
        this.lastName = lastName;
        // this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        // this.dateTimeRegistered = dateTimeRegistered;
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

//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

//    public Date getDateTimeRegistered() {
//        return dateTimeRegistered;
//    }
}
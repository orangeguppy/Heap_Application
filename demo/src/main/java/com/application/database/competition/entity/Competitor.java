package com.application.database.competition.entity;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Entity
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CID;
    private int UID; // original unique UID of Competitor
    private Instant dateTimeRegistered; // Exact UTC moment the competitor registered a new account
    private LocalDate dateRegistered; // date registered in UTCcTimeRegistered datetime not null

    public Competitor() {
    }

    public Competitor(int UID) {
        this.UID = UID;
        this.dateTimeRegistered = Instant.now();
        this.dateRegistered = LocalDate.ofInstant(dateTimeRegistered, ZoneId.of("Etc/UTC"));
    }

    public int getCID() {
        return CID;
    }

    public int getUID() {
        return UID;
    }
}
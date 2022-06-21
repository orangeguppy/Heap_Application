package com.application.database.entity.competition;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
public class Competitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CID;

    private String cName; // name of competitor
    private int UID; //user who registered this competitor

    private Instant dateTimeRegistered; // Exact UTC moment the competitor registered a new account
    private LocalDate dateRegistered; // date registered in UTCcTimeRegistered datetime not null

    public Competitor() {
    }

    public Competitor(String cName, int UID) {
        this.cName = cName;
        this.UID = UID;
    }

    public int getCID() {
        return CID;
    }

    public int getUID() {
        return UID;
    }
}
package com.application.database.competition.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competition {
    @Id
    private int EID; // event ID
    private int WID; // winner ID
    public Competition() {
    }

    public Competition(int EID) {
        this.EID = EID;
    }

    public int getEID() {
        return EID;
    }

    public int getWID() {
        return WID;
    }

    public void setWID(int WID) { // set the winner
        this.WID = WID;
    }
}
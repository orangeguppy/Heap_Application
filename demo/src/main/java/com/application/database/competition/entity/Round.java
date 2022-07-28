package com.application.database.competition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roundID; // not used

    private int EID;
    private String roundName;
    private String description;

    public Round () {
    }

    public Round (String roundName, String description) {
        this.roundName = roundName;
        this.description = description;
    }

    public int getEID() {
        return EID;
    }

    public String getRoundName() {
        return roundName;
    }

    public String getDescription() {
        return description;
    }

}

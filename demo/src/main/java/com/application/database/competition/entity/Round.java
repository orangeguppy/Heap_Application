package com.application.database.competition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Round {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roundID;
    private String roundName;
    private String description;

    public Round () {
    }

    public Round (String roundName, String description) {
        this.roundName = roundName;
        this.description = description;
    }
}

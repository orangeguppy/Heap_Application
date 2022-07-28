package com.application.database.competition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scoreID; // not used

    private int EID;

    private int UID;

    private int roundName;
    private int score;

    public Score() {
        this.score = 0;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore () {return score;}
}

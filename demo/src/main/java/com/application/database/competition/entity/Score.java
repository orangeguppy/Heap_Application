package com.application.database.competition.entity;

import javax.persistence.Entity;

@Entity
public class Score {
    private int score;

    public Score() {
    }

    public Score(int score) {
        this.score = score;
    }

    public int getScore () {return score;}
}

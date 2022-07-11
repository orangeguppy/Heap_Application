package com.application.database.competition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attendanceID;
    private boolean attendance;

    public Attendance () {
        this.attendance = false;
    }

    public void setAttendance (boolean attendance) {
        this.attendance = attendance;
    }

}

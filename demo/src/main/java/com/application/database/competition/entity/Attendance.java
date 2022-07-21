package com.application.database.competition.entity;

import com.application.database.global.entity.Events;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;

@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attendanceID;
    
    private boolean attendance;

    public Attendance () {
        this.attendance = false;
    }

    public Attendance(boolean attendance) {
        this.attendance = attendance;
    }
    public void setAttendance (boolean attendance) {
        this.attendance = attendance;
    }
    public boolean getAttendance() {
        return attendance;
    }

}

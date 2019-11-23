package com.company.t4.logic;

import com.company.t4.main.Time;

public class TimeLogic {
    public void setHours(Time time, int hours) {
        if(hours > Time.getMaxMinutes()) {
            time.setHours(0);
        } else if (hours == Time.getMaxHours() && time.getMinutes() == 0) {
            time.setHours(0);
        } else {
            time.setHours(hours);
        }
    }

    public void setMinutes(Time time, int minutes) {
        if(minutes > Time.getMaxMinutes()) {
            time.setMinutes(0);
        } else {
            time.setMinutes(minutes);
        }
    }

    public void setSeconds(Time time, int seconds) {
        if(seconds > Time.getMaxSeconds()) {
            time.setSeconds(0);
        } else {
            time.setSeconds(seconds);
        }
    }
}

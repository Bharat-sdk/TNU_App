package com.makertech.tnustudentapp.data.local;

public class DailyTimeTable {
    String subject , period_time;

    public DailyTimeTable(String subject, String period_time) {
        this.subject = subject;
        this.period_time = period_time;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPeriod_time() {
        return period_time;
    }

    public void setPeriod_time(String period_time) {
        this.period_time = period_time;
    }
}

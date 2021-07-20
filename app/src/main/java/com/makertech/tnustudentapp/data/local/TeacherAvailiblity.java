package com.makertech.tnustudentapp.data.local;

public class TeacherAvailiblity {
    String teacher_name;
    boolean available;

    public TeacherAvailiblity(String teacher_name, boolean available) {
        this.teacher_name = teacher_name;
        this.available = available;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

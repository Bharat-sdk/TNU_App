package com.makertech.tnustudentapp.data.local;

public class AttendanceListData {
    String student_name;
    Boolean present_absent ;

    public AttendanceListData(String student_name, Boolean present_absent) {
        this.student_name = student_name;
        this.present_absent = present_absent;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Boolean getPresent_absent() {
        return present_absent;
    }

    public void setPresent_absent(Boolean present_absent) {
        this.present_absent = present_absent;
    }
}

package com.makertech.tnustudentapp.data.local;

import java.util.ArrayList;
import java.util.List;

public class TeacherAvailiblityDataSource {
   public static List<TeacherAvailiblity> teacherAvailiblityList = new ArrayList<>();

   public static void preparedata()
    {
        TeacherAvailiblity teacherAvailiblity = new TeacherAvailiblity("Pranam Paul",true);
        teacherAvailiblityList.add(teacherAvailiblity);
        teacherAvailiblity = new TeacherAvailiblity("Bilas Haldar",true);
        teacherAvailiblityList.add(teacherAvailiblity);
        teacherAvailiblity = new TeacherAvailiblity("Ruchi Sharma",false);
        teacherAvailiblityList.add(teacherAvailiblity);
        teacherAvailiblity = new TeacherAvailiblity("Raj Zamal",true);
        teacherAvailiblityList.add(teacherAvailiblity);
        teacherAvailiblity = new TeacherAvailiblity("Bharat Kumar",false);
        teacherAvailiblityList.add(teacherAvailiblity);

    }

}

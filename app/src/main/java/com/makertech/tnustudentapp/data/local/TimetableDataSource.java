package com.makertech.tnustudentapp.data.local;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimetableDataSource {
   static Map <String,List<DailyTimeTable>> routineMapping = new HashMap<>();

    public static void addRoutineToMap()
    {
        routineMapping.put("monday",createMondayRoutine());
        routineMapping.put("tuesday",createTuesdayRoutine());
        routineMapping.put("wednesday",createWednesdayRoutine());
        routineMapping.put("thursday",createThursdayRoutine());
        routineMapping.put("friday",createFridayRoutine());

    }

    public static List<DailyTimeTable> returnList(String key)
    {
        return routineMapping.get(key);
    }

      static List<DailyTimeTable>  createMondayRoutine()
    {
        List<DailyTimeTable> mondayTimeTable = new ArrayList<>();
        DailyTimeTable sub1 = new DailyTimeTable("DBMS","10:00 AM - 12:00 AM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("C++ ","12:00 AM - 02:00 PM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("Computer Graphics","02:00 PM - 04:00 PM");
        mondayTimeTable.add(sub1);
        return mondayTimeTable;

    }
      static List<DailyTimeTable>  createTuesdayRoutine()
    {
        List<DailyTimeTable> mondayTimeTable = new ArrayList<>();
        DailyTimeTable sub1 = new DailyTimeTable("DBMS","10:00 AM - 12:00 AM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("C++ ","12:00 AM - 02:00 PM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("Computer Graphics","02:00 PM - 04:00 PM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("Computer Theory and Automata" ,"02:00 PM - 04:00 PM");
        mondayTimeTable.add(sub1);
        return mondayTimeTable;

    }
      static List<DailyTimeTable>  createWednesdayRoutine()
    {
        List<DailyTimeTable> mondayTimeTable = new ArrayList<>();
        DailyTimeTable sub1 = new DailyTimeTable("DBMS","10:00 AM - 12:00 AM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("C++ ","12:00 AM - 02:00 PM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("Computer Graphics","02:00 PM - 04:00 PM");
        mondayTimeTable.add(sub1);
        return mondayTimeTable;

    }
       static List<DailyTimeTable>  createThursdayRoutine()
    {
        List<DailyTimeTable> mondayTimeTable = new ArrayList<>();
        DailyTimeTable sub1 = new DailyTimeTable("DBMS","10:00 AM - 12:00 AM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("C++ ","12:00 AM - 02:00 PM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("Computer Graphics","02:00 PM - 04:00 PM");
        mondayTimeTable.add(sub1);
        return mondayTimeTable;

    }
       static List<DailyTimeTable>  createFridayRoutine()
    {
        List<DailyTimeTable> mondayTimeTable = new ArrayList<>();
        DailyTimeTable sub1 = new DailyTimeTable("DBMS","10:00 AM - 12:00 AM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("C++ ","12:00 AM - 02:00 PM");
        mondayTimeTable.add(sub1);
        sub1 = new DailyTimeTable("Computer Graphics","02:00 PM - 04:00 PM");
        mondayTimeTable.add(sub1);
        return mondayTimeTable;

    }

}


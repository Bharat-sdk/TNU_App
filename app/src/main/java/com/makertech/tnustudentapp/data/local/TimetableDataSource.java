package com.makertech.tnustudentapp.data.local;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimetableDataSource {
     Map<String,List<DailyTimeTable>> routineMapping = new HashMap<>();



    List<DailyTimeTable>  createMondayRoutine()
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


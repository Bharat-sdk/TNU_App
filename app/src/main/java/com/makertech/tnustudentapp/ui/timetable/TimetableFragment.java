package com.makertech.tnustudentapp.ui.timetable;

import android.content.Intent;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.DailyTimeTable;
import com.makertech.tnustudentapp.data.local.TimetableDataSource;
import com.makertech.tnustudentapp.databinding.ActivityWorkAttendanceDailysubjectsBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;

import java.util.List;

public class TimetableFragment extends BaseActivity<ActivityWorkAttendanceDailysubjectsBinding,TimetableViewModel> {

    TimetableDataSource timetableDataSource;
    @Override
    protected void initView() {
        Intent init = getIntent();
        String day = init.getStringExtra("day");
        TimetableAdapter timetableAdapter = new TimetableAdapter(prepareData(day.toLowerCase()));
        getViewBinding().dailyroutineRecyclerView.setAdapter(timetableAdapter);
        getSupportActionBar().setTitle(day+" TimeTable");

    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected TimetableViewModel initialViewModel() {
        return new TimetableViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_work_attendance_dailysubjects;
    }

    List<DailyTimeTable> prepareData(String key)
    {
      TimetableDataSource.addRoutineToMap();
     return TimetableDataSource.returnList(key);
    }
}

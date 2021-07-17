package com.makertech.tnustudentapp.ui.timetable;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.FragmentWorkAttendanceWeekdaysBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class WeekdaysFragment extends BaseActivity<FragmentWorkAttendanceWeekdaysBinding,WeekdaysViewModel> {
    @Override
    protected void initView() {
        WeekdayssAdapter weekdayssAdapter = new WeekdayssAdapter(prepareDay());
        getViewBinding().weekdaysRecyclerView.setAdapter(weekdayssAdapter);
    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected WeekdaysViewModel initialViewModel() {
        return new WeekdaysViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.fragment_work_attendance_weekdays;
    }

    List<String> prepareDay(){
        List<String> weekdaylist = new ArrayList<>();
        weekdaylist.add("Monday");
        weekdaylist.add("Tuesday");
        weekdaylist.add("Wednesday");
        weekdaylist.add("Thursday");
        weekdaylist.add("Friday");
        return weekdaylist;
     }
}

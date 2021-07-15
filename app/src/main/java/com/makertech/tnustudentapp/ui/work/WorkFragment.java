package com.makertech.tnustudentapp.ui.work;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.WorkData;
import com.makertech.tnustudentapp.databinding.FragmentStudentWorkBinding;
import com.makertech.tnustudentapp.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class WorkFragment extends BaseFragment<FragmentStudentWorkBinding,WorkViewModel> {
    @Override
    protected void initView() {
        prepareData();
        WorkAdapter workAdapter = new WorkAdapter(prepareData());
        getViewBinding().workRecyclerView.setAdapter(workAdapter);
    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected WorkViewModel initialViewModel() {
        return new WorkViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.fragment_student_work;
    }

    List<WorkData> prepareData()
    {
        List<WorkData> workDataList = new ArrayList<>();
        WorkData workData = new WorkData("Assignments");
        workDataList.add(workData);
        workData = new WorkData("Attendance");
        workDataList.add(workData);
        workData = new WorkData("TimeTable");
        workDataList.add(workData);
        workData = new WorkData("Teacher Availability");
        workDataList.add(workData);

        return workDataList;
    }
}

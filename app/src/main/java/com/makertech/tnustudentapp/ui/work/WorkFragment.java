package com.makertech.tnustudentapp.ui.work;

import android.content.Intent;
import android.view.View;

import androidx.databinding.library.baseAdapters.BR;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.WorkData;
import com.makertech.tnustudentapp.databinding.FragmentStudentWorkBinding;
import com.makertech.tnustudentapp.ui.base.BaseFragment;
import com.makertech.tnustudentapp.ui.timetable.TimetableFragment;
import com.makertech.tnustudentapp.ui.timetable.WeekdaysFragment;

import java.util.ArrayList;
import java.util.List;

public class WorkFragment extends BaseFragment<FragmentStudentWorkBinding,WorkViewModel> {
    @Override
    protected void initView() {
        getViewBinding().btnTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),WeekdaysFragment.class);
                startActivity(intent);
            }
        });
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


}

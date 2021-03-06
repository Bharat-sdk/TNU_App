package com.makertech.tnustudentapp.ui.work;

import android.content.Intent;
import android.view.View;

import androidx.databinding.library.baseAdapters.BR;


import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.FragmentStudentWorkBinding;
import com.makertech.tnustudentapp.ui.attendance.StudentAttendanceActivity;
import com.makertech.tnustudentapp.ui.availiblity.TeacherAvailiblityActivity;
import com.makertech.tnustudentapp.ui.base.BaseFragment;
import com.makertech.tnustudentapp.ui.timetable.WeekdaysFragment;

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

        getViewBinding().btnTeacheravailibality.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TeacherAvailiblityActivity.class);
                startActivity(intent);
            }
        });

        getViewBinding().btnAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), StudentAttendanceActivity.class);
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

    public void onResume() {
        super.onResume();
        //Set title of this fragment
        if (getActivity() != null) {
            getActivity().setTitle("Work");
        }
    }


}

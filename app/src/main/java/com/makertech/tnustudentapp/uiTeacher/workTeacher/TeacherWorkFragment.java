package com.makertech.tnustudentapp.uiTeacher.workTeacher;

import android.content.Intent;
import android.view.View;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.FragmentTeacherWorkBinding;
import com.makertech.tnustudentapp.ui.attendance.StudentAttendanceActivity;
import com.makertech.tnustudentapp.ui.availiblity.TeacherAvailiblityActivity;
import com.makertech.tnustudentapp.ui.base.BaseFragment;
import com.makertech.tnustudentapp.ui.timetable.WeekdaysFragment;

public class TeacherWorkFragment extends BaseFragment<FragmentTeacherWorkBinding,TeacherWorkViewModel> {
    @Override
    protected void initView() {
        getViewBinding().btnTimetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WeekdaysFragment.class);
                startActivity(intent);

            }
        });

        getViewBinding().btnTakeAttendance.setOnClickListener(new View.OnClickListener() {
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
    protected TeacherWorkViewModel initialViewModel() {
        return new TeacherWorkViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.fragment_teacher_work;
    }
}

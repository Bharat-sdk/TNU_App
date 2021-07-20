package com.makertech.tnustudentapp.ui.attendance;

import android.widget.ArrayAdapter;

import com.makertech.tnustudentapp.BR;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.ActivityStudentAttendanceBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;

public class StudentAttendanceActivity extends BaseActivity<ActivityStudentAttendanceBinding,StudentAttendanceViewModel> {
    String[] sub = { "DBMS", "C++", "JAVA", "Cyber Crime", "Economics"};

    @Override
    protected void initView() {
        ArrayAdapter subject_spinner_adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,sub);
        subject_spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        getViewBinding().spinnerSelectSubject.setAdapter(subject_spinner_adapter);
        getSupportActionBar().setTitle("Attendance");

    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected StudentAttendanceViewModel initialViewModel() {
        return new StudentAttendanceViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_student_attendance;
    }
}

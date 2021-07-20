package com.makertech.tnustudentapp.uiTeacher.attendanceTeacher;

import androidx.databinding.library.baseAdapters.BR;

import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.databinding.ActivityTeacherAttendanceBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;

public class TeacherAttendanceActivity extends BaseActivity<ActivityTeacherAttendanceBinding, TeacherAttendanceViewModel> {
    @Override
    protected void initView() {

    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected TeacherAttendanceViewModel initialViewModel() {
        return new TeacherAttendanceViewModel() ;
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_teacher_attendance;
    }
}

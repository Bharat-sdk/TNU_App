package com.makertech.tnustudentapp.ui.availiblity;

import com.makertech.tnustudentapp.BR;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.TeacherAvailiblityDataSource;
import com.makertech.tnustudentapp.databinding.ActivityTeacherAvailablityBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;

public class TeacherAvailiblityActivity extends BaseActivity<ActivityTeacherAvailablityBinding,TeacherAvailiblityViewModel> {

    @Override
    protected void initView() {
      TeacherAvailiblityDataSource.preparedata();
      TeacherAvailiblityAdapter teacherAvailiblityAdapter = new TeacherAvailiblityAdapter(TeacherAvailiblityDataSource.teacherAvailiblityList);
      getViewBinding().dailyroutineRecyclerView.setAdapter(teacherAvailiblityAdapter);
        getSupportActionBar().setTitle("Teacher Availiblity");
    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected TeacherAvailiblityViewModel initialViewModel() {
        return new TeacherAvailiblityViewModel();
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_teacher_availablity;
    }
}

package com.makertech.tnustudentapp.ui.availiblity;

import com.google.gson.Gson;
import com.makertech.tnustudentapp.BR;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.local.TeacherAvailiblityDataSource;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.ResponseTeacherAvailiblity;
import com.makertech.tnustudentapp.data.network.timetable.Response;
import com.makertech.tnustudentapp.databinding.ActivityTeacherAvailablityBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.utils.Utils;

public class TeacherAvailiblityActivity extends BaseActivity<ActivityTeacherAvailablityBinding,TeacherAvailiblityViewModel> {

    @Override
    protected void initView() {
        String str = Utils.getJsonFromAssets(getApplicationContext(),"teacheravailiblityjson.json");
        Gson gson = new Gson();
        ResponseTeacherAvailiblity responseTeacherAvailiblity = gson.fromJson(str,ResponseTeacherAvailiblity.class);
      TeacherAvailiblityAdapter teacherAvailiblityAdapter = new TeacherAvailiblityAdapter(responseTeacherAvailiblity.getTeacherAvaiibality());
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

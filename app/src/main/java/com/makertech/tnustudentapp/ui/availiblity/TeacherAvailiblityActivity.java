package com.makertech.tnustudentapp.ui.availiblity;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.Observer;

import com.google.gson.Gson;
import com.makertech.tnustudentapp.BR;
import com.makertech.tnustudentapp.R;
import com.makertech.tnustudentapp.data.api.apiClient.AppApiClient;
import com.makertech.tnustudentapp.data.api.repository.AppRepositoryImplementation;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvaiibalityItem;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvailiblityList;
import com.makertech.tnustudentapp.databinding.ActivityTeacherAvailablityBinding;
import com.makertech.tnustudentapp.ui.base.BaseActivity;
import com.makertech.tnustudentapp.utils.Utils;

import java.util.List;

public class TeacherAvailiblityActivity extends BaseActivity<ActivityTeacherAvailablityBinding,TeacherAvailiblityViewModel> {
    AppRepositoryImplementation appRepositoryImplementation;
    TeacherAvailiblityAdapter teacherAvailiblityAdapter;
    List<TeacherAvaiibalityItem> teacherAvaiibalityItemList;
    @Override
    protected void initView() {
        AppApiClient apiClient = new AppApiClient();
         appRepositoryImplementation = new AppRepositoryImplementation(apiClient.getService());
         setObserver();
        TeacherAvailiblityViewModel myviewmodel = new TeacherAvailiblityViewModel(appRepositoryImplementation);
         myviewmodel.getList();
       // teacherAvailiblityAdapter = new TeacherAvailiblityAdapter(teacherAvaiibalityItemList);
      //  getViewBinding().dailyroutineRecyclerView.setAdapter(teacherAvailiblityAdapter);
        getSupportActionBar().setTitle("Teacher Availiblity");
    }

    private void setObserver() {
       initialViewModel().getGetTeacherAvaiibality().observe(this, new Observer<List<TeacherAvaiibalityItem>>() {
           @Override
           public void onChanged(List<TeacherAvaiibalityItem> teacherAvaiibalityItems) {
               if (teacherAvaiibalityItems != null)
               {
                   Toast.makeText(TeacherAvailiblityActivity.this,"Size"+teacherAvaiibalityItems.size(),Toast.LENGTH_SHORT).show();

               }
               else {
                   Toast.makeText(TeacherAvailiblityActivity.this,"Null Value Of List",Toast.LENGTH_SHORT).show();
                   Log.d("List" , " NULL ");

               }

           }
       });
    }

    @Override
    protected Integer getBindingVariable() {
        return BR._all;
    }

    @Override
    protected TeacherAvailiblityViewModel initialViewModel() {
        return new TeacherAvailiblityViewModel(appRepositoryImplementation);
    }

    @Override
    protected Integer getLayoutId() {
        return R.layout.activity_teacher_availablity;
    }
}

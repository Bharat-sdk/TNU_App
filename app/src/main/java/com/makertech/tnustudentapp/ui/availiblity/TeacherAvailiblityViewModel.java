package com.makertech.tnustudentapp.ui.availiblity;

import androidx.lifecycle.MutableLiveData;

import com.makertech.tnustudentapp.data.api.repository.AppRepository;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvaiibalityItem;
import com.makertech.tnustudentapp.ui.base.BaseViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeacherAvailiblityViewModel extends BaseViewModel {
    private MutableLiveData<List<TeacherAvaiibalityItem>> getTeacherAvaiibality;
    public TeacherAvailiblityViewModel(AppRepository appRepository) {
        super(appRepository);
        getTeacherAvaiibality = new MutableLiveData<>();
    }

    public MutableLiveData<List<TeacherAvaiibalityItem>> getGetTeacherAvaiibality() {
        return getTeacherAvaiibality;
    }

    public void getList()
    {
        getAppRepository().getTeacherAvailiblityList().enqueue(new Callback<List<TeacherAvaiibalityItem>>() {
            @Override
            public void onResponse(Call<List<TeacherAvaiibalityItem>> call, Response<List<TeacherAvaiibalityItem>> response) {
                getTeacherAvaiibality.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<TeacherAvaiibalityItem>> call, Throwable t) {
                getTeacherAvaiibality.postValue(null);
            }
        });
    }


}

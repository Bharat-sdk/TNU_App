package com.makertech.tnustudentapp.data.api.repository;

import com.makertech.tnustudentapp.data.api.ApiService;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvaiibalityItem;

import java.util.List;

import retrofit2.Call;

public class AppRepositoryImplementation implements AppRepository {
    ApiService apiService;

    public AppRepositoryImplementation(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Call<List<TeacherAvaiibalityItem>> getTeacherAvailiblityList() {
        return apiService.getTeacherAvailiblityList();
    }
}

package com.makertech.tnustudentapp.data.api;

import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvaiibalityItem;
import com.makertech.tnustudentapp.data.network.teacheravailiblity.TeacherAvailiblityList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("teacherAvaiiblity")
    Call<List<TeacherAvaiibalityItem>> getTeacherAvailiblityList();

}

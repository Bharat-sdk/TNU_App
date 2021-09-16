package com.makertech.tnustudentapp.data.api.apiClient;

import com.makertech.tnustudentapp.data.api.ApiConstants;
import com.makertech.tnustudentapp.data.api.ApiService;

import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppApiClient {
    public OkHttpClient getOkHttpClient()
    {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();

        return  okHttpClient;
    }


    Retrofit retrofit = new Retrofit.Builder()
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ApiConstants.BASE_URL)
            .build();

    private ApiService service = retrofit.create(ApiService.class);

    public ApiService getService() {
        return service;
    }
}

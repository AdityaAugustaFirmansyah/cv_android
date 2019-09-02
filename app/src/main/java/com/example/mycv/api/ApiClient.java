package com.example.mycv.api;

import retrofit2.Retrofit;

public class ApiClient {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();


    public ApiService apiService = retrofit.create(ApiService.class);
}

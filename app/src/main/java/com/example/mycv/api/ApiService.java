package com.example.mycv.api;

import com.example.mycv.portfolio.GithubModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("users/AdityaAugustaFirmansyah/repos")
    Call<ArrayList<GithubModel>>githubModels();
}

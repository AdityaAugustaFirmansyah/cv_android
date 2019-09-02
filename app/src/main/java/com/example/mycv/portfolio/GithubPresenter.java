package com.example.mycv.portfolio;


import com.example.mycv.api.ApiClient;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GithubPresenter {
    GithubContractView githubContractView;
    GithubPresenter(GithubContractView githubContractView1){
        githubContractView = githubContractView1;
    }

    public void index(){
        Call<ArrayList<GithubModel>> listCall = new ApiClient().apiService.githubModels();
        listCall.enqueue(new Callback<ArrayList<GithubModel>>() {
            @Override
            public void onResponse(Call<ArrayList<GithubModel>> call, Response<ArrayList<GithubModel>> response) {
                githubContractView.listRepo(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<GithubModel>> call, Throwable t) {

            }
        });
    }
}

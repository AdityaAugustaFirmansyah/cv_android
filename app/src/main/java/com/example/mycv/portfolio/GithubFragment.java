package com.example.mycv.portfolio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mycv.R;

import java.util.ArrayList;
import java.util.Objects;

public class GithubFragment extends Fragment implements GithubContractView{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_github, container, false);
    }

    @Override
    public void listRepo(ArrayList<GithubModel> githubModels) {
        RecyclerView recyclerView = Objects.requireNonNull(getView()).findViewById(R.id.rv_github_portfolio);
        recyclerView.setLayoutManager(Li);
    }
}

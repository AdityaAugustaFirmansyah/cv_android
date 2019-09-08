package com.example.mycv.appsinfo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mycv.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllFeatureFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_feature, container, false);
        rvAllFeature(view);
        return view;
    }

    private void rvAllFeature(View view){
        RecyclerView recyclerViewAllFeature = view.findViewById(R.id.rv_all_feature_info);
        recyclerViewAllFeature.setLayoutManager(new LinearLayoutManager(getContext()));
        AllFeatureAdapter allFeatureAdapter = new AllFeatureAdapter();
        allFeatureAdapter.setAllFeatureModels(AllFeatureDummy.models());
        recyclerViewAllFeature.setAdapter(allFeatureAdapter);
    }
}

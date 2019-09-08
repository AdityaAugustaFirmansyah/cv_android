package com.example.mycv.appsinfo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mycv.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class AppsInfoActivity extends AppCompatActivity {

    ArrayList<Fragment>fragments = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_info);

        TabLayout tabLayoutAppsInfo = findViewById(R.id.tab_layout_apps_info);
        ViewPager viewPagerAppsInfo = findViewById(R.id.view_pager_apps_info);
        fragments.add(new AppsInfoFragment());
        fragments.add(new PictureFragment());
        fragments.add(new AllFeatureFragment());
        viewPagerAppsInfo.setAdapter(new AppsInfoFragmentAdapter(getSupportFragmentManager(),fragments));
        tabLayoutAppsInfo.setupWithViewPager(viewPagerAppsInfo);
    }
}

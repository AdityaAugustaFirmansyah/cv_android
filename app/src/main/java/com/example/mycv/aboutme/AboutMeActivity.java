package com.example.mycv.aboutme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;


import com.example.mycv.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class AboutMeActivity extends AppCompatActivity {
    ArrayList<Fragment> fragments = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Toolbar toolbar = (Toolbar)find(R.id.toolbar_about_me);
        setSupportActionBar(toolbar);
        final CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapse_about_me);
        collapsingToolbarLayout.setTitle("about me");
        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, android.R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, android.R.color.transparent));
        fragments.add(new DescAboutFragment());
        fragments.add(new EducationAboutFragment());
        FragmentAboutAdapter fragmentAboutAdapter = new FragmentAboutAdapter(getSupportFragmentManager(),fragments);
        TabLayout tabLayout = (TabLayout) find(R.id.tab_layout_about_me);

        final ViewPager pager = (ViewPager) find(R.id.view_pager_about_me);
        pager.setAdapter(fragmentAboutAdapter);
        tabLayout.setupWithViewPager(pager);
    }

    public View find(int view){
        return findViewById(view);
    }
}

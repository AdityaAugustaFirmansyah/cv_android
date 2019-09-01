package com.example.mycv.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mycv.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class PortfolioActivity extends AppCompatActivity {

    ArrayList<Fragment>fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        fragments.add(new WebPortfolioFragment());
        fragments.add(new GithubFragment());
        createFragment(fragments);
    }

    private void createFragment(ArrayList<Fragment>fragmentArrayList){
        ViewPager viewPager = findViewById(R.id.view_pager_portfolio);
        PortfolioFragmentAdapter portfolioFragmentAdapter = new PortfolioFragmentAdapter(
                getSupportFragmentManager(),
                fragmentArrayList);
        viewPager.setAdapter(portfolioFragmentAdapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout_portfolio);
        tabLayout.setupWithViewPager(viewPager);
    }
}

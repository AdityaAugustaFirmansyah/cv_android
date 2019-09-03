package com.example.mycv.portfolio;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PortfolioFragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment>fragments;

    public PortfolioFragmentAdapter(FragmentManager fm,ArrayList<Fragment>fragmentArrayList) {
        super(fm);
        fragments = fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new WebPortfolioFragment();
            case 1:
                return new GithubFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "web";
            case 1:
                return "list repo github";
            default:
                return null;
        }
    }
}

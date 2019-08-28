package com.example.mycv.appsinfo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class AppsInfoFragmentAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment>fragments;
    public AppsInfoFragmentAdapter(FragmentManager fm,ArrayList<Fragment> fragmentArrayList) {
        super(fm);
        fragments = fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                new AboutMeInfoFragment();
            case 1:
                new SkillInfoFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

package com.example.mycv.aboutme;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class FragmentAboutAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    FragmentAboutAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        fragmentArrayList = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DescAboutFragment();
            case 1:
                return new EducationAboutFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "About";
            case 1:
                return "Education";
                default:
                    return null;
        }
    }
}

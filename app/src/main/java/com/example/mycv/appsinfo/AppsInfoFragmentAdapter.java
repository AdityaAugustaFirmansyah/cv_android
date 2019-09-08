package com.example.mycv.appsinfo;

import androidx.annotation.Nullable;
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
                return new AppsInfoFragment();
            case 1:
                return new PictureFragment();
            case 2:
                return new AllFeatureFragment();
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
                return "Apps Info";
            case 1:
                return "Image Apps";
            case 2:
                return "material / library";
            default:
                return null;
        }
    }
}

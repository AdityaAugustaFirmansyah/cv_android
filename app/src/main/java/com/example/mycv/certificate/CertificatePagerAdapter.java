package com.example.mycv.certificate;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class CertificatePagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment>fragments;
    public CertificatePagerAdapter(FragmentManager fm,ArrayList<Fragment> fragmentArrayList) {
        super(fm);
        fragments = fragmentArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AndroidFragment();
            case 1:
                return new WebFragment();
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
                return "Android";
            case 1:
                return "Web";
                default:
                    return null;
        }
    }
}

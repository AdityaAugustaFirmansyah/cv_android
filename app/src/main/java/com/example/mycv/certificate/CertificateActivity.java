package com.example.mycv.certificate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.mycv.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class CertificateActivity extends AppCompatActivity {
    ArrayList<Fragment>fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        fragments.add(new AndroidFragment());
        fragments.add(new WebFragment());
        createFragmentAdapter();
    }

    private void createFragmentAdapter(){
        CertificatePagerAdapter certificatePagerAdapter = new CertificatePagerAdapter(getSupportFragmentManager(),
                fragments);
        TabLayout tabLayout = findViewById(R.id.tab_layout_certificate);
        ViewPager viewPager = findViewById(R.id.view_pager_certificate);
        viewPager.setAdapter(certificatePagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

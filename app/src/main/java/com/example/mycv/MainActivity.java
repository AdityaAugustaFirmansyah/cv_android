package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mycv.aboutme.AboutMeActivity;
import com.example.mycv.appsinfo.AppsInfoActivity;
import com.example.mycv.certificate.CertificateActivity;
import com.example.mycv.contact.ContactActivity;
import com.example.mycv.portfolio.PortfolioActivity;
import com.example.mycv.skill.SkillActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(this, AboutMeActivity.class);
        final Intent intentSkill = new Intent(this, SkillActivity.class);
        final Intent intentCertificate = new Intent(this, CertificateActivity.class);
        final Intent intentContact = new Intent(this, ContactActivity.class);
        final Intent intentPortfolio = new Intent(this, PortfolioActivity.class);
        final Intent intentAppsInfo = new Intent(this, AppsInfoActivity.class);

        find(R.id.linear_about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        find(R.id.linear_skill).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentSkill);
            }
        });
        find(R.id.linear_certificate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentCertificate);
            }
        });
        find(R.id.linear_contact).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentContact);
            }
        });
        find(R.id.linear_portfolio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPortfolio);
            }
        });
        find(R.id.linear_apps_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentAppsInfo);
            }
        });
    }

    public  View find(int view){
        return findViewById(view);
    }
}

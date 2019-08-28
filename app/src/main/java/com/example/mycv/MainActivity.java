package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mycv.aboutme.AboutMeActivity;
import com.example.mycv.certificate.CertificateActivity;
import com.example.mycv.contact.ContactActivity;
import com.example.mycv.skill.SkillActivity;

import java.security.cert.Certificate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent = new Intent(this, AboutMeActivity.class);
        final Intent intentSkill = new Intent(this, SkillActivity.class);
        final Intent intentCertificate = new Intent(this, CertificateActivity.class);
        final Intent intentContact = new Intent(this, ContactActivity.class);

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
    }

    public  View find(int view){
        return findViewById(view);
    }
}

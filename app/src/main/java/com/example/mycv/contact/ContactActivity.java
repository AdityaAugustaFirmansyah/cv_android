package com.example.mycv.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.mycv.R;

public class ContactActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        WebView webView = findViewById(R.id.web_view_maps);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        String html = "<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d12533.790534377214!2d106.88116035861545!3d-6.389276272149641!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2e69eb684e9c8c79%3A0xd113a46e1b75fcfe!2zNsKwMjMnMjguOSJTIDEwNsKwNTMnMTIuMCJF!5e0!3m2!1sen!2sid!4v1566736742346!5m2!1sen!2sid\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\"></iframe>";
        webView.loadData(html,"text/html",null);
    }
}

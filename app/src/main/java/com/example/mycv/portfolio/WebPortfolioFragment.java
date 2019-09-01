package com.example.mycv.portfolio;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;

import com.example.mycv.R;

public class WebPortfolioFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_web_portfolio, container, false);
        createWebView(view);
        return view;
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void createWebView(View view){
        WebView webView = view.findViewById(R.id.web_view_portfolio);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://adityaaugustafirmansyah.github.io/profile_web/");
    }
}

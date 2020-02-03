package com.vishal.webviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebView_Activity extends AppCompatActivity {

    public static final String USER_AGENT_FAKE = "Mozilla/5.0 (Linux; Android 4.1.1; " +
            "Galaxy Nexus Build/JRO03C) AppleWebKit/535.19 (KHTML, like Gecko) " +
            "Chrome/18.0.1025.166 Mobile Safari/535.19";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        Intent intent = getIntent();
        String webSiteName = intent.getStringExtra("websiteName");

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.setPadding(0, 0, 0, 0);
        webView.setInitialScale(1);
        webView.setHorizontalScrollBarEnabled(true);
        webView.setVerticalScrollBarEnabled(true);
        WebSettings settings = webView.getSettings();

        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setUserAgentString(USER_AGENT_FAKE);
        settings.setJavaScriptEnabled(true);

        webView.loadUrl("http://www."+webSiteName);
    }

}

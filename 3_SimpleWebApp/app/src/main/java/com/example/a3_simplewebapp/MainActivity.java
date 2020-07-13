package com.example.a3_simplewebapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    WebView webView;
    WebSettings webSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Snackbar.make(view, view.getUrl().toString(), Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
                return super.shouldOverrideUrlLoading(view, request);
            }
        });

        webSettings = webView.getSettings();
        webSettings.setDisplayZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://github.com");
    }
}
package com.apple.weatherinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new Weather());
        // webview에 url을 끼워넣을 객체를 하나 지정
        // url을 끼워넣어주는 객체를 webViewClient
        // 사이트를 액티비티에 끼워넣었을 때
        // 여러 설정을 따로 해주어야 한다
        // 여러 설정만을 담당하는 객체를 사용한다
        WebSettings webSet = webView.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        webSet.setAllowContentAccess(true);
        webSet.setAppCacheEnabled(true);
        webSet.setDomStorageEnabled(true);
        webSet.setUseWideViewPort(true);
        webSet.setAllowFileAccess(true);
        webSet.setAllowFileAccessFromFileURLs(true);

        webView.loadUrl("https://www.weather.go.kr/w/index.do");
    }
}

class Weather extends WebViewClient {
    // 오버라이드
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return super.shouldOverrideUrlLoading(view, url);
    }
}

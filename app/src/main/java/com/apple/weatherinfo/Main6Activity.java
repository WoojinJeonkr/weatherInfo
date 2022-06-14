package com.apple.weatherinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main6Activity extends AppCompatActivity {

    WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        webView2 = findViewById(R.id.webview2);

        webView2.setWebViewClient(new ShoppingMall());
        // webview에 url을 끼워넣을 객체를 하나 지정
        // url을 끼워넣어주는 객체를 webViewClient
        // 사이트를 액티비티에 끼워넣었을 때
        // 여러 설정을 따로 해주어야 한다
        // 여러 설정만을 담당하는 객체를 사용한다
        WebSettings webSet = webView2.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        webSet.setAllowContentAccess(true);
        webSet.setAppCacheEnabled(true);
        webSet.setDomStorageEnabled(true);
        webSet.setUseWideViewPort(true);
        webSet.setAllowFileAccess(true);
        webSet.setAllowFileAccessFromFileURLs(true);

        webView2.loadUrl("http://ec2-3-38-100-74.ap-northeast-2.compute.amazonaws.com:8080/ShoppingMall/memberCre.jsp");
    }
}

class ShoppingMall extends WebViewClient {
    // 오버라이드
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return super.shouldOverrideUrlLoading(view, url);
    }
}
package com.apple.weatherinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    Button m1, m2, m3, m4, m5, m6, m7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m3 = findViewById(R.id.m3);
        m4 = findViewById(R.id.m4);
        m5 = findViewById(R.id.m5);
        m6 = findViewById(R.id.m6);
        m7 = findViewById(R.id.m7);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent
                        = new Intent(Main4Activity.this,
                        Main5Activity.class
                );
                startActivity(intent);
            }
        }); // 클릭 시 webview 형태로 한국 기상청 페이지가 보여지는 페이지로 이동

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.weather.gov/")
                );
                startActivity(intent);
            }
        }); // 클릭 시 미국 기상청 사이트로 이동

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.jma.go.jp/jma/index.html")
                );
                startActivity(intent);
            }
        }); // 클릭 시 일본 기상청 사이트로 이동

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.cma.gov.cn/")
                );
                startActivity(intent);
            }
        }); // 클릭 시 중국 기상청 사이트로 이동

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.metoffice.gov.uk/")
                );
                startActivity(intent);
            }
        }); // 클릭 시 영국 기상청 사이트로 이동

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://meteofrance.com/")
                );
                startActivity(intent);
            }
        }); // 클릭 시 프랑스 기상청 사이트로 이동

        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://public.wmo.int/en")
                );
                startActivity(intent);
            }
        }); // 클릭 시 세계기상기구 WMO 사이트로 이동
    }
}

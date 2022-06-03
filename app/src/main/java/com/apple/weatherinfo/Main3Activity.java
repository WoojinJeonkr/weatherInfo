package com.apple.weatherinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    ImageView imageView3;
    Button w1, w2, w3, w4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView3 = findViewById(R.id.imageView3);
        w1 = findViewById(R.id.w1);
        w2 = findViewById(R.id.w2);
        w3 = findViewById(R.id.w3);
        w4 = findViewById(R.id.w4);

        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://m.youtube.com/channel/UCI110BywhJpYRC1XY_rSMiQ")
                );
                startActivity(intent);
            }
        }); // 클릭 시 날씨 해설로 이동

        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://blog.naver.com/kma_131")
                );
                startActivity(intent);
            }
        }); // 클릭 시 날씨 소통망 blog로 이동

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.kma.go.kr/kma/news/photo.jsp")
                );
                startActivity(intent);
            }
        }); // 클릭 시 포토 뉴스로 이동

        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.kma.go.kr/kma/news/press.jsp")
                );
                startActivity(intent);
            }
        }); // 클릭 시 보도 자료로 이동
    }
}

package com.apple.weatherinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView2;
    EditText t1;
    Button s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView2 = findViewById(R.id.imageView2);
        t1 = findViewById(R.id.t1);
        s1 = findViewById(R.id.s1);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 검색어 utf-8로 인코딩
                String home="";
                try {
                    home = URLEncoder.encode(t1.getText().toString(), "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/search?q=" + home +"+날씨")
                );
             startActivity(intent);
            }
        });
    }
}

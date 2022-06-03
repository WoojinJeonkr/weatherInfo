package com.apple.weatherinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent
                        = new Intent(MainActivity.this,
                        Main4Activity.class
                );
                startActivity(intent);
            }
        }); // 클릭 시 기상청 홈페이지 이동 페이지로 이동

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent
                        = new Intent(MainActivity.this,
                        Main2Activity.class
                );
                startActivity(intent);
            }
        }); // 클릭 시 동네 입력 페이지로 이동

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent
                        = new Intent(MainActivity.this,
                        Main3Activity.class
                );
                startActivity(intent);
            }
        }); // 클릭 시 기상청 유튜브 이동 페이지로 이동

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        }); // 클릭 시 앱에서 나가짐
    }
}

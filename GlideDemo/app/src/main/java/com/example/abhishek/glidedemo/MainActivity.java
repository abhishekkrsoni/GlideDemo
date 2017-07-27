package com.example.abhishek.glidedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.imageView);
        Button button=(Button)findViewById(R.id.button);//http://goo.gl/gEgYUd
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(getApplicationContext())
                        .load("http://2.bp.blogspot.com/-wazaLZaCE1w/V7BPt3rcy2I/AAAAAAAAAIc/NZRzCy_Ly8UsH93y_wUYlx7wNsgw3lcngCK4B/s1600/Indian-flag-images-free.jpeg")
                        .placeholder(R.drawable.loading_img)
                        .into(imageView);
            }
        });
    }
}

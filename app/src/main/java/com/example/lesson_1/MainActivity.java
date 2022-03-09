package com.example.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView imageCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageCar=findViewById(R.id.image_car);
        Glide.with(imageCar).load("https://i.pinimg.com/474x" +
                "/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(imageCar);
    }
}
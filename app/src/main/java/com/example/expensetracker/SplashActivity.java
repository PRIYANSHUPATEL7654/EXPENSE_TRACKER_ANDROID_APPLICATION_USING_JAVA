package com.example.expensetracker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView imageView = findViewById(R.id.splash);

        // Load the GIF into the ImageView using Glide
        Glide.with(this).asGif().load(R.drawable.a).into(imageView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(splash);
                finish();
            }
        },4000);
    }

    private void into(ImageView imageView) {
    }
}
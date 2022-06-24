package com.example.fooduidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.security.PrivateKey;

public class SplashScreenActivity extends AppCompatActivity {

  private  static  final int activity_splash_screen_time_out =1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

    initView();

    }

    private void initView() {


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =  new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },activity_splash_screen_time_out);
    }
}
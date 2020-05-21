package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class Main2Activity extends AppCompatActivity {

    LottieAnimationView animation;
    int flag = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        int SPLASH_SCREEN_TIME_OUT = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Main2Activity.this,
                        MainActivity.class);

                startActivity(i);
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }

}



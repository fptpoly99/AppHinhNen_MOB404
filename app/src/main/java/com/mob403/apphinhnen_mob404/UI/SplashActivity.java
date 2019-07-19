package com.mob403.apphinhnen_mob404.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.mob403.apphinhnen_mob404.R;

public class SplashActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent (SplashActivity.this, MainActivity.class);
                startActivity(i);

                finish ();
            }
        }, SPLASH_TIME_OUT);
    }
}

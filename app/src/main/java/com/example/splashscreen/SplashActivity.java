package com.example.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private final int waktu_loading = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah Loading akan langsung pindah ke Home Activity
                Intent home = new Intent(SplashActivity.this, AfterSplashActivity.class);
                startActivity(home);
                finish();

            }
        }, waktu_loading);
    }
}

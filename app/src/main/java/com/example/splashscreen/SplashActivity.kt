package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val waktu_loading = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed
            val home = Intent(this@SplashActivity, AfterSplashActivity::class.java)
            startActivity(home)
            finish()
        }, waktu_loading.toLong())
    }
}

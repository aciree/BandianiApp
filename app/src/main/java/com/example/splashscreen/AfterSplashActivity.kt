package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AfterSplashActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_splash)

        val exploreButton: Button = findViewById(R.id.exploreButton)
        val profileButton: Button = findViewById(R.id.profileButton)

        exploreButton.setOnClickListener(this)
        profileButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.exploreButton -> {
                val moveIntent = Intent(this, MainActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.profileButton -> {
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

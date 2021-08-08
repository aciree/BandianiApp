package com.example.splashscreen

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailTanamanActivity : AppCompatActivity() {

    var list: ArrayList<Tanaman> = arrayListOf()

    companion object {

        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_plant)

        val dtlName: TextView = findViewById(R.id.detail_name)
        val dtlDesc: TextView = findViewById(R.id.detail_desc)
        val dtlImg: ImageView = findViewById(R.id.detail_img)

        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val desc = intent.getStringExtra(EXTRA_DESC)

        dtlName.text = name
        dtlDesc.text = desc
        dtlImg.setImageResource(img)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}
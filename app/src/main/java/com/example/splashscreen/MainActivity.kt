package com.example.splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvTanaman: RecyclerView
    private var list: ArrayList<Tanaman> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTanaman = findViewById(R.id.rv_plants)
        rvTanaman.setHasFixedSize(true)

        list.addAll(TanamanData.listData)
        showRecylerList()
    }

    private fun showRecylerList() {
        rvTanaman.layoutManager = LinearLayoutManager(this)
        val listTanamanAdapter = ListTanamanAdapter(list)
        rvTanaman.adapter = listTanamanAdapter
    }
}
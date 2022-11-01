package com.example.prayer_app.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prayer_app.R

import com.example.prayer_app.R.layout.activity_main
import com.example.prayer_app.R.layout.quran

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(quran)

//        val btn = findViewById<Button>(R.id.button)
//        btn.setOnClickListener {
//            startActivity(Intent(this@MainActivity, bismillah_act::class.java))
//        }
    }
//
}
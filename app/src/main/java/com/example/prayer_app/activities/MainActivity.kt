package com.example.prayer_app.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.prayer_app.R

import com.example.prayer_app.R.layout.activity_main
import com.example.prayer_app.R.layout.quran

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

//        val btn = findViewById<Button>(R.id.button)
//        btn.setOnClickListener {
//            startActivity(Intent(this@MainActivity, bismillah_act::class.java))
//        }
        val btn = findViewById<Button>(R.id.firstStart)
        btn.setOnClickListener(this)
    }
    override fun onClick (view: View) {
        when (view.id) {
            R.id.firstStart -> {
                val mainfirts = Intent(this@MainActivity, home_act::class.java)
                startActivity(mainfirts)
            }
        }
    }
//
}
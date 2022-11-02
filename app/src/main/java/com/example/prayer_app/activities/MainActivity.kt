package com.example.prayer_app.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prayer_app.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val btn = findViewById<Button>(R.id.firstStart)
//        btn.setOnClickListener {
//            startActivity(Intent(this@MainActivity, BismillahActivity::class.java))
//        }
    }
//    override fun onClick (view: View) {
//        when (view.id) {
//            R.id.firstStart -> {
//                val mainfirts = Intent(this@MainActivity, home_act::class.java)
//                startActivity(mainfirts)
//            }
//        }
//    }
//
}
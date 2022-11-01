package com.example.prayer_app.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.prayer_app.R

class bismillah_act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bismillah)


        val bsh = findViewById<Button>(R.id.StartBismillah)
        bsh.setOnClickListener {
            startActivity(Intent(this@bismillah_act, quran_page_activity::class.java))
        }
    }
}
package com.mz.profilesisgu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val Intent = Intent(  this, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}
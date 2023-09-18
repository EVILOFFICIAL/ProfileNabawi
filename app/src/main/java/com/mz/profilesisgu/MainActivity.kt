package com.mz.profilesisgu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent(  this, MainActivity2::class.java)
            startActivity(Intent)
        }
        val buttonn = findViewById<Button>(R.id.button3)
        buttonn.setOnClickListener {
            val Intent = Intent(  this, MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}
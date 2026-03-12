package com.example.androidbackstack

import android.content.Intent
import android.os.Bundle
import android.provider.LiveFolders.INTENT
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnScreen1=findViewById<Button>(R.id.btnScreen1)
        btnScreen1.setOnClickListener {
            val intent= Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }

    }
}
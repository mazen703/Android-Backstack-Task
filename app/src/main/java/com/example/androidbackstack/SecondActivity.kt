package com.example.androidbackstack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        var btnScreen2=findViewById<Button>(R.id.btnScreen2)
        btnScreen2.setOnClickListener {
            val intent= Intent(this, ThirdActivity::class.java)
            startActivity(intent)

        }

    }
}
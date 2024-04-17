package com.example.cdamut

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new)

        val button2 = findViewById<Button>(R.id.start_activity3);
        button2.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
        var action = intent.action

    }
}

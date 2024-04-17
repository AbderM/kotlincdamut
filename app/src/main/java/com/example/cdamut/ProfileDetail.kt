package com.example.cdamut

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class ProfileDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val profile: Profile? = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            Log.i("Probleme", "Je suis dans le tiramisu")
            intent.getParcelableExtra("profile", Profile::class.java)
        } else {
            Log.i("Probleme", "je suis depreciate")
            intent.getParcelableExtra("profile")
        }

        val nameTextView = findViewById<TextView>(R.id.name)
        val ageTextView = findViewById<TextView>(R.id.age)

        nameTextView.setText("Nom : ${profile?.name} ")
        ageTextView.setText("age : ${profile?.age} ")
    }
}
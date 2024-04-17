package com.example.cdamut

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.start_new_activity);
        button.setOnClickListener{
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }

        val btnAction = findViewById<Button>(R.id.start_new_action)
        btnAction.setOnClickListener{
            val intent = Intent(this, ActionActivity::class.java)
            intent.action = Intent.ACTION_VIEW
            intent.addCategory("user")
            intent.putExtra("name", "Alban")
            intent.putExtra("age", 24)
            startActivity(intent)
        }

        //Parcelable
        val profile = Profile("Alban", 25)
        val btnParcelable = findViewById<Button>(R.id.my_profile)
        btnParcelable.setOnClickListener{
            val intent = Intent(this, ProfileDetail::class.java)
            intent.putExtra("profile", profile)
            startActivity(intent)
        }

        //log
        Log.v(TAG, "Verbose message")
        Log.d(TAG, "Message Debug")
        Log.i(TAG, "Message Info")
        Log.w(TAG, "Message Warning")
        Log.e(TAG, "Message Error")
        Log.println(Log.ASSERT, TAG, "Alerte Message")
    }
}

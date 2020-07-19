package com.example.weatherapp

import android.content.Intent
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_city.*

class City : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city)

        val button = findViewById<Button>(R.id.SetCity)
        button?.setOnClickListener()
        {
            val Loc: EditText = findViewById<EditText>(R.id.Location);
            val SetLoc: String = Loc.toString();
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NewLoc", "SetLoc");
            Log.d("New loc: ", SetLoc);
            startActivity(intent)
        }
    }
}

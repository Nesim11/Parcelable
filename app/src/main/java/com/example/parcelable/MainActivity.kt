package com.example.parcelable

import android.content.Intent


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

  companion object {
    const val USER = "user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User( "nesim",   "qqqq", PersonalInfo("Nesim", "Alma"))
        val button = findViewById<View>(R.id.button)

         

        button.setOnClickListener{
            val intent = Intent (this, Activity2::class.java)
            intent.putExtra(USER, user)
            startActivity(intent)
        }
    }
}
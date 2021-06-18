package com.example.parcelable



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.TextView


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val textView = findViewById<View>(R.id.textView)

          intent?.let {
            val user= intent.extras.getParcelable(MainActivity.USER)!! as User
            textView.text = user.toString()
        }
    }
}

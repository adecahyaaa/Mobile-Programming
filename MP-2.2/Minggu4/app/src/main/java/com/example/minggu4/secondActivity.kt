package com.example.minggu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        supportActionBar?.setTitle("Halaman Kedua")

        val messageTextView = findViewById<TextView>(R.id.textView)
        val message = intent.getStringExtra((MainActivity.EXTRA_MESSAGE))
        messageTextView.text = message
    }
}
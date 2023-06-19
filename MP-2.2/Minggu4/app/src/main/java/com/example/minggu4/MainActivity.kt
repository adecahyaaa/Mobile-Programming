package com.example.minggu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "com.example.Minggu4.extra.MESSAGE"
    }

    private val LOG_TAG = MainActivity::class.simpleName
    private var messageEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
//        supportActionBar?.setTitle("Halaman Pertama")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageEditText = findViewById(R.id.editText_main)
//        val intent = Intent(this, secondActivity::class.java)
//        startActivity(intent)
    }

    fun launchsecondActivity(view: View) {
        Log.d(LOG_TAG, "tombol diklik")

        val message: String = messageEditText?.text.toString()

        val intent = Intent(this, secondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}
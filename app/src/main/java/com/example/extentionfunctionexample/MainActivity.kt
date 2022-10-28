package com.example.extentionfunctionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("GOOD")

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            openFragment(BlankFragment.newInstance())
        }
    }
}
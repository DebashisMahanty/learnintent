package com.example.iteradmin.learnintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text = findViewById<TextView>(R.id.textView2)
        val button =findViewById<Button>(R.id.button2)
        val i =intent
        text.setText(i.getStringExtra("name"))

        button2.setOnClickListener{
            finish()

        }
    }
}

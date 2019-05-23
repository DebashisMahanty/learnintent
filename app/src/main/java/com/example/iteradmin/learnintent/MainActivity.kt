package com.example.iteradmin.learnintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.iteradmin.learnintent.R.id.button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val EditText = findViewById<EditText>(R.id.name)
        val Button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

        val s: String = name.text.toString()
        val i = Intent(applicationContext, Main2Activity::class.java)
        i.putExtra("textView", s)
        startActivity(i)
    }

    }
}

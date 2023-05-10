package com.example.customtoast

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.btn)
         val cl=findViewById<ConstraintLayout>(R.id.cl)


        btn.setOnClickListener {

            Toast(this).apply {
                duration=Toast.LENGTH_SHORT
                view=layoutInflater.inflate(R.layout.customtoast,cl)
                show()

            }
        }
    }
}
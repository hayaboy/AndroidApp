package com.green.firstmyapp1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnNaver : Button
    lateinit var btn911 : Button
    lateinit var btnEnd : Button




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)

        btnNaver=findViewById<Button>(R.id.btnNaver)
        btn911=findViewById<Button>(R.id.btn911)
        btnEnd=findViewById<Button>(R.id.btnEnd)


        btnNaver.setBackgroundColor(Color.GREEN)


        btnNaver.setOnClickListener{
            var nIntent=Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"))
            startActivity(nIntent)
        }




    }
}
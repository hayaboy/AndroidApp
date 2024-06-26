package com.green.myapp1_1

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Double
import kotlin.Any
import kotlin.String
import kotlin.toString

class MainActivity : AppCompatActivity() {


    lateinit var edit1: EditText;   lateinit var edit2 : EditText
    lateinit var btnAdd : Button;   lateinit var btnSub : Button
    lateinit var btnMul : Button;   lateinit var btnDiv : Button
    lateinit var textResult : TextView
    lateinit var num1:String;    lateinit var num2 : String
    var result:Any?=null

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main3)

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnSub = findViewById<Button>(R.id.BtnSub)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)
        textResult = findViewById<TextView>(R.id.TextResult)

//        btnAdd.setOnTouchListener { view, motionEvent ->
//            num1= edit1.text.toString()
//            num2= edit2.text.toString()
//            result = Integer.parseInt(num1) + Integer.parseInt(num2)
//
//
//            textResult.text="Result는 " + result.toString()
//            false
//        }

        btnAdd.setOnClickListener {
            num1= edit1.text.toString()
            num2= edit2.text.toString()

            if (num1.trim () == "" || num2.trim() == "") {
                Toast.makeText(applicationContext, "입력 값이 빔", Toast.LENGTH_LONG).show()
            }else{
                Log.i("num", num1)
                Log.i("num", num2.trim())
                result = Integer.parseInt(num1.trim ()) + Integer.parseInt(num2.trim ())
               textResult.text="Result는 " + result.toString()
            }

        }




        btnSub.setOnTouchListener { view, motionEvent ->
            num1= edit1.text.toString()
            num2= edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)

            textResult.text="Result는 " + result.toString()
            false
        }

        btnMul.setOnTouchListener { view, motionEvent ->
            num1= edit1.text.toString()
            num2= edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)

            textResult.text="Result는 " + result.toString()
            false
        }


        btnDiv.setOnTouchListener { view, motionEvent ->
            num1= edit1.text.toString()
            num2= edit2.text.toString()
            Log.i("multiply", num1)
            Log.i("multiply", num2)
            result = Double.parseDouble(num1) / Double.parseDouble(num2)

//            String.format("%.2f", result)

            textResult.text="Result는 " + String.format("%.2f", result)
            false
        }

    }
}
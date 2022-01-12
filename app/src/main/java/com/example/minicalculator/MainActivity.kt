package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1.setOnClickListener {
            val n1 = a1.text.toString().toInt()
            val n2 = a2.text.toString().toInt()
            val sum = n1 + n2
            total.setText("$sum")
            c1.setText("+")
        }
        
        b2.setOnClickListener{
                val n1 = a1.text.toString().toInt()
                val n2 = a2.text.toString().toInt()
                val sum = n1-n2
                total.setText("$sum")
                c1.setText("-")
        }

        b3.setOnClickListener{
            val n1 = a1.text.toString().toInt()
            val n2 = a2.text.toString().toInt()
            val sum = n1*n2
            total.setText("$sum")
            c1.setText("*")
        }

        b4.setOnClickListener{
            val n1 = a1.text.toString().toInt()
            val n2 = a2.text.toString().toInt()
            val sum = n1/n2
            total.setText("$sum")
            c1.setText("/")
        }

        b5.setOnClickListener{
            val n1 = a1.text.toString().toInt()
            val n2 = a2.text.toString().toInt()
            val sum = n1%n2
            total.setText("$sum")
            c1.setText("%")
        }

        b6.setOnClickListener{
           a1.setText("")
           a2.setText("")
           c1.setText("")
           total.setText("")
        }
    }
}
package com.example.luissancar.apli01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            sumar()
        }

    }


    fun sumar() {
        var a :Int
        a=datoa.text.toString().toInt()
        val b=editText2.text.toString().toInt()
        resultado.text=(a+b).toString()



    }
}

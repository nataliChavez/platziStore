package com.example.morpheus.platzistore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtHello.text = "Hola Android Extensions"

        toastShort("Mensaje toast corto")

        fun ViewGroup.inflate(layoutId:Int): View
        {
            return LayoutInflater.from(context).inflate(layoutId,this,false)
        }
    }
}

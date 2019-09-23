package com.example.morpheus.platzistore

import android.app.Activity
import android.widget.Toast

fun Activity.toastShort(mensaje: String)
{
    Toast.makeText(this, mensaje,Toast.LENGTH_SHORT).show()
}

fun Activity.toastLong(mensaje: String)
{
    Toast.makeText(this, mensaje,Toast.LENGTH_LONG).show()
}
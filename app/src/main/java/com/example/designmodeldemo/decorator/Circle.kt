package com.example.designmodeldemo.decorator

import android.util.Log

class Circle : IShape {
    override fun draw() {
        Log.i("test","draw a Circle")
    }
}
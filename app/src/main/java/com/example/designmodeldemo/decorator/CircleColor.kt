package com.example.designmodeldemo.decorator

import android.util.Log

class CircleColor constructor( ishape: IShape) : CircleDecortor(ishape) {
    override fun draw() {
        super.draw()
        drawColor()
    }
    private fun drawColor(){
        Log.i("test","draw color")
    }
}
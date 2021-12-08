package com.example.designmodeldemo.factory.simplefactory

import android.util.Log
import com.example.designmodeldemo.factory.simplefactory.Car

class QQCar : Car {
    override fun driver() {
        Log.i("test", "driver slow")
    }
}
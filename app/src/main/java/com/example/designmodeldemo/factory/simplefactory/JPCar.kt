package com.example.designmodeldemo.factory.simplefactory

import android.util.Log
import com.example.designmodeldemo.factory.simplefactory.Car

//吉普车
class JPCar : Car {
    override fun driver() {
        Log.i("test", "driver fast")
    }
}
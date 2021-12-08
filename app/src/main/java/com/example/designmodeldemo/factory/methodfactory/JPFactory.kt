package com.example.designmodeldemo.factory.methodfactory

import com.example.designmodeldemo.factory.simplefactory.Car
import com.example.designmodeldemo.factory.simplefactory.JPCar

class JPFactory : AbstractFactory {
    override fun createCar(): Car {
        return JPCar()
    }
}
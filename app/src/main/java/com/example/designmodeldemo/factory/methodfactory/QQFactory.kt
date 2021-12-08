package com.example.designmodeldemo.factory.methodfactory

import com.example.designmodeldemo.factory.simplefactory.Car
import com.example.designmodeldemo.factory.simplefactory.QQCar

class QQFactory : AbstractFactory {
    override fun createCar(): Car {
        return QQCar()
    }
}
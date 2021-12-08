package com.example.designmodeldemo.factory.simplefactory

class CarFactory {
    fun createCar(type:String):Car{
        val car:Car;
        when (type){
            "JPCar" -> car=JPCar()
            "QQCar" -> car=QQCar()
            else -> car=QQCar()
        }
        return car;
    }
}
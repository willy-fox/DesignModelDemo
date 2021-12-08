package com.example.designmodeldemo.factory.methodfactory

import com.example.designmodeldemo.factory.simplefactory.Car

//工厂的抽象
interface AbstractFactory {
    fun createCar():Car
}
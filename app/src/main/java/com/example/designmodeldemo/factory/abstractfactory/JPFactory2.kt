package com.example.designmodeldemo.factory.abstractfactory

import com.example.designmodeldemo.factory.simplefactory.Car
import com.example.designmodeldemo.factory.simplefactory.JPCar

class JPFactory2 :MoreTypeAbstractFactory {
    override fun createCar(): Car? {
        return JPCar()
    }
    //这个工厂说我不生产Pen
    override fun createPen(): Pen? {
        return null;
    }
}
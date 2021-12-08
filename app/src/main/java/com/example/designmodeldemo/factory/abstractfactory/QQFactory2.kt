package com.example.designmodeldemo.factory.abstractfactory

import com.example.designmodeldemo.factory.simplefactory.Car
import com.example.designmodeldemo.factory.simplefactory.QQCar

class QQFactory2 : MoreTypeAbstractFactory {
    override fun createCar(): Car? {
        return QQCar()
    }

    override fun createPen(): Pen? {
        return WoodPen()
    }
}
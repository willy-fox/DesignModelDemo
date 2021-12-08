package com.example.designmodeldemo.factory.abstractfactory

import com.example.designmodeldemo.factory.simplefactory.Car

interface MoreTypeAbstractFactory {
    fun createCar(): Car?
    fun createPen(): Pen?
}
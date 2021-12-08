package com.example.designmodeldemo.factory.simplefactory

//汽车的抽象接口，定义car的动作，具体实现交由子类实现
interface Car {
    //提供驾驶方法，具体怎么驾驶由具体子类实现
    fun driver()
}
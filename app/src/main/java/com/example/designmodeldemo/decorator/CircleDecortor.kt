package com.example.designmodeldemo.decorator

//装饰器抽象
abstract class CircleDecortor constructor(ishape:IShape) :IShape {
    protected val shape:IShape=ishape

    override fun draw() {
        shape.draw()
    }
}
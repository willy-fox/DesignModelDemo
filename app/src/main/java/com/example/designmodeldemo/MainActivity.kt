package com.example.designmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.designmodeldemo.factory.abstractfactory.JPFactory2
import com.example.designmodeldemo.factory.methodfactory.AbstractFactory
import com.example.designmodeldemo.factory.methodfactory.JPFactory
import com.example.designmodeldemo.factory.simplefactory.Car
import com.example.designmodeldemo.factory.simplefactory.CarFactory
import com.example.designmodeldemo.factory.simplefactory.JPCar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    /**
     * 工厂模式
     * 简单工厂模式（simplefactory）
     * 用户需要提供产品的元信息，根据元信息，工厂返回产品对象。
     * 工厂方法模式（methodfactory）
     * 不需要我们再提供产品的元信息，因为工厂本身就已经跟具体产品绑定了
     * 将生成具体产品的任务分发给具体的产品工厂
     * 抽象工厂模式（abstractfactory）
     *
     */
    public fun initSimpleFactory(){
        //拿到具体对象
        val car= CarFactory().createCar("JPCar") ;
        car.driver()
    }
    public fun initMethodFactory(){
        val carFactory : AbstractFactory = JPFactory()
        carFactory.createCar().driver();
    }
    public fun initAbstractFactory(){
        val factory=JPFactory2()
        factory.createCar()?.driver()
        factory.createPen()?.write()
    }
}
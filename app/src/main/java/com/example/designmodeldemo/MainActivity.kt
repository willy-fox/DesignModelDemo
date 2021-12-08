package com.example.designmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.designmodeldemo.adapter.classadapter.Adapter
import com.example.designmodeldemo.adapter.classadapter.IClient
import com.example.designmodeldemo.adapter.objectadapter.ObjAdapter
import com.example.designmodeldemo.decorator.Circle
import com.example.designmodeldemo.decorator.CircleColor
import com.example.designmodeldemo.factory.abstractfactory.JPFactory2
import com.example.designmodeldemo.factory.methodfactory.AbstractFactory
import com.example.designmodeldemo.factory.methodfactory.JPFactory
import com.example.designmodeldemo.factory.simplefactory.Car
import com.example.designmodeldemo.factory.simplefactory.CarFactory
import com.example.designmodeldemo.factory.simplefactory.JPCar
import com.example.designmodeldemo.proxy.ProService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    /**
     * 工厂模式
     * 简单工厂模式（simplefactory）:一个工厂方法创建不同类型的对象
     * 用户需要提供产品的元信息，根据元信息，工厂返回产品对象。
     * 工厂方法模式（methodfactory）:一个具体的工厂类负责创建一个具体对象类型
     * 不需要我们再提供产品的元信息，因为工厂本身就已经跟具体产品绑定了
     * 将生成具体产品的任务分发给具体的产品工厂
     * 抽象工厂模式（abstractfactory）:一个具体的工厂类负责创建一系列相关的对象
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
    /**
     * 代理模式：为其他对象提供一种代理以控制对这个对象的访问
     * 特点：隔离
     */
    public fun initProService(){
        val pro=ProService("local")
        pro.visit()
    }
    /**
     * 装饰器模式：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式相比生成子类更加灵活
     * 特点：增强
     */
    public fun initDecortor(){
        val circle : Circle= Circle();
        circle.draw()
        val circleColor=CircleColor(circle);
        circleColor.draw()
    }
    /**
     * 适配器模式：把一个类的接口变换成客户端所期待的另一个接口，从而使原本因接口不匹配而无法工作的两个类能够在一起工作
     * 类适配器：通过继承，调用父类实现接口
     * 对象适配器：通过持有适配对象，调用方法实现接口
     */
    public fun initAdapter(){
        val client:IClient=Adapter()
        client.request()
    }
    public fun initObjAdapter(){
        val client:IClient=ObjAdapter()
        client.request()
    }
}
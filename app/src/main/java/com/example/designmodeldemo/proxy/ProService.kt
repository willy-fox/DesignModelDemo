package com.example.designmodeldemo.proxy

class ProService constructor(name:String): Service {
    private val realService:RealServer= RealServer(name)
    override fun visit() {
        realService.visit()
    }
}
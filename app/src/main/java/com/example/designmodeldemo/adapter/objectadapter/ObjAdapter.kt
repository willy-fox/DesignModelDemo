package com.example.designmodeldemo.adapter.objectadapter

import com.example.designmodeldemo.adapter.classadapter.BeAdapter
import com.example.designmodeldemo.adapter.classadapter.IClient

class ObjAdapter : IClient {
    private val adapter=BeAdapter()
    override fun request() {
        adapter.adapteRequest()
    }
}
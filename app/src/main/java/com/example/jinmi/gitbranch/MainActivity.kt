package com.example.jinmi.gitbranch

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
       // startActivity(Intent(this,NaviActivity::class.java))
        startActivity(Intent(this,ScrollingActivity::class.java))

    }
    fun init(){
        val list= (1..10).toList()
    }
}

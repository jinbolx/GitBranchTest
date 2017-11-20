package com.example.jinmi.gitbranch

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        startActivity(Intent(this,NaviActivity::class.java))
        Toast.makeText(this,"main",Toast.LENGTH_SHORT).show()
        Log.i("","")
    }
   
}

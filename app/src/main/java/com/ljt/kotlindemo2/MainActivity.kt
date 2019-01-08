package com.ljt.kotlindemo2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_main = tv_main
        btn_main.setOnClickListener{
            Toast.makeText(this,"按钮点击了。。。",Toast.LENGTH_SHORT).show();
        }

    }
}

package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Userlist = arrayListOf<User>(
        User(R.drawable.android, name: "홍드", age: "28", greet: "안녕하세"),
        User(R.drawable.android, name: "자바", age: "28", greet: "안녕하세"),
        User(R.drawable.android, name: "자바스크립트", age: "28", greet: "안녕하세"),
        User(R.drawable.android, name: "코틀린", age: "28", greet: "안녕하세"),
        User(R.drawable.android, name: "스위프트", age: "28", greet: "안녕하세"),
        User(R.drawable.android, name: "안드로이드", age: "28", greet: "안녕하세"),
        User(R.drawable.android, name: "리액트", age: "28", greet: "안녕하세")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과","배", "딸기", "키위", "홍드로이")
//        contect란 한 액티미티의 모든 정보를 담고 있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)



    }
}
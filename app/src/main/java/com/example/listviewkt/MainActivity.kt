package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    var Userlist = arrayListOf<User>(
//        User(R.drawable.android, name: "홍드", age: "28", greet: "안녕하세"),
//        User(R.drawable.android, name: "자바", age: "28", greet: "안녕하세"),
//        User(R.drawable.android, name: "자바스크립트", age: "28", greet: "안녕하세"),
//        User(R.drawable.android, name: "코틀린", age: "28", greet: "안녕하세"),
//        User(R.drawable.android, name: "스위프트", age: "28", greet: "안녕하세"),
//        User(R.drawable.android, name: "안드로이드", age: "28", greet: "안녕하세"),
//        User(R.drawable.android, name: "리액트", age: "28", greet: "안녕하세")
//    )

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "홍드로이드", "28", "안녕하세요"),
        User(R.drawable.android, "자바", "28", "바보"),
        User(R.drawable.android, "코틀린", "28", "하하하"),
        User(R.drawable.android, "C언오", "28", "ㅇㅀㅎ"),
        User(R.drawable.android, "안드로이드", "28", "2222"),
        User(R.drawable.android, "ㅇㅇㅇ", "28", "ㅇㅇ"),
        User(R.drawable.android, "ㅎㅎㅎ", "28", "안녕")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("사과","배", "딸기", "키위", "홍드로이")
//        contect란 한 액티미티의 모든 정보를 담고 있다.
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter


        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position ) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()



        }

    }
}
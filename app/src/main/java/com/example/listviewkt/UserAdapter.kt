package com.example.listviewkt

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter(val context: Context, val UserList: ArrayList<User>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(contect).inflate(R.layout.list_item_user, root: null)

        val profile = view.findViewById<ImageView>(R.id.iv_profile)
        val name = view.findViewById<TextView>(R.id.tv_name )
        val age = view.findViewById<TextView>(R.id.tv_age)
        val greet = view.findViewById<TextView>(R.id.tv_greet )

        val user = UserList[position]

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet

        return  view
    }

    override fun getItem(position: Int): Any {
        return  UserList[postion]

    }

    override fun getItemId(p0: Int): Long {
        return  0

    }

    override fun getCount(): Int {
        return UserList.size
    }

}
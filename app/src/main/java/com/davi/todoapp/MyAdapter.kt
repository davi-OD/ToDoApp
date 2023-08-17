package com.davi.todoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class MyAdapter(val context:Context, val list: ArrayList<ChatModel>):BaseAdapter() {
    // gets the number of elements in the list
    override fun getCount(): Int {
        return list.size
    }
    // gets a single element from the list, p0 (position) is the index
    override fun getItem(position: Int): Any {
        return list[position]
    }
    // gets the id of the elements in the list
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    // gets ui and loads it on the list view

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null)

        val name = view.findViewById<TextView>(R.id.name)
        val message = view.findViewById<TextView>(R.id.message)
        val date = view.findViewById<TextView>(R.id.date)
        val image = view.findViewById<ImageView>(R.id.image)

        name.text = list[position].name
        message.text = list[position].message
        date.text = list[position].date
        image.setImageResource(list[position].image)

        return view
    }

}
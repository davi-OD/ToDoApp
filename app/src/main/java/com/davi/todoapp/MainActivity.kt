package com.davi.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davi.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val list = List<ChatModel>(10, {ChatModel()})
        val list = ArrayList<ChatModel>()
        list.add(ChatModel(R.drawable.ic_launcher_background, "David One", "Hello, how are you?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_background, "David Two", "Hello, how are you?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_background, "David Three", "Hello, how are you?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_background, "David Four", "Hello, how are you?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_background, "David Five", "Hello, how are you?", "Yesterday"))
        list.add(ChatModel(R.drawable.ic_launcher_background, "David Six", "Hello, how are you?", "Yesterday"))

        val myAdapter = MyAdapter(this, list)
        val listView = binding.myList
        listView.adapter = myAdapter

//        binding.myList.adapter = myAdapter
    }
}
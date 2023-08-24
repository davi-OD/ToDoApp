package com.davi.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.davi.todoapp.data.ActivityModel
import com.davi.todoapp.data.ActivityStatus
import com.davi.todoapp.data.MyActivityAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.ic_launcher_background, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_foreground, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_background, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_foreground, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_background, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_foreground, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_background, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_foreground, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_background, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.ic_launcher_foreground, "Check Mails", "5:35 am", "Check and reply important email concerning sales, meetings and more", ActivityStatus.Pending))

        val activityAdapter = MyActivityAdapter(this,list)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = activityAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.layoutManager = GridLayoutManager(this,2)
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
    }
}
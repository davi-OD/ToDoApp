package com.davi.todoapp.data

data class ActivityModel(
    val image: Int = 1,
    var activityName: String ="",
    var activityTime: String ="",
    var activityDescription: String="",
    var activityStatus: ActivityStatus = ActivityStatus.Pending
)
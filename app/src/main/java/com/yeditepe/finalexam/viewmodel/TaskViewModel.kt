package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf


class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    var taskList = mutableStateListOf(

        Task(1, "Learn FastAPI", false),
        Task(2, "Learn PyTorch", false),
        Task(3, "Learn ASp.Net", false)
    )





    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        var task = taskList.find {it.id == taskId}

        task?.isCompleted = !task.isCompleted
    }
}

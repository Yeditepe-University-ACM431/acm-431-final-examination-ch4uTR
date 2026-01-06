package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        // TODO 2: Convert TaskDto list to Task list

        val dtos = api.getTasks()
        var tasks = ArrayList<Task>()

        for (dto in dtos){
            var task = Task(dto.id, dto.title, dto.completed)
            tasks.add(task)
        }

        return tasks

        return TODO("Provide the return value")
    }
}

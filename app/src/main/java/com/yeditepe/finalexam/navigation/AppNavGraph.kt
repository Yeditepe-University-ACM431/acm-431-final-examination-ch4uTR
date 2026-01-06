package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yeditepe.finalexam.ui.TaskDetailScreen
import com.yeditepe.finalexam.ui.TaskListScreen
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yeditepe.finalexam.viewmodel.TaskViewModel
@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        var viewModel = TaskViewModel()
        composable("tasks") {
            TaskListScreen(viewModel = viewModel)
        }

        // TODO 2: Add composable for "taskDetail/{title}"
        composable("taskDetail/{title}") { backStackEntity ->
            val title = backStackEntity.arguments?.getString("title") ?: ""

            TaskDetailScreen(title)

        }
    }
}

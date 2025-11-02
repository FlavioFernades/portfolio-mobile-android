package com.example.meucartaodevisitas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.meucartaodevisitas.ui.screens.ProfileScreen
import com.example.meucartaodevisitas.ui.screens.ProjectListScreen
import com.example.meucartaodevisitas.ui.screens.ProjectDetailScreen

sealed class Screen(val route: String) {
    object Profile : Screen("profile")
    object ProjectList : Screen("project_list")
    object ProjectDetail : Screen("project_detail/{projectId}")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Profile.route) {
        composable(Screen.Profile.route) {
            ProfileScreen(navController)
        }
        composable(Screen.ProjectList.route) {
            ProjectListScreen(navController)
        }
        composable(
            route = Screen.ProjectDetail.route,
            arguments = listOf(navArgument("projectId") { type = NavType.IntType })
        ) { backStackEntry ->
            val projectId = backStackEntry.arguments?.getInt("projectId")
            projectId?.let { ProjectDetailScreen(projectId = it) }
        }
    }
}

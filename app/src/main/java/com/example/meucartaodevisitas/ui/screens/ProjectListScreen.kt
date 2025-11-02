package com.example.meucartaodevisitas.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.meucartaodevisitas.model.sampleProjects
import com.example.meucartaodevisitas.ui.components.ProjectCard

@Composable
fun ProjectListScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(sampleProjects, key = { it.id }) { project ->
            ProjectCard(project = project, navController = navController)
        }
    }
}

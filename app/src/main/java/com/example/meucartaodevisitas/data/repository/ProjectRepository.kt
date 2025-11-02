package com.example.meucartaodevisitas.data.repository

import com.example.meucartaodevisitas.data.local.ProjectDao
import com.example.meucartaodevisitas.data.remote.RetrofitInstance
import com.example.meucartaodevisitas.model.Project
import kotlinx.coroutines.flow.Flow

class ProjectRepository(private val projectDao: ProjectDao) {


    fun getAllProjects(): Flow<List<Project>> {
        return projectDao.getAllProjects()
    }


    suspend fun refreshProjects() {
        try {
            val apiProjects = RetrofitInstance.api.getProjects()

            projectDao.insertAll(apiProjects)
        } catch (e: Exception) {
            e.printStackTrace()

        }
    }
}

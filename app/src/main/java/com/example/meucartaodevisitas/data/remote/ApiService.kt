package com.example.meucartaodevisitas.data.remote


import com.example.meucartaodevisitas.model.Project
import retrofit2.http.GET

interface ApiService {
    @GET("users/FlavioFernandes/repos")
    suspend fun getProjects(): List<Project>
}

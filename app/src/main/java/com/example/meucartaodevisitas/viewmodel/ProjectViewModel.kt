package com.example.meucartaodevisitas.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.meucartaodevisitas.data.repository.ProjectRepository
import com.example.meucartaodevisitas.model.Project
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ProjectViewModel(private val repository: ProjectRepository) : ViewModel() {


    val projects: StateFlow<List<Project>> = repository.getAllProjects()
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Lazily,
            initialValue = emptyList()
        )

    fun refreshProjects() {
        viewModelScope.launch {
            repository.refreshProjects()
        }
    }
}

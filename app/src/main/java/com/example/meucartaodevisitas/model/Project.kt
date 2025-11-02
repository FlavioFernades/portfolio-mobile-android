package com.example.meucartaodevisitas.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "project")
data class Project(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val description: String
)

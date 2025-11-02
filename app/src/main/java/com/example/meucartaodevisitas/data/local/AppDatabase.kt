package com.example.meucartaodevisitas.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.meucartaodevisitas.model.Project

@Database(entities = [Project::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun projectDao(): ProjectDao
}

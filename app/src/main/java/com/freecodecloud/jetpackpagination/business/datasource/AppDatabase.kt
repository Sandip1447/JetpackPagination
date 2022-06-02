package com.freecodecloud.jetpackpagination.business.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.freecodecloud.jetpackpagination.business.datasource.cache.blog.BlogPostDao
import com.freecodecloud.jetpackpagination.business.datasource.cache.blog.BlogPostEntity


/**
 * Created by Sandip Rode
 * on 01-05-2022.
 */
@Database(entities = [BlogPostEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getBlogPostDao(): BlogPostDao

    companion object {
        val DATABASE_NAME: String = "app_db"
    }
}
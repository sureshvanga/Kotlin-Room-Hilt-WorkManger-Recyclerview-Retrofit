package com.demo.suresh.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.demo.suresh.model.RepositoryData
import com.demo.suresh.model.TypeConverterOwner

@Database(entities = [RepositoryData::class], version = 1, exportSchema = false)
@TypeConverters(TypeConverterOwner::class)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getAppDao(): AppDao

    companion object {
        private var DB_INSTANCE: AppDatabase? = null

        fun getAppDBInstance(context: Context): AppDatabase {
            if(DB_INSTANCE == null) {
                DB_INSTANCE =  Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "MY_DATABASE")
                    .allowMainThreadQueries()
                    .build()
            }
            return DB_INSTANCE!!
        }
    }
}
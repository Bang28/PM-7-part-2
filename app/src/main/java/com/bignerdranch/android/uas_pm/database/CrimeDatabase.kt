package com.bignerdranch.android.uas_pm.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bignerdranch.android.uas_pm.Crime

@Database(entities = [ Crime::class ], version=1)
abstract class CrimeDatabase : RoomDatabase() {
}
package com.bignerdranch.android.uas_pm.database

import androidx.room.Dao
import androidx.room.Query
import com.bignerdranch.android.uas_pm.Crime
import java.util.*
import kotlinx.coroutines.flow.Flow

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    suspend fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime
}
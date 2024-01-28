package com.bignerdranch.android.uas_pm

import android.os.Bundle
import androidx.fragment.app.Fragment
import java.util.*

class CrimeDetailFragment : Fragment() {

    private lateinit var crime: Crime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime(
            id = UUID.randomUUID(),
            title = "",
            date = Date(),
            isSolved = false
        )
    }
}
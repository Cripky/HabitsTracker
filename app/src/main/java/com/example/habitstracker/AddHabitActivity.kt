package com.example.habitstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.habitstracker.databinding.ActivityAddHabitBinding

class AddHabitActivity : AppCompatActivity() {
    private lateinit var hBinding: ActivityAddHabitBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hBinding = ActivityAddHabitBinding.inflate(layoutInflater)
        setContentView(hBinding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
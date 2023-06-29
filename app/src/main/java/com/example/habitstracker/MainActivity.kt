package com.example.habitstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.habitstracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var habits: MutableList<Habit>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        habits = generateHabitList()
        setContentView(mBinding.root)
        val recyclerView: RecyclerView = mBinding.activityMainRv
        val habitsAdapter = HabitsAdapter(habits)
        recyclerView.adapter = habitsAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        mBinding.activityMainFab.setOnClickListener {
            val intent = Intent(this, AddHabitActivity::class.java)
            startActivity(intent)
        }
    }
}

private fun generateHabitList(): MutableList<Habit> {
    val habits: MutableList<Habit> = ArrayList()
    habits.run { add(Habit(
        "Пить воду",
        "Пить воду да побольше",
        "1 раз в 14 дней")) }
    return habits
}
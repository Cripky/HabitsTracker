package com.example.habitstracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HabitsAdapter(private val habits: List<Habit>) :
    RecyclerView.Adapter<HabitsAdapter.HabitHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): HabitHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.habit_item, viewGroup, false)
        return HabitHolder(view)
    }

    override fun onBindViewHolder(viewHolder: HabitHolder, i: Int) {
        val habit: Habit = habits[i]
        viewHolder.bind(habit)
        viewHolder.itemView.tag = habit
    }

    override fun getItemCount(): Int {
        return habits.size
    }

    class HabitHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val habitItemName: TextView = itemView.findViewById(R.id.habit_item_name)
        private val habitItemDescription: TextView =
            itemView.findViewById(R.id.habit_item_description)
        private val habitItemPeriodicity: TextView =
            itemView.findViewById(R.id.habit_item_periodicity)

        fun bind(habit: Habit) {
            habitItemName.text = habit.habitItemName
            habitItemDescription.text = habit.habitItemDescription
            habitItemPeriodicity.text = habit.habitItemPeriodicity
        }

    }

}
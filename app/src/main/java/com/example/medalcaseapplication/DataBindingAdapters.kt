package com.example.medalcaseapplication

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter(value = ["setAchievementList"])
fun RecyclerView.setAchievementList(achievements: Array<Achievement>) {
        val achievementListAdapter = AchievementListAdapter(achievements)
        adapter = achievementListAdapter

}



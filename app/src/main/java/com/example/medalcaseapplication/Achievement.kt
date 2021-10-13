package com.example.medalcaseapplication

import androidx.annotation.DrawableRes

data class Achievement(
    val id: Long,
    val name: String,
    @DrawableRes
    val image: Int,
    val isAchieved: Boolean,
    val record: String = "Not yet"
)
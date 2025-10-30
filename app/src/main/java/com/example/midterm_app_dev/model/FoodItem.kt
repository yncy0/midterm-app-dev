package com.example.midterm_app_dev.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodItem(
    val name: String,
    val price: String,
    val imageResId: Int,
    val description: String
) : Parcelable
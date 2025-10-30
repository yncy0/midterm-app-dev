package com.example.midterm_app_dev.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartItem(val foodItem: FoodItem, var quantity: Int) : Parcelable

object Cart {
    val items = mutableListOf<CartItem>()

    fun addItem(foodItem: FoodItem, quantity: Int) {
        val existingItem = items.find { it.foodItem.name == foodItem.name }
        if (existingItem != null) {
            existingItem.quantity += quantity
        } else {
            items.add(CartItem(foodItem, quantity))
        }
    }
}
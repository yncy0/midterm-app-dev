package com.example.midterm_app_dev.model

object OrderSummary {
    val items = mutableListOf<CartItem>()

    fun setOrderItems(cartItems: List<CartItem>) {
        items.clear()
        items.addAll(cartItems)
    }
}
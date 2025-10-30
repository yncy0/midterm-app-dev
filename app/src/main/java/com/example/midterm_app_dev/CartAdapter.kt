package com.example.midterm_app_dev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm_app_dev.model.CartItem

class CartAdapter(private val cartItems: List<CartItem>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val cartItem = cartItems[position]
        holder.bind(cartItem)
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemName: TextView = itemView.findViewById(R.id.tvItemName)
        private val itemPrice: TextView = itemView.findViewById(R.id.tvItemPrice)
        private val itemImage: ImageView = itemView.findViewById(R.id.imgItem)
        private val itemQuantity: TextView = itemView.findViewById(R.id.tvItemQuantity)

        fun bind(cartItem: CartItem) {
            itemName.text = cartItem.foodItem.name
            itemPrice.text = cartItem.foodItem.price
            itemImage.setImageResource(cartItem.foodItem.imageResId)
            itemQuantity.text = "x${cartItem.quantity}"
        }
    }
}
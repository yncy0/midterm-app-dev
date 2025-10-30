package com.example.midterm_app_dev

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm_app_dev.model.Order

class OrderAdapter(private val orders: List<Order>) : RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_order, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val order = orders[position]
        holder.bind(order)
    }

    override fun getItemCount(): Int {
        return orders.size
    }

    class OrderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemName: TextView = itemView.findViewById(R.id.tvItemName)
        private val itemPrice: TextView = itemView.findViewById(R.id.tvItemPrice)
        private val itemImage: ImageView = itemView.findViewById(R.id.imgItem)

        fun bind(order: Order) {
            itemName.text = order.name
            itemPrice.text = order.price
            itemImage.setImageResource(order.imageResId)
        }
    }
}
package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm_app_dev.model.Order

class OrdersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_order_confirmation, container, false)

        val ordersRecyclerView: RecyclerView = view.findViewById(R.id.ordersRecyclerView)
        val orders = createDummyOrders()
        ordersRecyclerView.adapter = OrderAdapter(orders)

        return view
    }

    private fun createDummyOrders(): List<Order> {
        return listOf(
            Order("Hawaiian Pizza", "₱250.00", R.drawable.pizza_hawaiian),
            Order("Cheese Pizza", "₱230.00", R.drawable.pizza_cheese),
            Order("Pepperoni Pizza", "₱260.00", R.drawable.pizza_pepperoni),
            Order("Veggie Pizza", "₱240.00", R.drawable.pizza_veggies),
            Order("Coke", "₱50.00", R.drawable.coke),
            Order("Suman", "₱30.00", R.drawable.suman),
            Order("Leche Flan", "₱70.00", R.drawable.leche)

        )
    }
}
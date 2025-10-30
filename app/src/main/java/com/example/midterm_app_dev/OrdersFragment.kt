package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm_app_dev.model.OrderSummary

class OrdersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_order_confirmation, container, false)

        val ordersRecyclerView: RecyclerView = view.findViewById(R.id.ordersRecyclerView)
        
        val cartAdapter = CartAdapter(OrderSummary.items)
        ordersRecyclerView.adapter = cartAdapter

        return view
    }
}
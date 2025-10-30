package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.midterm_app_dev.model.Cart

class CartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_cart, container, false)

        val cartRecyclerView: RecyclerView = view.findViewById(R.id.cartRecyclerView)
        val subtotalTextView: TextView = view.findViewById(R.id.subtotalTextView)

        val cartAdapter = CartAdapter(Cart.items)
        cartRecyclerView.adapter = cartAdapter
        
        updateSubtotal(subtotalTextView)

        return view
    }

    private fun updateSubtotal(subtotalTextView: TextView) {
        val subtotal = Cart.items.sumOf { it.foodItem.price.replace("₱", "").toDouble() * it.quantity }
        subtotalTextView.text = "Subtotal: ₱%.2f".format(subtotal)
    }
}
package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.midterm_app_dev.model.FoodItem

class DessertFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_dessert, container, false)

        val allButton: Button = view.findViewById(R.id.button_all)
        allButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        val pizzaButton: Button = view.findViewById(R.id.button_pizza)
        pizzaButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        val drinksButton: Button = view.findViewById(R.id.button_drinks)
        drinksButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DrinksFragment())
                .commit()
        }

        val haloHalo: LinearLayout = view.findViewById(R.id.halo_halo)
        haloHalo.setOnClickListener {
            val foodItem = FoodItem("Halo-Halo", "₱85.00", R.drawable.halohalo, "A popular Filipino cold dessert.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val suman: LinearLayout = view.findViewById(R.id.suman)
        suman.setOnClickListener {
            val foodItem = FoodItem("Suman", "₱50.00", R.drawable.suman, "A Filipino rice cake.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val bananaQue: LinearLayout = view.findViewById(R.id.banana_que)
        bananaQue.setOnClickListener {
            val foodItem = FoodItem("Banana Que", "₱25.00", R.drawable.bananacuw, "A popular Filipino street food.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val lecheFlan: LinearLayout = view.findViewById(R.id.leche_flan)
        lecheFlan.setOnClickListener {
            val foodItem = FoodItem("Leche Flan", "₱50.00", R.drawable.leche, "A Filipino custard dessert.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
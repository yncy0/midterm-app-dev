package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.midterm_app_dev.model.FoodItem

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_home, container, false)

        val username = arguments?.getString("USERNAME")
        val greetingTextView = view.findViewById<TextView>(R.id.greeting_text)
        greetingTextView.text = "Hi, ${username?.replaceFirstChar { it.uppercase() }}"

        val dessertButton: Button = view.findViewById(R.id.button_dessert)
        dessertButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DessertFragment())
                .commit()
        }

        val drinksButton: Button = view.findViewById(R.id.button_drinks)
        drinksButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DrinksFragment())
                .commit()
        }

        val hawaiianPizza: LinearLayout = view.findViewById(R.id.hawaiian_pizza)
        hawaiianPizza.setOnClickListener {
            val foodItem = FoodItem("Hawaiian Pizza", "₱250.00", R.drawable.pizza_hawaiian, "A delicious hawaiian pizza.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val cheesePizza: LinearLayout = view.findViewById(R.id.cheese_pizza)
        cheesePizza.setOnClickListener {
            val foodItem = FoodItem("Cheese Pizza", "₱230.00", R.drawable.pizza_cheese, "A classic cheese pizza.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val pepperoniPizza: LinearLayout = view.findViewById(R.id.pepperoni_pizza)
        pepperoniPizza.setOnClickListener {
            val foodItem = FoodItem("Pepperoni Pizza", "₱260.00", R.drawable.pizza_pepperoni, "A spicy pepperoni pizza.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val veggiePizza: LinearLayout = view.findViewById(R.id.veggie_pizza)
        veggiePizza.setOnClickListener {
            val foodItem = FoodItem("Veggie Pizza", "₱240.00", R.drawable.pizza_veggies, "A healthy veggie pizza.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
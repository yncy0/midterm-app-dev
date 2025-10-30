package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.midterm_app_dev.model.FoodItem

class DrinksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.activity_drinks, container, false)

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

        val dessertButton: Button = view.findViewById(R.id.button_dessert)
        dessertButton.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DessertFragment())
                .commit()
        }

        val coke: LinearLayout = view.findViewById(R.id.coke)
        coke.setOnClickListener {
            val foodItem = FoodItem("Coke", "₱30.00", R.drawable.coke, "A refreshing Coca-Cola.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val fruitShake: LinearLayout = view.findViewById(R.id.fruit_shake)
        fruitShake.setOnClickListener {
            val foodItem = FoodItem("Fruit Shake", "₱45.00", R.drawable.shake, "A healthy fruit shake.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val sagotGulaman: LinearLayout = view.findViewById(R.id.sago_gulaman)
        sagotGulaman.setOnClickListener {
            val foodItem = FoodItem("Sago't Gulaman", "₱35.00", R.drawable.sagot, "A popular Filipino beverage.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        val coffee: LinearLayout = view.findViewById(R.id.coffee)
        coffee.setOnClickListener {
            val foodItem = FoodItem("Coffee", "₱25.00", R.drawable.coffee, "A classic cup of coffee.")
            val fragment = FoodDetailsFragment.newInstance(foodItem)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
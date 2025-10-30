package com.example.midterm_app_dev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.midterm_app_dev.model.FoodItem

class FoodDetailsFragment : Fragment() {

    private var quantity = 1

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_food_details, container, false)

        val foodItem = arguments?.getParcelable<FoodItem>("foodItem")

        val pizzaImage: ImageView = view.findViewById(R.id.pizzaImage)
        val pizzaName: TextView = view.findViewById(R.id.pizzaName)
        val pizzaPrice: TextView = view.findViewById(R.id.pizzaPrice)
        val pizzaDescription: TextView = view.findViewById(R.id.pizzaDescription)
        val backArrow: ImageView = view.findViewById(R.id.backArrow)
        val plusButton: Button = view.findViewById(R.id.plusButton)
        val minusButton: Button = view.findViewById(R.id.minusButton)
        val quantityText: TextView = view.findViewById(R.id.quantityText)

        if (foodItem != null) {
            pizzaImage.setImageResource(foodItem.imageResId)
            pizzaName.text = foodItem.name
            pizzaPrice.text = foodItem.price
            pizzaDescription.text = foodItem.description
        }

        backArrow.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        plusButton.setOnClickListener {
            quantity++
            quantityText.text = quantity.toString()
        }

        minusButton.setOnClickListener {
            if (quantity > 1) {
                quantity--
                quantityText.text = quantity.toString()
            }
        }

        return view
    }

    companion object {
        fun newInstance(foodItem: FoodItem): FoodDetailsFragment {
            val fragment = FoodDetailsFragment()
            val args = Bundle()
            args.putParcelable("foodItem", foodItem)
            fragment.arguments = args
            return fragment
        }
    }
}
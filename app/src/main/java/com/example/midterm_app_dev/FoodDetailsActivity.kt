package com.example.midterm_app_dev

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.midterm_app_dev.model.FoodItem

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val foodItem = intent.getParcelableExtra<FoodItem>("foodItem")

        val pizzaImage = findViewById<ImageView>(R.id.pizzaImage)
        val pizzaName = findViewById<TextView>(R.id.pizzaName)
        val pizzaPrice = findViewById<TextView>(R.id.pizzaPrice)
        val pizzaDescription = findViewById<TextView>(R.id.pizzaDescription)
        val addToCartButton = findViewById<Button>(R.id.addToCartButton)
        val backArrow = findViewById<ImageView>(R.id.backArrow)

        if (foodItem != null) {
            pizzaImage.setImageResource(foodItem.imageResId)
            pizzaName.text = foodItem.name
            pizzaPrice.text = foodItem.price
            pizzaDescription.text = foodItem.description
        }

        addToCartButton.setOnClickListener {
            Toast.makeText(this, "Added to Cart!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }

        backArrow.setOnClickListener {
            onBackPressed()
        }
    }
}

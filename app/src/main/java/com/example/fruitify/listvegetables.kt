package com.example.fruitify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class listvegetables : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listvegetables)
        val vegetables1 = findViewById<Button>(R.id.asparagus)
        val vegetables2 = findViewById<Button>(R.id.singhara)
        val vegetables3 = findViewById<Button>(R.id.rumex)
        val vegetables4 = findViewById<Button>(R.id.Nasturtium)
        val vegetables5 = findViewById<Button>(R.id.BokChoy)
        vegetables1.setOnClickListener {
            val intentvegetables_1= Intent(this, Vegetable_1::class.java)
            startActivity(intentvegetables_1)
        }
        vegetables2.setOnClickListener {
            val intentvegetables_2= Intent(this, Vegetable_2::class.java)
            startActivity(intentvegetables_2)
        }
        vegetables3.setOnClickListener {
            val intentvegetables_3= Intent(this, Vegetable_3::class.java)
            startActivity(intentvegetables_3)
        }
        vegetables4.setOnClickListener {
            val intentvegetables_4= Intent(this, Vegetable_4::class.java)
            startActivity(intentvegetables_4)
        }
        vegetables5.setOnClickListener {
            val intentvegetables_5= Intent(this, Vegetable_5::class.java)
            startActivity(intentvegetables_5)
        }

    }
}
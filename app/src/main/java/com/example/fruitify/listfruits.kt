package com.example.fruitify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class listfruits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listfruits)
        val fruit1 = findViewById<Button>(R.id.Camachile)
        val fruit2 = findViewById<Button>(R.id.Bilambi)
        val fruit3 = findViewById<Button>(R.id.Anjeer)
        val fruit4 = findViewById<Button>(R.id.Chakotra)
        val fruit5 = findViewById<Button>(R.id.Ambarella)
        val fruit6 = findViewById<Button>(R.id.Koranda)
        val fruit7 = findViewById<Button>(R.id.Carambola)
        val fruit8 = findViewById<Button>(R.id.Langsat)
        val fruit9 = findViewById<Button>(R.id.BuddhaFinger)
        val fruit10 = findViewById<Button>(R.id.Dadim)
        fruit1.setOnClickListener {
            val intentfruit_1= Intent(this, Fruit_1::class.java)
            startActivity(intentfruit_1)
        }
        fruit2.setOnClickListener {
            val intentfruit_2= Intent(this, Fruit_2::class.java)
            startActivity(intentfruit_2)
        }
        fruit3.setOnClickListener {
            val intentfruit_3= Intent(this, Fruit_3::class.java)
            startActivity(intentfruit_3)
        }
        fruit4.setOnClickListener {
            val intentfruit_4= Intent(this, Fruit_4::class.java)
            startActivity(intentfruit_4)
        }
        fruit5.setOnClickListener {
            val intentfruit_5= Intent(this, Fruit_5::class.java)
            startActivity(intentfruit_5)
        }
        fruit6.setOnClickListener {
            val intentfruit_6= Intent(this, Fruit_6::class.java)
            startActivity(intentfruit_6)
        }
        fruit7.setOnClickListener {
            val intentfruit_7= Intent(this, Fruit_7::class.java)
            startActivity(intentfruit_7)
        }
        fruit8.setOnClickListener {
            val intentfruit_8= Intent(this, Fruit_8::class.java)
            startActivity(intentfruit_8)
        }
        fruit9.setOnClickListener {
            val intentfruit_9 = Intent(this, Fruit_9::class.java)
            startActivity(intentfruit_9)
        }
        fruit10.setOnClickListener {
            val intentfruit_10 = Intent(this, Fruit_10::class.java)
            startActivity(intentfruit_10)
        }

        }

    }
package com.example.fruitify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import java.util.jar.Attributes

class getstarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)
        val choicegiven1 = findViewById<Button>(R.id.choice1)
        val choicegiven2 = findViewById<Button>(R.id.choice2)
        choicegiven1.setOnClickListener {
            val Messagev: String
            Messagev = "Ahhmm so you like fruits"
            val toastflirt1 = Toast.makeText(applicationContext, Messagev, Toast.LENGTH_LONG)
            toastflirt1.setGravity(Gravity.CENTER, 0, 0)
            toastflirt1.show()
            val intentfruit = Intent(this, listfruits::class.java)
            startActivity(intentfruit)
        }
            choicegiven2.setOnClickListener {
                val Messagef: String
                Messagef = "Ahhmm so you like vegetables"
                val toastflirt2 = Toast.makeText(applicationContext, Messagef, Toast.LENGTH_LONG)
                toastflirt2.setGravity(Gravity.CENTER, 0, 0)
                toastflirt2.show()
                val intentvegetables = Intent(this, listvegetables::class.java)
                startActivity(intentvegetables)
            }
    }
}
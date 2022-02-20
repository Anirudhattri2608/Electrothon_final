package com.example.fruitify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name = findViewById<EditText>(R.id.personname)
        val submitButton = findViewById<Button>(R.id.enter)
        val dispMessage = findViewById<TextView>(R.id.textviewresponse)
        submitButton.setOnClickListener {
            val Message: String
            Message = "Welcome "+Name.text+" !"
            val toast1 = Toast.makeText(applicationContext, Message, Toast.LENGTH_LONG)
            toast1.setGravity(Gravity.CENTER, 0,0)
            toast1.show()
            val intentstart = Intent(this, getstarted::class.java)
            startActivity(intentstart)
        }
    }
}
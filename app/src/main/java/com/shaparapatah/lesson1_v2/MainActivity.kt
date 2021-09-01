package com.shaparapatah.lesson1_v2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val duration = Toast.LENGTH_SHORT
    val text = "YouPressTheButton!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.button)
            btn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, text, duration).show()
            }
        })

    }

}
package com.shaparapatah.lesson1_v2

import android.os.Bundle
import android.util.Log
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
        btn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(applicationContext, text, duration).show()
            }
        })
    }


    fun main() {

        val funCopy = KotlinDataClass("FieldOne", "FieldTwo")
        val newCopy = funCopy.copy("FIELDSSSS", "fieldddd")


        //
        var weatherType: WeatherType = WeatherType.CLOUDY
        val color = when (weatherType) {
            WeatherType.SUNNY -> R.color.design_default_color_primary
            WeatherType.RAINY -> R.color.design_default_color_on_secondary
            WeatherType.CLOUDY -> R.color.design_default_color_primary_variant
            WeatherType.MISTY -> R.color.design_default_color_surface
            WeatherType.SNOWY -> R.color.design_default_color_error
            WeatherType.HAILY -> R.color.cardview_shadow_start_color
        }


        val daysOfWeek =
            listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
        for (day in daysOfWeek) {
            Log.d("myLogs", "$day")
        }
    }
}

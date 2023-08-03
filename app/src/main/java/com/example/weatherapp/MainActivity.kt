package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private val apiKey = "04cc4df7e82c60007c4b43bb41ad1549"

    private lateinit var mainTemp: TextView
    private lateinit var locationName: EditText
    private lateinit var weatherDesc: TextView
    private lateinit var updatedAt: TextView
    private lateinit var minTemp: TextView
    private lateinit var maxTemp: TextView
    private lateinit var humidity: TextView
    private lateinit var pressure: TextView
    private lateinit var windSpeed: TextView
    private lateinit var sunriseTime: TextView
    private lateinit var sunsetTime: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTemp = findViewById(R.id.temp_main)
        locationName = findViewById(R.id.et_location)
        weatherDesc = findViewById(R.id.tv_status)
        updatedAt = findViewById(R.id.tv_updated_at)
        minTemp = findViewById(R.id.temp_min)
        maxTemp = findViewById(R.id.temp_max)
        humidity = findViewById(R.id.humidity_main_procent)
        pressure = findViewById(R.id.pressure_main_procent)
        windSpeed = findViewById(R.id.wind_main_speed)
        sunriseTime = findViewById(R.id.sunrise_main_time)
        sunsetTime = findViewById(R.id.sunset_main_time)


        //hejhej

        //he he
    }
}
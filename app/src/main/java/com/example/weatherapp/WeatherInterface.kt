package com.example.weatherapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherInterface {

        @GET("weather")

        suspend fun getWeatherByCityName(
            @Query("q") cityName: String,
            @Query("appid") apiKey: String,
            @Query("units") units: String = "metric"

        ) : Response<WeatherModel>

    }


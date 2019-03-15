package com.example.travelmeetap2.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    fun create(): ApiInterface {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://localhost/")
            .build()

        return retrofit.create(ApiInterface::class.java)
    }
}
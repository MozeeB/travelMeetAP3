package com.example.travelmeetap2.network

import com.example.travelmeetap2.Model.wisata.ResponseWisata
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("wisata/")
    fun getWisata(@Query("id") idWisata : String) : Call<ResponseWisata>
}
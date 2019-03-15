package com.example.travelmeetap2.Model.wisata

import com.google.gson.annotations.SerializedName

data class ResponseWisata(

	@SerializedName("data")
	val dataBerita: List<DataItem?>? = null,

	@SerializedName("message")
	val message: String? = null,

	@SerializedName("status")
	val status: Boolean? = null
)
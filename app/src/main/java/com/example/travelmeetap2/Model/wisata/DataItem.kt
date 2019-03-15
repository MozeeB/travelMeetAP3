package com.example.travelmeetap2.Model.wisata

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class DataItem(

	@SerializedName("image")
	val image: String? = null,

	@SerializedName("address")
	val address: String? = null,

	@SerializedName("distance")
	val distance: String? = null,

	@SerializedName("price")
	val price: String? = null,

	@SerializedName("district")
	val district: String? = null,

	@SerializedName("operational_time")
	val operationalTime: String? = null,

	@SerializedName("latitude")
	val latitude: String? = null,

	@SerializedName("name")
	val name: String? = null,

	@SerializedName("description")
	val description: String? = null,

	@SerializedName("id")
	val id: String? = null,

	@SerializedName("numb_telp")
	val numbTelp: String? = null,

	@SerializedName("longitude")
	val longitude: String? = null


) : Parcelable {
	constructor(source: Parcel) : this(
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString(),
		source.readString()
	)

	override fun describeContents() = 0

	override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
		writeString(image)
		writeString(address)
		writeString(distance)
		writeString(price)
		writeString(district)
		writeString(operationalTime)
		writeString(latitude)
		writeString(name)
		writeString(description)
		writeString(id)
		writeString(numbTelp)
		writeString(longitude)
	}

	companion object {
		@JvmField
		val CREATOR: Parcelable.Creator<DataItem> = object : Parcelable.Creator<DataItem> {
			override fun createFromParcel(source: Parcel): DataItem = DataItem(source)
			override fun newArray(size: Int): Array<DataItem?> = arrayOfNulls(size)
		}
	}
}
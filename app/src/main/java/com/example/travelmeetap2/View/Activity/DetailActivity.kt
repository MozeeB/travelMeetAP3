package com.example.travelmeetap2.View.Activity

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView
import com.example.travelmeetap2.MVP.Contract.DetailContract
import com.example.travelmeetap2.MVP.Presenter.DetailPresenter
import com.example.travelmeetap2.Model.PlaceModel
import com.example.travelmeetap2.Model.wisata.DataItem
import com.example.travelmeetap2.R
import com.squareup.picasso.Picasso
import java.text.NumberFormat

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity(), DetailContract.View{
    companion object {
        val ExtraData: String = "extradata"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val presenter = DetailPresenter(this,this);
        presenter.setDetail()
    }

    @SuppressLint("SetTextI18n")
    override fun detailPlace(
        name: TextView,
        price: TextView,
        tlpDetail: TextView,
        district: TextView,
        address: TextView,
        desc: TextView,
        spOperational: Spinner,
        img: ImageView
    ) {
        val placeModel: DataItem = intent.getParcelableExtra(ExtraData)
        Picasso.with(this).load(placeModel.image).into(img)
        name.text = placeModel.name
        price.text = "Rp. " + NumberFormat.getInstance().format(placeModel.price)
        tlpDetail.text = if (placeModel.numbTelp == null) "-" else placeModel.numbTelp
        district.text = placeModel.district
        address.text = placeModel.address
        desc.text = placeModel.distance
        spOperational.adapter =
                ArrayAdapter<String>(
                    this,
                    android.R.layout.simple_spinner_dropdown_item,
                    placeModel.operationalTime)
        spOperational.setSelection(0)
    }
}

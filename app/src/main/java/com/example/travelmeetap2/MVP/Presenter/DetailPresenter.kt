package com.example.travelmeetap2.MVP.Presenter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import com.example.travelmeetap2.MVP.Contract.DetailContract
import com.example.travelmeetap2.R
import com.example.travelmeetap2.View.Activity.DetailActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailPresenter : DetailContract.Presenter {

    private var view:DetailContract.View? = null
    private  var detailActivity: Activity? = null

    constructor(view:DetailContract.View, activity: Activity){
        this.view = view
        this.detailActivity = activity
    }

    override fun setDetail() {
        view!!.detailPlace(
            detailActivity!!.findViewById(R.id.tvDetailNamePlace),
            detailActivity!!.findViewById(R.id.tvPriceDetailPlace),
            detailActivity!!.findViewById(R.id.tvTlpDetailPlace),
            detailActivity!!.findViewById(R.id.tvDistrictDetailPlace),
            detailActivity!!.findViewById(R.id.tvAddressDetailPlace),
            detailActivity!!.findViewById(R.id.tvDescDetailPlace),
            detailActivity!!.findViewById(R.id.spOperationalTime),
            detailActivity!!.findViewById(R.id.imgDetailPlace)
        )
    }
}
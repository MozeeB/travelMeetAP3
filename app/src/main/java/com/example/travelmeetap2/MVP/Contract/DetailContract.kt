package com.example.travelmeetap2.MVP.Contract

import android.app.Activity
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView

interface DetailContract {
    interface View {
        fun detailPlace(
            name:TextView,
            price:TextView,
            tlpDetail:TextView,
            district:TextView,
            address:TextView,
            desc:TextView,
            spOperational:Spinner,
            img:ImageView
        )
    }

    interface Presenter {
        fun setDetail()
    }
}
package com.example.travelmeetap2.MVP.Contract

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.travelmeetap2.Model.PlaceModel

interface ListLocationContract {
    interface View{
        fun setAdapter(places:List<PlaceModel>,view:android.view.View)
        fun showError(error:String, view:android.view.View)
        fun setviewprogress(view:android.view.View)
        fun hideprogressbar(view:android.view.View)
    }

    interface Presenter{
        fun loadData(search:String)
        fun onProgress(input:String)
    }
}
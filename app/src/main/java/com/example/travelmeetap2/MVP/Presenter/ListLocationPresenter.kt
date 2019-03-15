package com.example.travelmeetap2.MVP.Presenter

import android.os.Handler
import android.view.View
import com.example.travelmeetap2.MVP.Contract.ListLocationContract
import com.example.travelmeetap2.Model.PlaceModel
import com.example.travelmeetap2.R
import com.example.travelmeetap2.Utils.GlobalVars

class ListLocationPresenter : ListLocationContract.Presenter {
    private var view: ListLocationContract.View? = null;
    private var viewLocation: View? = null
    private var mHandler: Handler
    private lateinit var mRunnable: Runnable

    constructor(view:ListLocationContract.View,view2:View){
        this.view = view
        this.viewLocation = view2
        mHandler = Handler()
    }

    override fun loadData(search: String) {
        var places : List<PlaceModel> = GlobalVars.placeModels

        // jika cari tidak sama dengan "" maka cari kata tersebut
        if(search != ""){
            places = places.filter { it.name.toLowerCase().contains(search) }
        }

        // show layout sesuai dengan nilai tempat
        if(places.size > 0){
            view!!.setAdapter(
                places,
                viewLocation!!.findViewById(R.id.rvItemPlace)
            )
        }else{
            view!!.showError(
                viewLocation!!.resources.getString(R.string.tidak_ada_data),
                viewLocation!!
            )
        }
    }

    override fun onProgress(input: String) {
        // hide all screen
        view!!.setviewprogress(
            viewLocation!!
        )

        // post delay
        mRunnable = Runnable {
            loadData(input)
            view!!.hideprogressbar(viewLocation!!)
        }

        mHandler.postDelayed(
            mRunnable,
            (2000).toLong()
        )
    }
}
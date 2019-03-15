package com.example.travelmeetap2.View.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.travelmeetap2.Adapter.PlaceAdapter
import com.example.travelmeetap2.MVP.Contract.WisataContract
import com.example.travelmeetap2.MVP.Presenter.WisataPresenter
import com.example.travelmeetap2.Model.wisata.DataItem
import kotlinx.android.synthetic.main.fragment_list_location.*

class MainWisataActivity : AppCompatActivity(), WisataContract.View {
    private lateinit var WisataPresen : WisataPresenter
    private lateinit var wisata : String


    override fun showLoading() {
        swipeRefreshLayout.isRefreshing = true
    }

    override fun hideLoading() {
        swipeRefreshLayout.isRefreshing = false
    }

    override fun ShowWisata(listWisataItems: List<DataItem?>?) {
        rvItemPlace.hasFixedSize()
        rvItemPlace.layoutManager = LinearLayoutManager(this)
        rvItemPlace.adapter = PlaceAdapter( this,listWisataItems){
            val intent = Intent
        }
    }

    override fun showFailureMessage(error: String?) {
    }



}
package com.example.travelmeetap2.MVP.Contract

import com.example.travelmeetap2.Model.wisata.DataItem

interface WisataContract {
    interface View{
        fun showLoading()
        fun hideLoading()
        fun ShowWisata(listWisataItems: List<DataItem?>?)
        fun showFailureMessage(error : String? = null)


    }
    interface Presenter{
        fun getWisata(wisata : String)
    }
}
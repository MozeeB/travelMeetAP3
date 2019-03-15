package com.example.travelmeetap2.MVP.Presenter

import com.example.travelmeetap2.MVP.Contract.WisataContract
import com.example.travelmeetap2.Model.wisata.ResponseWisata
import com.example.travelmeetap2.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WisataPresenter (model : WisataContract.View) : WisataContract.Presenter {


    var view : WisataContract.View? = null

    init {
        view = model
    }

    override fun getWisata(wisata: String) {
        view?.showLoading()
        ApiClient.create().getWisata(wisata).enqueue(object : Callback<ResponseWisata>{

            override fun onResponse(call: Call<ResponseWisata>, response: Response<ResponseWisata>) {
                if (response.body() != null){
                    val wisataResponse : ResponseWisata = response.body()!!
                    view?.ShowWisata(wisataResponse.dataBerita)
                }
            }

            override fun onFailure(call: Call<ResponseWisata>, t: Throwable) {
                view?.hideLoading()
                view?.showFailureMessage(t.message)
            }

        })
    }
}
package com.example.travelmeetap2.MVP.Contract

import android.support.v4.app.FragmentManager
import com.example.travelmeetap2.Model.wisata.DataItem
import java.util.*

interface MainContract {
    interface View{
        fun Locale(locale:Locale)
        fun showData(listWisata: List<DataItem>)
    }

    interface Presenter{
        fun setLocale(lang:String?)
        fun addFragment(fragmentManager: FragmentManager)
        fun changeFragment(name:String,fragmentManager: FragmentManager)
        fun getData(wisata : String)
    }
}
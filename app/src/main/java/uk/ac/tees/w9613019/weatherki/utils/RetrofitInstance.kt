package uk.ac.tees.w9613019.weatherki.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uk.ac.tees.w9613019.weatherki.data.ApiInterface

object RetrofitInstance {
    val ap :ApiInterface by lazy{
        Retrofit.Builder()
            .baseUrl(util.Base)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiInterface::class.java)
    }
}
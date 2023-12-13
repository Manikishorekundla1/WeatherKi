package uk.ac.tees.w9613019.weatherki.data

import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("/lat=33.44&lon=-94.04&appid=1ef7d87c1617090accf9b5a8266fd61c")
    suspend fun getdata():Response<Weatherdata>

}
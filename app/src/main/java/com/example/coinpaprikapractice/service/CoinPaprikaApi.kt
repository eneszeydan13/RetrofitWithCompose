package com.example.coinpaprikapractice.service


import com.example.coinpaprikapractice.model.Coin
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.http.GET

private const val BASE_URL = "https://api.coinpaprika.com/"

interface CoinPaprikaApi {

    @GET("/v1/coins")
    fun getCoin(): Call<List<Coin>>

}




object CoinNetwork{
    val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }
}
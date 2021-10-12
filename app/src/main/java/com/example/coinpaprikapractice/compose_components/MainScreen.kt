package com.example.coinpaprikapractice.compose_components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import com.example.coinpaprikapractice.model.Coin
import com.example.coinpaprikapractice.service.CoinNetwork
import retrofit2.Call
import retrofit2.Response

@Composable
fun MainScreen(){
    var cryptoModels = remember {
        mutableStateListOf<Coin>()
    }

    val call = CoinNetwork.retrofit.getCoin()

    call.enqueue(object: retrofit2.Callback<List<Coin>> {
        override fun onResponse(call: Call<List<Coin>>, response: Response<List<Coin>>) {
            if(response.isSuccessful){
                response.body()?.let {
                    cryptoModels.addAll(it)
                }
            }
        }

        override fun onFailure(call: Call<List<Coin>>, t: Throwable) {
            t.printStackTrace()
        }

    })


    Scaffold(topBar = { AppBar() }) {
        Surface(color = MaterialTheme.colors.surface) {
            CoinsList(coinList = cryptoModels)
        }
    }

}
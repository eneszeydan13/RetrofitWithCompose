package com.example.coinpaprikapractice.compose_components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.coinpaprikapractice.CoinListItem
import com.example.coinpaprikapractice.model.Coin

@Composable
fun CoinsList(coinList: List<Coin>){

    LazyColumn{
        items(coinList){coin->
            CoinListItem(coin = coin)
        }
    }
}
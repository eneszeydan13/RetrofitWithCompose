package com.example.coinpaprikapractice.compose_components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppBar() {
    TopAppBar(elevation = 10.dp,contentPadding = PaddingValues(15.dp)) {
        Text(text = "CoinPaprika Data",fontSize = 26.sp)
    }
}
package com.example.coinpaprikapractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.coinpaprikapractice.compose_components.MainScreen
import com.example.coinpaprikapractice.ui.theme.CoinPaprikaPracticeTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoinPaprikaPracticeTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoinPaprikaPracticeTheme {

    }
}
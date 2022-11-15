package com.appsian.cryptovurrencyappyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.appsian.cryptovurrencyappyt.presentation.Screen
import com.appsian.cryptovurrencyappyt.presentation.coin_detail.CoinDetailScreen
import com.appsian.cryptovurrencyappyt.presentation.coin_list.CoinListScreen
import com.appsian.cryptovurrencyappyt.presentation.ui.theme.CryptovurrencyAppYtTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptovurrencyAppYtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route
                    ) {
                        composable(
                            route = Screen.CoinListScreen.route
                        ){
                            CoinListScreen(navController = navController)
                        }
                        composable(
                            route = Screen.CoinDetailScreen.route + "/{coinId}"
                        ){
                            CoinDetailScreen()
                        }
                    }
                }
            }
        }
    }
}

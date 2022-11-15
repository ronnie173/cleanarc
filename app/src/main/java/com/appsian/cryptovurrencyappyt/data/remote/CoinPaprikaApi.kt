package com.appsian.cryptovurrencyappyt.data.remote

import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDetailDto
import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("v1/coin")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId")
    suspend fun getCoinById(@Path("coinId") coinId: String):CoinDetailDto
}
package com.appsian.cryptovurrencyappyt.data.remote

import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDetailDto
import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String):CoinDetailDto
}
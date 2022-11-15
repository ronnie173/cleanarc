package com.appsian.cryptovurrencyappyt.domain.repositories

import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDetailDto
import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}
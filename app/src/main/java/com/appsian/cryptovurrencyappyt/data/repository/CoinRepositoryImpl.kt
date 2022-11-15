package com.appsian.cryptovurrencyappyt.data.repository

import com.appsian.cryptovurrencyappyt.data.remote.CoinPaprikaApi
import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDetailDto
import com.appsian.cryptovurrencyappyt.data.remote.dto.CoinDto
import com.appsian.cryptovurrencyappyt.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
       return api.getCoinById(coinId)
    }
}
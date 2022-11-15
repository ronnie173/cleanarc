package com.appsian.cryptovurrencyappyt.domain.use_cases.get_coin

import com.appsian.cryptovurrencyappyt.common.Resource
import com.appsian.cryptovurrencyappyt.data.remote.dto.toCoin
import com.appsian.cryptovurrencyappyt.data.remote.dto.toCoinDetail
import com.appsian.cryptovurrencyappyt.domain.model.Coin
import com.appsian.cryptovurrencyappyt.domain.model.CoinDetail
import com.appsian.cryptovurrencyappyt.domain.repositories.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An Exception occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server check your internet connection"))
        }
    }
}
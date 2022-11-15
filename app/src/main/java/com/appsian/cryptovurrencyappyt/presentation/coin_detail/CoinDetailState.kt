package com.appsian.cryptovurrencyappyt.presentation.coin_detail

import com.appsian.cryptovurrencyappyt.domain.model.Coin
import com.appsian.cryptovurrencyappyt.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading:Boolean = false,
    val coin : CoinDetail? = null,
    val error: String = ""
)

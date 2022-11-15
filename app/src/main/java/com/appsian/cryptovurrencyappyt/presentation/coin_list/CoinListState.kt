package com.appsian.cryptovurrencyappyt.presentation.coin_list

import com.appsian.cryptovurrencyappyt.domain.model.Coin

data class CoinListState(
    val isLoading:Boolean = false,
    val coins : List<Coin> = emptyList(),
    val error: String = ""
)

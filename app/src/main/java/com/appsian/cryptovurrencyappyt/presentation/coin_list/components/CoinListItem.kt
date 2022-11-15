package com.appsian.cryptovurrencyappyt.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.appsian.cryptovurrencyappyt.domain.model.Coin

@Composable
fun CoinListItem(
    coin: Coin,
    onItemClicked: (Coin) -> Unit
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { onItemClicked(coin) }
        .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween) {

        Text(text = "${coin.rank}. ${coin.name} (${coin.symbol})",
        style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Ellipsis
        )
        val t = if(coin.is_active) "active" else "inactive"
        Text(
            text = if(coin.is_active) "active" else "inactive",
            modifier = Modifier.align(CenterVertically),
            color = if (coin.is_active) Color.Green else Color.Red,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.bodySmall,
        )
    }
}
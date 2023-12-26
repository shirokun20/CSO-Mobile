package com.cso.mobile.features.takeChair.presentation.contentChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TakeChairColorCard() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TakeChairColorInfo(
            color = Color(0xFF33CDCD),
            modifier = Modifier.weight(2f),
            title = "Kursi dipilih"
        )
        TakeChairColorInfo(
            color = Color(0xFFE67273),
            modifier = Modifier.weight(2f),
            title = "Sudah Dibayar"
        )
        TakeChairColorInfo(
            color = Color(0xFF6CA0E9),
            modifier = Modifier.weight(2f),
            title = "Booked"
        )
        TakeChairColorInfo(
            color = Color(0xFFC3C3C3),
            modifier = Modifier.weight(1f),
            title = "Kursi Kosong"
        )
    }
    Spacer(modifier = Modifier.height(10.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TakeChairColorInfo(
            color = Color(0xFF41C3FF),
            modifier = Modifier.weight(2f),
            title = "Diakses CSO Lain"
        )
        TakeChairColorInfo(
            color = Color(0xFFAED582),
            modifier = Modifier.weight(2f),
            title = "Booked Transit"
        )
        TakeChairColorInfo(
            color = Color(0xFF6A00FF),
            modifier = Modifier.weight(2f),
            title = "Sold Transit"
        )
        TakeChairColorInfo(
            color = Color(0xFFF940FD),
            modifier = Modifier.weight(1f),
            title = "Multiple"
        )
    }
}

@Composable
fun TakeChairColorInfo(
    color: Color,
    modifier: Modifier,
    title: String = ""
) {
    Box(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .background(color = color)
                    .height(11.dp)
                    .width(11.dp),
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                )
            )
        }
    }
}
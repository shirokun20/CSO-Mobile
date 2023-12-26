package com.cso.mobile.features.takeChair.presentation.headerChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.ui.theme.BgBawahColor

@Composable
fun TakeChairInfo() {
    Box(
        modifier = Modifier
            .clip(
                shape = RoundedCornerShape(6.dp),
            )
            .background(
                color = BgBawahColor,
                shape = RoundedCornerShape(6.dp),
            )
//            .clickable(
//                onClick = {}
//            ),
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "18:00",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFFFFFFFF),
                )
            )
            Spacer(modifier = Modifier.width(14.dp))
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Bima - Merak",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "BMA-MRT-SBY-JKT / Executive",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Bima-Dompu-Sumbawa-Mataram-BaliBanyu",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }
        }
    }
}
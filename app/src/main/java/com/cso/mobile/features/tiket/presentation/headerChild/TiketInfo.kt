package com.cso.mobile.features.tiket.presentation.headerChild

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
import androidx.navigation.NavBackStackEntry
import com.cso.mobile.ui.theme.BgBawahColor

@Composable
fun TiketInfo(entry: NavBackStackEntry) {
    val rute = entry.arguments?.getString("rute") ?: ""
    val dr = entry.arguments?.getString("dr") ?: ""
    val layanan = entry.arguments?.getString("layanan") ?: ""
    val list_outlet_transit = entry.arguments?.getString("list_outlet_transit") ?: ""
    val jam = entry.arguments?.getString("jam") ?: ""
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
                text = jam,
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
                    text = rute.lowercase().split(" ")
                        .joinToString(" ") { it.replaceFirstChar { it.uppercase() } },
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "${dr} / ${layanan}",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = list_outlet_transit.lowercase().split("-")
                        .joinToString("-") { it.replaceFirstChar { it.uppercase() } },
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
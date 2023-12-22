package com.cso.mobile.features.armada.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.R
import com.cso.mobile.ui.theme.BgBawahColor


@Composable
fun ArmadaAsalTujuan() {
    Row(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
    ) {
        ArmadaCustomSelect(title = "Asal Kota", modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.width(20.dp))
        ArmadaCustomSelect(title = "Tujuan Kota", modifier = Modifier.weight(1f))
    }
}

@Composable
fun ArmadaCustomSelect(title: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(
                shape = RoundedCornerShape(100.dp),
            )
            .background(
                color = BgBawahColor,
                shape = RoundedCornerShape(100.dp),
            )
            .clickable(
                onClick = {}
            ),
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                ),
            )
            Image(
                modifier = Modifier
                    .height(16.dp)
                    .width(16.dp),
                painter = painterResource(id = R.drawable.down_arrow_icon),
                contentDescription = null,
            )
        }
    }
}
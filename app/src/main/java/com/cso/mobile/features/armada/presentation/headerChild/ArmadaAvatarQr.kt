package com.cso.mobile.features.armada.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
fun ArmadaAvatarQr() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .height(38.dp)
                    .width(38.dp)
                    .clip(
                        shape = CircleShape
                    )
                    .clickable(onClick = {}),
                painter = painterResource(id = R.drawable.profile_circle),
                contentDescription = null,
            )
            Text(
                text = "Virna",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                ),
            )
        }
        Box(
            modifier = Modifier
                .background(
                    color = BgBawahColor,
                    shape = CircleShape,
                )
                .clip(shape = CircleShape)
                .height(38.dp)
                .width(38.dp)
                .clickable(onClick = {}), contentAlignment = Alignment.Center
        ) {
            Image(
                modifier = Modifier
                    .width(22.dp)
                    .height(22.dp),
                painter = painterResource(id = R.drawable.qr_icon),
                contentDescription = null,
            )
        }
    }
}
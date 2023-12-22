package com.cso.mobile.features.armada.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
fun ArmadaDatePicker() {
    Box(
        modifier = Modifier
            .padding(top = 24.dp)
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
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .height(18.dp)
                    .width(19.dp),
                painter = painterResource(id = R.drawable.calendar),
                contentDescription = null,
            )
            Text(
                text = "Kamis, 07 Sep 2023",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFFFFFFF),
                ),
            )
        }
    }
}
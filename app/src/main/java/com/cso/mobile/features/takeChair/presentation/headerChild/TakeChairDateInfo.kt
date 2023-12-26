package com.cso.mobile.features.takeChair.presentation.headerChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.ui.theme.BgBawahColor


@Composable
fun TakeChairDateInfo(data: String) {
    Box(
        modifier = Modifier
            .clip(
                shape = RoundedCornerShape(100.dp),
            )
            .background(
                color = BgBawahColor,
                shape = RoundedCornerShape(100.dp),
            )
//            .clickable(
//                onClick = onClick
//            ),
    ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = data,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
            ),
        )
    }
}
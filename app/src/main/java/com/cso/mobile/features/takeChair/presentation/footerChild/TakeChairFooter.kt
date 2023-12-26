package com.cso.mobile.features.takeChair.presentation.footerChild

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TakeChairFooter() {
    Box(
        modifier = Modifier
            .background(
                color = Color.White
            )
            .padding(10.dp)
    ) {
        Column {
            Row {
                TakeChairFBTN(modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 5.dp),
                    isBtnBorder = true,
                    title = "Cetak Manifest",
                    onClick = {})
                TakeChairFBTN(modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 5.dp),
                    isBtnBorder = false,
                    title = "Go Show",
                    onClick = {})
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun TakeChairFBTN(
    modifier: Modifier,
    isBtnBorder: Boolean = false,
    title: String = "",
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .clickable(onClick = onClick)
            .border(
                border = BorderStroke(1.dp, Color(0xFFB88A2F)), shape = RoundedCornerShape(4.dp)
            )
            .background(
                color = if (isBtnBorder) Color.White else Color(0xFFB88A2F),
                shape = RoundedCornerShape(4.dp)
            )
            .padding(10.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = title,
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = if (!isBtnBorder) Color.White else Color(0xFFB88A2F),
            )
        )
    }
}
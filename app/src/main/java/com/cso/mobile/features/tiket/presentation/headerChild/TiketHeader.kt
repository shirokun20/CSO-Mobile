package com.cso.mobile.features.tiket.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.R
import com.cso.mobile.ui.theme.BgAtas1Color
import com.cso.mobile.ui.theme.BgAtas2Color
import com.cso.mobile.ui.theme.BgBawahColor

@Composable
fun TiketHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        BgAtas1Color, BgAtas2Color
                    )
                )
            ),
    ) {
        Column(
            modifier = Modifier
                .padding(
                    top = 50.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 20.dp,
                )
        ) {
            TiketBackHeader()
            Spacer(modifier = Modifier.height(10.dp))
            TiketDateInfo(
                data = "Kamis, 07 Sep 2023",
                onClick = {}
            )
            Spacer(modifier = Modifier.height(10.dp))
            TiketInfo()
        }
    }
}
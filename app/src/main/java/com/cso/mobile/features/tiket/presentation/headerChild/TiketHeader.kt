package com.cso.mobile.features.tiket.presentation.headerChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.cso.mobile.ui.theme.BgAtas1Color
import com.cso.mobile.ui.theme.BgAtas2Color

@Composable
fun TiketHeader(navController: NavHostController) {
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
            TiketBackHeader(navController)
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
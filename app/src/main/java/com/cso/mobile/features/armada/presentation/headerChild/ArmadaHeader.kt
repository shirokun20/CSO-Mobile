package com.cso.mobile.features.armada.presentation.headerChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.cso.mobile.ui.theme.BgAtas1Color
import com.cso.mobile.ui.theme.BgAtas2Color

@Composable
fun ArmadaHeader() {
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
            modifier = Modifier.padding(
                top = 50.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = 20.dp,
            )
        ) {
            // Avater, Name, QR
            ArmadaAvatarQr()
            // Datepicker
            ArmadaDatePicker()
            // Search
            AramadaSearch()
            // Asal dan Tujuan
            ArmadaAsalTujuan()
        }
    }
}
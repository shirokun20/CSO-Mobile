package com.cso.mobile.features.report.presentation.headerChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cso.mobile.features.report.viewModel.ReportViewModel
import com.cso.mobile.ui.theme.BgAtas1Color
import com.cso.mobile.ui.theme.BgAtas2Color

@Composable
fun ReportHeader(reportViewModel: ReportViewModel = viewModel()) {
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
            // Info
            ReportInfo()
            // Info Penjualan Offline
            ReportPenjualanHeader(
                dataSample = reportViewModel.sampleDataOffline,
                title = "Penjualan Offline"
            )
            // Info Penjualan Online
            ReportPenjualanHeader(
                dataSample = reportViewModel.sampleDataOnline,
                title = "Penjualan Online"
            )
        }
    }
}
package com.cso.mobile.features.report.presentation.contentChild

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cso.mobile.features.report.model.ReportDataModel
import com.cso.mobile.features.report.viewModel.ReportViewModel
import com.cso.mobile.ui.theme.FAF2E4Color

@Composable
fun ReportContent(reportViewModel: ReportViewModel = viewModel()) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(
                color = FAF2E4Color
            )
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            ReportCard(reportViewModel = reportViewModel)
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun ReportCard(reportViewModel: ReportViewModel) {
    Box(
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
            .border(
                border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                shape = RoundedCornerShape(6.dp)
            )
            .background(color = Color.White, shape = RoundedCornerShape(size = 6.dp))
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = "Malang/Surabaya - JKT / Executive Via Trans Jawa",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            ReportTableContent(
                dataSample = reportViewModel.sampleContentOffline,
                title = "Penjualan Offline"
            )
            Spacer(modifier = Modifier.height(10.dp))
            ReportTableContent(
                dataSample = reportViewModel.sampleContentOnline,
                title = "Penjualan Online"
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(size = 4.dp))
                    .clickable(
                        onClick = {}
                    )
                    .background(color = Color(0xFFB88A2F), shape = RoundedCornerShape(size = 4.dp))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Download",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun ReportTableContent(dataSample: List<ReportDataModel> = emptyList(), title: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = Color.Black,
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                ReportTableTitleContent(
                    title = "Tiket",
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 10.dp)
                )
                ReportTableTitleContent(
                    title = "Total",
                    modifier = Modifier
                        .weight(2f)
                        .padding(end = 10.dp)
                )
                ReportTableTitleContent(
                    title = "Komisi",
                    modifier = Modifier
                        .weight(2f)
                        .padding(end = 10.dp)
                )
                ReportTableTitleContent(title = "Setoran", modifier = Modifier.weight(2f))
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
                    .height(1.dp)
                    .background(color = Color(0xFFD7E0E2))
            )
            if (dataSample.isNotEmpty()) {
                dataSample.forEach { item: ReportDataModel ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        ReportTableTitleContent(
                            title = "${item.tiket}",
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 10.dp)
                        )
                        ReportTableTitleContent(
                            title = "${item.total}",
                            modifier = Modifier
                                .weight(2f)
                                .padding(end = 10.dp)
                        )
                        ReportTableTitleContent(
                            title = "${item.komisi}",
                            modifier = Modifier
                                .weight(2f)
                                .padding(end = 10.dp)
                        )
                        ReportTableTitleContent(
                            title = "${item.setoran}",
                            modifier = Modifier.weight(2f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ReportTableTitleContent(title: String, modifier: Modifier) {
    Box(
        modifier = modifier,
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color.Black,
            )
        )
    }
}
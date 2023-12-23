package com.cso.mobile.features.report.presentation.headerChild

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.features.report.model.ReportDataModel
import com.cso.mobile.ui.theme.BgBawahColor

@Composable
fun ReportPenjualanHeader(
    dataSample: List<ReportDataModel> = emptyList(),
    title: String,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
            .background(
                color = BgBawahColor,
                shape = RoundedCornerShape(6.dp),
            )
    ) {
        Column(
            modifier = Modifier.padding(10.dp),
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFFFFFFF),
                )
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        border = BorderStroke(1.dp, Color(0xFFFFFFFF)),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 10.dp, start = 10.dp, end = 10.dp)
                        .fillMaxWidth(),

                    ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        ReportTableTitle(
                            title = "Tiket",
                            modifier = Modifier
                                .weight(1f)
                                .padding(end = 10.dp)
                        )
                        ReportTableTitle(
                            title = "Total",
                            modifier = Modifier
                                .weight(2f)
                                .padding(end = 10.dp)
                        )
                        ReportTableTitle(
                            title = "Komisi",
                            modifier = Modifier
                                .weight(2f)
                                .padding(end = 10.dp)
                        )
                        ReportTableTitle(title = "Setoran", modifier = Modifier.weight(2f))
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 10.dp)
                            .height(1.dp)
                            .background(color = Color.White)
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
                                ReportTableTitle(
                                    title = "${item.tiket}",
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(end = 10.dp)
                                )
                                ReportTableTitle(
                                    title = "${item.total}",
                                    modifier = Modifier
                                        .weight(2f)
                                        .padding(end = 10.dp)
                                )
                                ReportTableTitle(
                                    title = "${item.komisi}",
                                    modifier = Modifier
                                        .weight(2f)
                                        .padding(end = 10.dp)
                                )
                                ReportTableTitle(
                                    title = "${item.setoran}",
                                    modifier = Modifier.weight(2f)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ReportTableTitle(title: String, modifier: Modifier) {
    Box(
        modifier = modifier,
    ) {
        Text(
            text = title,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFFFFFFF),
            )
        )
    }
}
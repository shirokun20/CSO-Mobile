package com.cso.mobile.features.tiket.presentation.contentChild

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cso.mobile.features.report.viewModel.ReportViewModel
import com.cso.mobile.ui.theme.FAF2E4Color
import com.cso.mobile.ui.theme.KuningGelapColor

@Composable
fun TiketContent(reportViewModel: ReportViewModel = viewModel()) {
    var selectedTabIndex by remember { mutableStateOf(0) }
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
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            TiketTabs(
                selectedTabIndex = selectedTabIndex,
                onClick = { value -> selectedTabIndex = value }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TiketTabContent(selectedTabIndex = selectedTabIndex)
        }
    }
}

@Composable
fun TiketTabs(
    selectedTabIndex: Int,
    onClick: (selectedTabIndex: Int) -> Unit,
) {
    val tabs = listOf("Tiket", "Paket", "Manifest")
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(size = 4.dp))
            .border(
                border = BorderStroke(
                    width = 1.dp, Color(0xFFD7E0E3),
                ),
                shape = RoundedCornerShape(size = 4.dp)
            )
            .background(
                color = Color.White, shape = RoundedCornerShape(size = 4.dp)
            ),
        contentColor = Color(0xFFB88A2F),
        indicator = { unit -> },
        divider = {}
    ) {
        tabs.forEachIndexed { index, title ->
            Tab(
                modifier = Modifier
                    .background(color = if (selectedTabIndex == index) KuningGelapColor else Color.White)
                    .border(
                        border = BorderStroke(
                            width = if (selectedTabIndex == index) 2.dp else 0.dp,
                            color = if (selectedTabIndex == index) KuningGelapColor else Color(
                                0xFFD7E0E3
                            )
                        ),
                    ),
                selected = selectedTabIndex == index,
                onClick = { onClick(index) },
            ) {
                Box(modifier = Modifier.padding(vertical = 6.dp)) {
                    Text(
                        text = title, style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(600),
                            color = if (selectedTabIndex == index) Color(0xFFFFFFFF) else Color.Black,
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun TiketTabContent(
    selectedTabIndex: Int,
) {
    when (selectedTabIndex) {
        0 -> TiketTab1()
        1 -> {}
        2 -> {
            Text(
                text = "Comming Soon", style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight(600),
                    color = Color.Black,
                )
            )
        }
    }
}


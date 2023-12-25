package com.cso.mobile.features.armada.presentation.contentChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cso.mobile.ui.theme.FAF2E4Color

@Composable
fun ArmadaContent(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(
                color = FAF2E4Color
            )
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
        ) {
            Text(
                modifier = Modifier.padding(top = 20.dp),
                text = "Rute", style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )
            Column(
                modifier = Modifier.verticalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                ArmadaItem(
                    jam = "18:00",
                    asal = "Bima",
                    tujuan = "Merak",
                    layanan = "VIP",
                    onClick = {
                        navController.navigate("tiket")
                    },
                )
                repeat(4) {
                    ArmadaItem(
                        jam = "18:00",
                        asal = "Jakarta",
                        tujuan = "Bandung",
                        layanan = "VIP",
                        onClick = {
                        },
                    )
                }
            }
        }
    }
}

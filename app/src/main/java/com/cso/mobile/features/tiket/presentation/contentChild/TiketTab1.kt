package com.cso.mobile.features.tiket.presentation.contentChild

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TiketTab1() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(
            text = "Pick Up",
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        TiketTab1Card(
            title = "Kantor Tiara Mas Bima",
            jam = "18:00",
            headerWidget = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(4f)
                            .padding(end = 10.dp),
                        title = "Tujuan",
                    )
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(2f)
                            .padding(end = 10.dp),
                        title = "Harga",
                    )
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(1f),
                        title = "Kursi",
                        alignText = TextAlign.Center,
                    )
                }
            },
            contentWidget = {
                repeat(5) { index ->
                    Box(
                        modifier = Modifier
                            .border(
                                border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                                shape = RoundedCornerShape(size = 6.dp)
                            )
                            .clip(shape = RoundedCornerShape(size = 6.dp))
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(size = 6.dp)
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(4f)
                                    .padding(end = 10.dp),
                                title = "Merak",
                                fontSize = 12.sp,
                            )
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(2f)
                                    .padding(end = 10.dp),
                                title = "Rp 270.000",
                            )
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(1f),
                                title = "50",
                                alignText = TextAlign.Center,
                            )

                        }
                    }
                    if (!(index == 5 - 1)) Spacer(modifier = Modifier.height(10.dp))
                }
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TiketTab1Card(
            title = "Terminal Ginte Dompu",
            jam = "20:45",
            isBoxVisible = false,
            headerWidget = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(4f)
                            .padding(end = 10.dp),
                        title = "Pickup",
                    )
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(2f)
                            .padding(end = 10.dp),
                        title = "Harga",
                    )
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(1f),
                        title = "Kursi",
                        alignText = TextAlign.Center,
                    )
                }
            },
            contentWidget = {
                repeat(5) { index ->
                    Box(
                        modifier = Modifier
                            .border(
                                border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                                shape = RoundedCornerShape(size = 6.dp)
                            )
                            .clip(shape = RoundedCornerShape(size = 6.dp))
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(size = 6.dp)
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(4f)
                                    .padding(end = 10.dp),
                                title = "Bima - Merak",
                                fontSize = 12.sp,
                            )
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(2f)
                                    .padding(end = 10.dp),
                                title = "Rp 270.000",
                            )
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(1f),
                                title = "50",
                                alignText = TextAlign.Center,
                            )

                        }
                    }
                    if (!(index == 5 - 1)) Spacer(modifier = Modifier.height(10.dp))
                }
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TiketTab1Card(
            title = "Terminal Lorem",
            jam = "23:59",
            isBoxVisible = false,
            headerWidget = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(4f)
                            .padding(end = 10.dp),
                        title = "Pickup",
                    )
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(2f)
                            .padding(end = 10.dp),
                        title = "Harga",
                    )
                    TiketTab1Label(
                        modifier = Modifier
                            .weight(1f),
                        title = "Kursi",
                        alignText = TextAlign.Center,
                    )
                }
            },
            contentWidget = {
                repeat(5) { index ->
                    Box(
                        modifier = Modifier
                            .border(
                                border = BorderStroke(1.dp, Color(0xFFEBEEF4)),
                                shape = RoundedCornerShape(size = 6.dp)
                            )
                            .clip(shape = RoundedCornerShape(size = 6.dp))
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(size = 6.dp)
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(4f)
                                    .padding(end = 10.dp),
                                title = "Bima - Merak",
                                fontSize = 12.sp,
                            )
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(2f)
                                    .padding(end = 10.dp),
                                title = "Rp 270.000",
                            )
                            TiketTab1Item(
                                modifier = Modifier
                                    .weight(1f),
                                title = "50",
                                alignText = TextAlign.Center,
                            )

                        }
                    }
                    if (!(index == 5 - 1)) Spacer(modifier = Modifier.height(10.dp))
                }
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}
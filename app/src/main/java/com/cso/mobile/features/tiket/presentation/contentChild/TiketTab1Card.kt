package com.cso.mobile.features.tiket.presentation.contentChild

import androidx.compose.animation.AnimatedVisibility
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TiketTab1Card(
    isBoxVisible: Boolean = true,
    title: String = "",
    jam: String = "",
    headerWidget: @Composable () -> Unit,
    contentWidget: @Composable () -> Unit,
) {
    var isBoxVisible by remember { mutableStateOf(isBoxVisible) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(
                border = BorderStroke(
                    width = 1.dp, color = Color(0xFFECECEC)
                ),
                shape = RoundedCornerShape(size = 20.dp)
            )
            .background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(20.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(5.dp))
                    .clickable(
                        onClick = {
                            isBoxVisible = !isBoxVisible
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                    text = jam,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    )
                )
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF000000),
                    )
                )
            }
            AnimatedVisibility(
                visible = isBoxVisible,
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Spacer(
                        modifier = Modifier
                            .padding(vertical = 10.dp)
                            .background(color = Color(0xFFEBEEF4))
                            .height(1.dp)
                            .fillMaxWidth()
                    )
                    headerWidget()
                    Spacer(modifier = Modifier.height(10.dp))
                    contentWidget()
                }
            }
        }
    }
}

@Composable
fun TiketTab1Label(
    modifier: Modifier,
    title: String,
    alignText: TextAlign = TextAlign.Start,
) {
    Box(
        modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(),
            textAlign = alignText,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
    }
}

@Composable
fun TiketTab1Item(
    modifier: Modifier,
    title: String,
    alignText: TextAlign = TextAlign.Start,
    fontSize: TextUnit = 10.sp,
) {
    Box(
        modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(),
            textAlign = alignText,
            style = TextStyle(
                fontSize = fontSize,
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
    }
}
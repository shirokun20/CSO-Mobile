package com.cso.mobile.features.takeChair.presentation.contentChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.R
import com.cso.mobile.components.widget.ChairInfoComponent

@Composable
fun TakeChairInfo() {
    var selectedChair by remember { mutableStateOf("Kursi 1") }
    Box(
        modifier = Modifier
            .background(
                color = Color.White,
                shape = RoundedCornerShape(size = 10.dp)
            )
            .padding(10.dp),
    ) {
        Column {
            //  Supir
            Row() {
                Spacer(modifier = Modifier.weight(1f))
                TakeChairInfoItem(
                    title = "Supir",
                    isClicked = false,
                    onClick = {}
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row {
                Column {
                    Row {
                        TakeChairInfoItem(
                            title = "Kursi 1",
                            isClicked = true,
                            onClick = {
                                selectedChair = "Kursi 1"
                            },
                            imageId = if (selectedChair == "Kursi 1") ChairInfoComponent.C_DIPILIH_ICON.resourceId else ChairInfoComponent.C_KOSONG_ICON.resourceId
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        TakeChairInfoItem(
                            title = "Kursi 2",
                            isClicked = false,
                            onClick = {},
                            imageId = ChairInfoComponent.C_SD_ICON.resourceId
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        TakeChairInfoItem(
                            title = "Kursi 5A",
                            isClicked = false,
                            onClick = {},
                            imageId = ChairInfoComponent.C_CSO_ICON.resourceId
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        TakeChairInfoItem(
                            title = "Kursi 5B",
                            isClicked = false,
                            onClick = {},
                            imageId = ChairInfoComponent.C_BT_ICON.resourceId
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Column {
                    Row {
                        TakeChairInfoItem(
                            title = "Kursi 3",
                            isClicked = false,
                            onClick = {},
                            imageId = ChairInfoComponent.C_BOOKED_ICON.resourceId
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        TakeChairInfoItem(
                            title = "Kursi 4",
                            isClicked = true,
                            onClick = {
                                selectedChair = "Kursi 4"
                            },
                            imageId = if (selectedChair == "Kursi 4") ChairInfoComponent.C_DIPILIH_ICON.resourceId else ChairInfoComponent.C_KOSONG_ICON.resourceId
                        )
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row {
                        TakeChairInfoItem(
                            title = "Kursi 6A",
                            isClicked = false,
                            onClick = {},
                            imageId = ChairInfoComponent.C_ST_ICON.resourceId
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        TakeChairInfoItem(
                            title = "Kursi 6B",
                            isClicked = false,
                            onClick = {},
                            imageId = ChairInfoComponent.C_MULTIPLE_ICON.resourceId
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TakeChairInfoItem(
    imageId: Int = R.drawable.supir_icon,
    title: String = "",
    isClicked: Boolean = false,
    onClick: () -> Unit,
) {
    Column(
        modifier =
        if (isClicked) {
            Modifier
                .clip(shape = RoundedCornerShape(10.dp))
                .clickable(
                    onClick = onClick
                )
        } else Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .height(53.dp)
                .width(53.dp),
            painter = painterResource(id = imageId),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = title,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000),
            )
        )
    }
}
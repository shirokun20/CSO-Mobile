package com.cso.mobile.features.takeChair.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cso.mobile.R
import com.cso.mobile.ui.theme.BgAtas1Color
import com.cso.mobile.ui.theme.BgAtas2Color
import com.cso.mobile.ui.theme.BgBawahColor

@Composable
fun TakeChairHeader(navController: NavHostController) {
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
            TakeChairBackHeader(navController)
            Spacer(modifier = Modifier.height(10.dp))
            TakeChairDateInfo(
                data = "Kamis, 07 Sep 2023",
            )
            Spacer(modifier = Modifier.height(10.dp))
            TakeChairInfo()
            Spacer(modifier = Modifier.height(10.dp))
            TakeChairInfoRute()
        }
    }
}

@Composable
fun TakeChairInfoRute() {
    Box(
        modifier = Modifier
            .clip(
                shape = RoundedCornerShape(6.dp),
            )
            .background(
                color = BgBawahColor,
                shape = RoundedCornerShape(6.dp),
            ),
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.weight(4f)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                ) {
                    Text(
                        text = "Jakarta",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Image(
                        modifier = Modifier
                            .width(12.dp)
                            .height(12.dp),
                        painter = painterResource(id = R.drawable.right_arrow_white_icon),
                        contentDescription = "image description",
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Bandung",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFFFFFFFF),
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                modifier = Modifier.weight(2f),
                text = "Rp 270.000",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                )
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                modifier = Modifier.weight(1f),
                text = "50",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFFFFFFFF),
                )
            )
        }
    }
}
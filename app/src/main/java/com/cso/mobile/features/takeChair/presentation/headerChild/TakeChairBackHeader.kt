package com.cso.mobile.features.takeChair.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.cso.mobile.R

@Composable
fun TakeChairBackHeader(navController: NavHostController) {
    Row(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(size = 10.dp))
            .clickable(
                onClick = {
                    navController.navigateUp()
                }
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier
                .height(17.dp)
                .width(17.dp),
            painter = painterResource(id = R.drawable.ic_arrow_back),
            contentDescription = "image description",
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "Kembali",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFFFFFFF),
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
    }
}
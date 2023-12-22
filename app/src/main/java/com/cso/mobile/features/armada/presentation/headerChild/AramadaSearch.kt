package com.cso.mobile.features.armada.presentation.headerChild

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
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

@Composable
fun AramadaSearch() {
    var value by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .padding(top = 16.dp)
            .clip(
                shape = RoundedCornerShape(100.dp),
            )
            .background(
                color = Color.White,
                shape = RoundedCornerShape(100.dp),
            ),
    ) {
        BasicTextField(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp, vertical = 10.dp,
                )
                .fillMaxWidth(),
            singleLine = true,
            value = value,
            textStyle = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight(400),
            ),
            onValueChange = { text -> value = text },
            decorationBox = { innerTextField ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .height(16.dp)
                            .width(16.dp),
                        painter = painterResource(id = R.drawable.search_icon),
                        contentDescription = null,
                    )
                    if (value.isEmpty()) {
                        Text(
                            text = "Cari Kota",
                            color = Color(0xFF7D7D7D),
                            fontSize = 14.sp,
                            fontWeight = FontWeight(400),
                        )
                    } else {
                        innerTextField()
                    }
                }
            }
        )
    }
}
package com.cso.mobile.features.takeChair.presentation.contentChild

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cso.mobile.ui.theme.FAF2E4Color

@Composable
fun TakeChairContent() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }
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
            TakeChairColorCard()
            Spacer(modifier = Modifier.height(20.dp))
            TakeChairDecks(
                selectedTabIndex = selectedTabIndex,
                onClick = { item -> selectedTabIndex = item }
            )
            Spacer(modifier = Modifier.height(20.dp))
            when (selectedTabIndex) {
                0 -> TakeChairInfo()
                1 -> {
                    Text(
                        text = "Coming Soon", style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight(600),
                            color = Color.Black,
                        )
                    )
                }

                2 -> {
                    Text(
                        text = "Coming Soon", style = TextStyle(
                            fontSize = 15.sp,
                            fontWeight = FontWeight(600),
                            color = Color.Black,
                        )
                    )
                }
            }
        }
    }
}
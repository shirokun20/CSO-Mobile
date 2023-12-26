package com.cso.mobile.features.takeChair.presentation.contentChild

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TakeChairDecks(
    selectedTabIndex: Int = 0,
    onClick: (value: Int) -> Unit
) {
    Row(modifier = Modifier) {
        TakeChairDeckItem(
            title = "Deck 1",
            modifier = Modifier.weight(1f),
            isSelected = selectedTabIndex == 0,
            onClick = { onClick(0) }
        )
        Spacer(modifier = Modifier.width(4.dp))
        TakeChairDeckItem(
            title = "Deck 2",
            modifier = Modifier.weight(1f),
            isSelected = selectedTabIndex == 1,
            onClick = { onClick(1) }
        )
        Spacer(modifier = Modifier.width(4.dp))
        TakeChairDeckItem(
            title = "Deck 3",
            modifier = Modifier.weight(1f),
            isSelected = selectedTabIndex == 2,
            onClick = { onClick(2) }
        )
    }
}

@Composable
fun TakeChairDeckItem(
    title: String = "",
    modifier: Modifier,
    isSelected: Boolean = false,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(size = 4.dp))
            .clickable(
                onClick = onClick,
            )
            .background(
                color = if (isSelected) Color.White else Color(0xFFEAEAEA),
                shape = RoundedCornerShape(size = 4.dp)
            )
            .border(
                border = BorderStroke(
                    width = 1.dp,
                    color = if (isSelected) Color(0xFFB88A2F) else Color(0xFFEAEAEA),
                ),
                shape = RoundedCornerShape(size = 4.dp),
            )
            .padding(horizontal = 10.dp, vertical = 6.dp),
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = title, style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight(600),
                color = if (isSelected) Color(0xFFB88A2F) else Color(0xFF646464),
            )
        )
    }
}

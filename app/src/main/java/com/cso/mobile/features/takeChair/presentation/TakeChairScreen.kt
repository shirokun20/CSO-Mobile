package com.cso.mobile.features.takeChair.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cso.mobile.features.takeChair.presentation.contentChild.TakeChairContent
import com.cso.mobile.features.takeChair.presentation.footerChild.TakeChairFooter
import com.cso.mobile.features.takeChair.presentation.headerChild.TakeChairHeader

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TakeChairScreen(navController: NavHostController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        ) {
            TakeChairHeader(navController)
            Box(modifier = Modifier.weight(1f)) {
                TakeChairContent()
            }
            TakeChairFooter()
        }
    }
}
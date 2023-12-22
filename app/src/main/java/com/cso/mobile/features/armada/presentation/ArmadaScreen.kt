package com.cso.mobile.features.armada.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cso.mobile.features.armada.presentation.contentChild.ArmadaContent
import com.cso.mobile.features.armada.presentation.headerChild.ArmadaHeader

@Composable
fun ArmadaScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        ArmadaHeader()
        ArmadaContent()
    }
}



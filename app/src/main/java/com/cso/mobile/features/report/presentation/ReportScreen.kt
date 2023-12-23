package com.cso.mobile.features.report.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cso.mobile.features.report.presentation.contentChild.ReportContent
import com.cso.mobile.features.report.presentation.headerChild.ReportHeader

@Composable
fun ReportScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        ReportHeader()
        ReportContent()
    }
}
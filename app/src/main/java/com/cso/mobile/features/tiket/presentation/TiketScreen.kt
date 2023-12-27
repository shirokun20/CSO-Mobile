package com.cso.mobile.features.tiket.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.cso.mobile.features.tiket.presentation.contentChild.TiketContent
import com.cso.mobile.features.tiket.presentation.headerChild.TiketHeader

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TiketScreen(navController: NavHostController, entry: NavBackStackEntry) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
        ) {
            TiketHeader(navController, entry)
            TiketContent(navController)
        }
    }
}

package com.cso.mobile.components.widget

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cso.mobile.features.home.presentation.HomeScreen
import com.cso.mobile.features.tiket.presentation.TiketScreen

@Composable
fun NavigationComponent(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable(route = "tiket") {
            TiketScreen(navController = navController)
        }
    }
}
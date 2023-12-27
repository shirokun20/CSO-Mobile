package com.cso.mobile.components.widget

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.cso.mobile.features.home.presentation.HomeScreen
import com.cso.mobile.features.takeChair.presentation.TakeChairScreen
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
        composable(route = "tiket/{rute}/{dr}/{layanan}/{list_outlet_transit}/{jam}",
            arguments = listOf(
                navArgument("rute") { type = NavType.StringType },
                navArgument("dr") { type = NavType.StringType },
                navArgument("layanan") { type = NavType.StringType },
                navArgument("list_outlet_transit") { type = NavType.StringType },
                navArgument("jam") { type = NavType.StringType },
            )) { entry ->
            TiketScreen(navController = navController, entry)
        }
        composable(route = "takeChair") {
            TakeChairScreen(navController = navController)
        }
    }
}
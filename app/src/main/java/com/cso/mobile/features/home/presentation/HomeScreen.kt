package com.cso.mobile.features.home.presentation

import android.annotation.SuppressLint
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cso.mobile.R
import com.cso.mobile.features.armada.presentation.ArmadaScreen
import com.cso.mobile.ui.theme.KuningGelapColor

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavHostController,
) {
    Scaffold(
       modifier = Modifier.fillMaxSize(),
    ) {
        BottomTabLayout(navController)
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomTabLayout(navController: NavHostController) {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color(0xFFFFFFFF),
            ) {
                BottomNavigationItem(
                    icon = { Icon(
                        modifier = Modifier
                            .height(28.dp)
                            .width(28.dp),
                        painter = painterResource(R.drawable.bus_active), contentDescription = null,
                        tint = if (selectedItem == 0) { KuningGelapColor } else { Color(0xFF8C8C8C) }
                    ) },
                    label = {
                        Text("Armada", style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(600),
                            color = if (selectedItem == 0) { KuningGelapColor } else { Color(0xFF8C8C8C) },
                        ),) },
                    selected = selectedItem == 0,
                    onClick = { selectedItem = 0 },
                )
                BottomNavigationItem(
                    icon = { Icon(
                        modifier = Modifier
                            .height(28.dp)
                            .width(28.dp),
                        painter = painterResource(R.drawable.report_active), contentDescription = null,
                        tint = if (selectedItem == 1) { KuningGelapColor } else { Color(0xFF8C8C8C) }
                    ) },
                    label = {
                        Text("Report", style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(600),
                            color = if (selectedItem == 1) { KuningGelapColor } else { Color(0xFF8C8C8C) },
                        ),) },
                    selected = selectedItem == 1,
                    onClick = { selectedItem = 1 }
                )
                BottomNavigationItem(
                    icon = { Icon(
                        modifier = Modifier
                            .height(28.dp)
                            .width(28.dp),
                        painter = painterResource(R.drawable.profile_active), contentDescription = null,
                        tint = if (selectedItem == 2) { KuningGelapColor } else { Color(0xFF8C8C8C) }
                    ) },
                    label = {
                        Text("Profile", style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight(600),
                            color = if (selectedItem == 2) { KuningGelapColor } else { Color(0xFF8C8C8C) },
                        ),) },
                    selected = selectedItem == 2,
                    onClick = { selectedItem = 2 }
                )
            }
        },
    ) { innerPadding ->
    // Content of the screen goes here
        // You can replace this with your actual content
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            when(selectedItem) {
                0 -> {
                    Box(modifier = Modifier.padding(innerPadding)) {
                        ArmadaScreen(navController = navController)
                    }
                }
                1 -> Text(text = "Report")
                2 -> Text(text = "Profile")
            }
        }
    }
}
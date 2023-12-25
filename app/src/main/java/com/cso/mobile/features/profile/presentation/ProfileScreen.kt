package com.cso.mobile.features.profile.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.cso.mobile.features.profile.presentation.contentChild.ProfileContent
import com.cso.mobile.features.profile.presentation.headerChild.ProfileHeader

@Composable
fun ProfileScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        ProfileHeader()
        ProfileContent()
    }
}
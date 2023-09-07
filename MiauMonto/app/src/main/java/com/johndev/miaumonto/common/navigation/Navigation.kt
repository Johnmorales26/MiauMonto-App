package com.johndev.miaumonto.common.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.johndev.miaumonto.ui.screens.homeScreen.HomeScreen
import com.johndev.miaumonto.ui.screens.homeScreen.HomeViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.HomeScreen.route,
    ) {
        composable(Routes.HomeScreen.route) {
            //val homeViewModel = hiltViewModel<HomeViewModel>()
            HomeScreen(/*viewModel = homeViewModel*/)
        }
    }
}
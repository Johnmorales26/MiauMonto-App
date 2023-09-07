package com.johndev.miaumonto.common.navigation

sealed class Routes (val route: String) {

    object HomeScreen : Routes(route = "HomeScreen")

}
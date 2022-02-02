package com.example.kennings_android_native

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kennings_android_native.views.BrowseView
import com.example.kennings_android_native.views.HomeView

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeView()
        }
        composable(route = BottomBarScreen.Browse.route){
            BrowseView()
        }
    }
}
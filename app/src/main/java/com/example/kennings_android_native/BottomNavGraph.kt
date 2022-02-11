package com.example.kennings_android_native

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.kennings_android_native.ViewModels.BrowseViewModel
import com.example.kennings_android_native.views.*

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomBarScreen.Home.route) {

        composable(route = BottomBarScreen.Home.route){
            HomeView()
        }

        composable(route = BottomBarScreen.BrowseNavigator.route){
            BrowseNavigatorView(navController = navController)
        }

        composable(route = BottomBarScreen.AccountNavigator.route){
            AccountView(navController = navController)
        }

        composable(route = BottomBarScreen.BasketNavigator.route){
            BasketView(navController = navController)
        }

        val bm = BrowseViewModel()
        composable("Categories/{title}"){ backStackEntry ->
            backStackEntry.arguments?.getString("title")
                ?.let { BrowseView(navController = navController,it, browseViewModel = bm) }
        }
    }
}
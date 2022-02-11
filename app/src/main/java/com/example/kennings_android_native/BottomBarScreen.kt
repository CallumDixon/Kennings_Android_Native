package com.example.kennings_android_native

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object BrowseNavigator : BottomBarScreen(
        route = "browseNavigator",
        title = "Browse",
        icon = Icons.Default.List
    )

    object AccountNavigator : BottomBarScreen(
        route = "account",
        title = "Account",
        icon = Icons.Default.Person
    )

    object BasketNavigator : BottomBarScreen(
        route = "basket",
        title = "Basket",
        icon = Icons.Default.ShoppingCart
    )
}

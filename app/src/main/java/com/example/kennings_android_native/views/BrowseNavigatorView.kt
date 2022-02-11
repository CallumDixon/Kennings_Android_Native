package com.example.kennings_android_native.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.kennings_android_native.ViewModels.BrowseViewModel

val bvm = BrowseViewModel()

@Composable
fun BrowseNavigatorView(navController: NavController) {

    BrowseView(navController = navController, Title = "Categories", browseViewModel = bvm)
}